package sda.tickets.service;

import org.springframework.security.core.userdetails.User;
import sda.tickets.model.UserEntity;
import sda.tickets.model.UserForm;
import java.util.List;

public interface UserService {

    List<UserEntity> findAll();
    User findByUsername(String nick);

    void createUser(UserForm userForm) ;
}
