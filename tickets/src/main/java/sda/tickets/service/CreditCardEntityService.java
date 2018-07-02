package sda.tickets.service;

import sda.tickets.model.CreditCardEntity;
import sda.tickets.model.CreditCardForm;

import java.util.List;
import java.util.Optional;

public interface CreditCardEntityService {

    List<CreditCardEntity> findAll();
    Optional findByNumber (String number);
    void createCreditCard (CreditCardForm creditCardForm);
}
