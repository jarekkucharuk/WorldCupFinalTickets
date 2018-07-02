package sda.tickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sda.tickets.model.CreditCardEntity;

import java.util.Optional;

public interface CreditCardEntityRepository extends JpaRepository<CreditCardEntity, String> {

    Optional<CreditCardEntity> findByNumber(String number);

}
