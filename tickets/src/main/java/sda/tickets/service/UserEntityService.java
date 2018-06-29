package sda.tickets.service;

import sda.tickets.model.UserEntity;
import sda.tickets.model.UserForm;

import java.util.List;

public interface UserEntityService {

    List<UserEntity> findAll();
    UserEntity findById (Long id);
    void create (UserForm userForm);
}
