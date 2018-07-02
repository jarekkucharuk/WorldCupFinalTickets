package sda.tickets.service;

import sda.tickets.model.CreditCardEntity;
import sda.tickets.model.CreditCardForm;
import sda.tickets.repository.CreditCardRepository;

import java.util.List;
import java.util.Optional;

public class CreditCardEntityServiceImpl implements CreditCardEntityService {

    private final CreditCardRepository creditCardRepository;

    public CreditCardEntityServiceImpl(CreditCardRepository creditCardRepository) {
        this.creditCardRepository = creditCardRepository;
    }

    @Override
    public List<CreditCardEntity> findAll() {
        return creditCardRepository.findAll();
    }

    @Override
    public Optional findByNumber(String number) {
        return creditCardRepository.findByNumber(number);
    }

    @Override
    public void createCreditCard(CreditCardForm creditCardForm) {

    }


}
