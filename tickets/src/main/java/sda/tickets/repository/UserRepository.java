package sda.tickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sda.tickets.model.UserEntity;
import sda.tickets.model.UserForm;

import java.util.Optional;

public interface UserRepository extends JpaRepository <UserEntity, Long> {

    Optional <UserEntity> findByNick (String nick);

}