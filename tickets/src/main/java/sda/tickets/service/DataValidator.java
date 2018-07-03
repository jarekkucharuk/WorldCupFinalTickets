package sda.tickets.service;

import lombok.NoArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import sda.tickets.model.UserForm;
import org.apache.commons.validator.routines.EmailValidator;
import sda.tickets.repository.UserRepository;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@NoArgsConstructor
public class DataValidator {

    UserForm userForm= new UserForm();
    private  UserRepository userRepository;
    private  PasswordEncoder passwordEncoder;

    final ValidatorFactory validatorFactory = Validation
            .buildDefaultValidatorFactory();
    final Validator validator = validatorFactory.getValidator();

    public DataValidator(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public List<String> errorsList (UserForm userForm){

        final Set <ConstraintViolation<UserForm>> errors = validator.validate(userForm);

        return errors.stream().map(cv -> cv.getMessage()).collect(Collectors.toList());
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
    }
}
