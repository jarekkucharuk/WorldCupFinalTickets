package sda.tickets.mvccontroller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sda.tickets.service.UserEntityService;

@RequestMapping("/mvc/users")
public class MvcUserEntityController {

    private final UserEntityService userEntityService;

    public MvcUserEntityController(UserEntityService userEntityService) {
        this.userEntityService = userEntityService;
    }

    @GetMapping (path = "/all")
    public String findAll(Model model){
        model.addAttribute("users", userEntityService.findAll());
        return "usersList";
    }
}
