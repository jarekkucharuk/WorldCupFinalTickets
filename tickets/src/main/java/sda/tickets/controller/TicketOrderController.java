package sda.tickets.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sda.tickets.model.CreditCardForm;
import sda.tickets.model.LoginForm;
import sda.tickets.model.UserForm;
import sda.tickets.service.CreditCardService;
import sda.tickets.service.DataValidator;
import sda.tickets.service.UserService;
import java.util.List;

@Controller
@RequestMapping(path = "/home")
public class TicketOrderController {

    DataValidator dataValidator = new DataValidator();
    private final UserService userService;
    private final CreditCardService creditCardService;

    public TicketOrderController(UserService userService, CreditCardService creditCardService) {
        this.userService = userService;
        this.creditCardService = creditCardService;
    }

    @RequestMapping("")
    public String loadHome() {
        return "home";
    }

    @GetMapping("/login")
        public String loginUser(){
            return "login";
    }

//    @RequestMapping("/login")
//    public String loginView(){
//        return "userData";
//    }

    @GetMapping("/userData")
    public String addCreditCard() {
        return "userData";
    }

    @RequestMapping("/availableTickets")
    public String displayAvailableTickets() {
        return "availableTickets";
    }

    @GetMapping(path= "/registration")
    public String registerUser(Model model) {
        model.addAttribute("userForm", new UserForm());
        return "addUser";
    }

    @PostMapping(path="/registration")
    public String addUser(@ModelAttribute("userForm") UserForm userForm,
                          Model model){
        List<String> error =dataValidator.createErrors(userForm);
        if (error.isEmpty()) {
            userService.createUser(userForm);
            return "login";
        }
        model.addAttribute("createError",error);
        return "addUser";
    }

    @GetMapping(path= "/addCreditCard")
    public String registerCreditCard(Model model){
        model.addAttribute("creditCardForm", new CreditCardForm());
        return "addCreditCard";
    }
    @PostMapping (path = "/addCreditCard")
    public String addCreditCard(@ModelAttribute("creditCardForm") CreditCardForm creditCardForm,
                                Model model){
        creditCardService.createCreditCard(creditCardForm);
        return "userData";
    }

}
