package sda.tickets.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sda.tickets.model.CreditCard;
import sda.tickets.model.User;

@Controller
@RequestMapping(path = "/home")
public class TicketOrderController {

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

    @RequestMapping("/registration")
    public String registerUser(Model model) {
        model.addAttribute("user", new User());
        return "registration";
    }

    @PostMapping(path="/registration")
    public String addUser(@ModelAttribute("user") User user){

        //cokolwiek z user podanym w form
        return "registration";
    }

}
