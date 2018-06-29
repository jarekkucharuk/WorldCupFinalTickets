package sda.tickets.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sda.tickets.model.UserForm;
import sda.tickets.service.UserService;

@Controller
@RequestMapping(path = "/home")
public class TicketOrderController {

    private final UserService userService;

    public TicketOrderController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("")
    public String loadHome() {
        return "home";
    }

    @RequestMapping("/userData")
    public String addCreditCard() {
        return "userData";
    }

    @RequestMapping("/login")
    public String orderTickets() {
        return "login";
    }

    @RequestMapping("/availableTickets")
    public String displayAvailableTickets() {
        return "availableTickets";
    }

    @GetMapping("/registration")
    public String registerUser(Model model) {
        model.addAttribute("userForm", new UserForm());
        return "addUser";
    }

    @PostMapping(path="/registration")
    public String addUser(@ModelAttribute("userForm") UserForm userForm,
                          Model model){

        userService.createUser(userForm);
        return "login";
    }

}
