package sda.tickets.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import sda.tickets.model.UserEntity;
import sda.tickets.model.UserForm;
import sda.tickets.repository.UserRepository;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {


    DataValidator dataValidator = new DataValidator();
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

    @Override
    public List<UserEntity> findAll() {
        return null;
    }

    @Override
    public UserEntity findByNick(String nick) {
        return null;
    }

    @Override
    public void createUser(UserForm userForm) {

        if (dataValidator.errorsList(userForm).isEmpty()){
            UserEntity user= new UserEntity();
        user.setEmail(userForm.getEmail());
        user.setFirstName(userForm.getFirstName());
        user.setLastName(userForm.getLastName());
        user.setNick(userForm.getNick());
        user.setId(userForm.getId());

        userRepository.save(user);
        }
    }


}
