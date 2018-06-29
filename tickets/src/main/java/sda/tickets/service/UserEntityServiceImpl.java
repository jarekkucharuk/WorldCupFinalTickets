package sda.tickets.service;

import org.springframework.stereotype.Service;
import sda.tickets.exception.UserEntityNotFoundException;
import sda.tickets.model.UserEntity;
import sda.tickets.model.UserForm;
import sda.tickets.repository.UserEntityRepository;

import java.util.List;

@Service
public class UserEntityServiceImpl implements UserEntityService {

    private final UserEntityRepository userEntityRepository;

    public UserEntityServiceImpl(UserEntityRepository userEntityRepository) {
        this.userEntityRepository = userEntityRepository;
    }

    @Override
    public List<UserEntity> findAll() {
        return userEntityRepository.findAll();
    }

    @Override
    public UserEntity findById(Long id) {
        return userEntityRepository.findById(id)
                .orElseThrow(UserEntityNotFoundException::new);
    }

    @Override
    public void create(UserForm userForm) {

        UserEntity userEntity = new UserEntity();

        userEntity.setFirstName(userForm.getFirstName());
        userEntity.setLastName(userForm.getLastName());
        userEntity.setNick(userForm.getNick());
        userEntity.setEmail(userForm.getEmail());

        userEntityRepository.save(userEntity);

    }
}
