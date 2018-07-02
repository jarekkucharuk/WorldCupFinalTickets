package sda.tickets.service;

import sda.tickets.model.CreditCardEntity;
import sda.tickets.model.CreditCardForm;
import sda.tickets.model.UserEntity;
import sda.tickets.model.UserForm;

import java.util.List;

public interface CreditCardService {

    List<CreditCardEntity> findAll();
    CreditCardEntity findByNumber(String number);

    void createCreditCard(CreditCardForm creditCardForm) ;
}
