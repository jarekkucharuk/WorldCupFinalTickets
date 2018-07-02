package sda.tickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sda.tickets.model.CreditCardEntity;
import sda.tickets.model.UserEntity;

import java.util.Optional;

public interface CreditCardRepository extends JpaRepository<CreditCardEntity, String> {

    Optional<CreditCardEntity> findByNumber (String number);

}
