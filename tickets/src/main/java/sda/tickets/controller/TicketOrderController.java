package sda.tickets.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(path = "/home")
public class TicketOrderController {

    @RequestMapping("")
    public String loadHome() {
        return "home";
    }

    @RequestMapping("/registration")
    public String addUser() {
        return "registration";
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


}
