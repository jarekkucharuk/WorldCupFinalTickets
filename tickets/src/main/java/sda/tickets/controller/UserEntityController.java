package sda.tickets.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sda.tickets.model.UserEntity;
import sda.tickets.service.UserEntityService;

import java.util.List;

@RestController
@RequestMapping(path = "/home")
public class UserEntityController {

    private final UserEntityService userEntityService;

    public UserEntityController(UserEntityService userEntityService) {
        this.userEntityService = userEntityService;
    }

    @GetMapping
    public List<UserEntity> findAll(){
        return userEntityService.findAll();
    }

    @GetMapping (path="/{id}")
    public UserEntity findById(@PathVariable Long id){
        return userEntityService.findById(id);
    }
}
