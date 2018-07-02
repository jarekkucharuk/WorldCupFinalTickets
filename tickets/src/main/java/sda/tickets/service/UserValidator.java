package sda.tickets.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import sda.tickets.model.UserForm;
import org.apache.commons.validator.routines.EmailValidator;
import sda.tickets.repository.UserRepository;

import java.awt.*;
import java.util.Optional;

public class UserValidator {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserValidator(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    private final EmailValidator emailValidator=EmailValidator.getInstance();

    private boolean validateEmail(String email){
        return emailValidator.isValid(email)
                && !userRepository.findByEmail(email).isPresent();
    }

    private Optional<String> validateDataForm (UserForm userForm){
        if(!validateFirstName(userForm.getFirstName())){
            return Optional.of("Niewłaściwe imię");
        }
        return Optional.empty();
    }

    private boolean validateFirstName(String firstName){
        firstName=firstName.trim();
        return !firstName.equals("");
    }
    private boolean validateLastName(String lastName){
        lastName=lastName.trim();
        return !lastName.equals("");
    }}
