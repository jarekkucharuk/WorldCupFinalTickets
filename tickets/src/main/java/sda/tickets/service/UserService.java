package sda.tickets.service;

import sda.tickets.model.UserEntity;
import sda.tickets.model.UserForm;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<UserEntity> findAll();
    UserEntity findByNick(String nick);

    void createUser(UserForm userForm) ;
}
