package sda.tickets.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import sda.tickets.model.UserEntity;
import sda.tickets.model.UserForm;
import sda.tickets.repository.UserRepository;

import java.util.*;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {


    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    DataValidator dataValidator = new DataValidator();

    public UserServiceImpl(PasswordEncoder passwordEncoder, UserRepository userRepository) {
        this.passwordEncoder = passwordEncoder;
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
    public User findByNick(String nick) {
        UserEntity userEntity = new UserEntity();
        User user = new User(userEntity.getNick(), userEntity.getPassword()
                , true, true, true, true, getAuthorities());
        return user;
    }

    public List<GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorityList = new ArrayList<GrantedAuthority>();
        authorityList.add(new SimpleGrantedAuthority("ROLE_USER"));
        authorityList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        return authorityList;
    }

    @Override
    public void createUser(UserForm userForm) {

        if (dataValidator.createErrors(userForm).isEmpty()
                && userForm.getPassword1().equals(userForm.getPassword2())) {
            UserEntity userEntity = new UserEntity();

            userEntity.setEmail(userForm.getEmail());
            userEntity.setFirstName(userForm.getLastName());
            userEntity.setLastName(userForm.getLastName());
            userEntity.setNick(userForm.getNick());
            userEntity.setPassword(passwordEncoder.encode(userForm.getPassword1()));

            userRepository.save(userEntity);
        }
    }
}
