package sda.tickets.service;

import org.springframework.stereotype.Service;
import sda.tickets.model.CreditCardEntity;
import sda.tickets.model.CreditCardForm;
import sda.tickets.model.UserEntity;
import sda.tickets.model.UserForm;
import sda.tickets.repository.CreditCardRepository;

import java.util.List;

@Service
public class CreditCardServiceImpl implements CreditCardService {

    private final CreditCardRepository creditCardRepository;

    public CreditCardServiceImpl(CreditCardRepository creditCardRepository) {
        this.creditCardRepository = creditCardRepository;
    }

    @Override
    public List<CreditCardEntity> findAll() {
        return null;
    }

    @Override
    public CreditCardEntity findByNumber(String number) {
        return null;
    }

    @Override
    public void createCreditCard(CreditCardForm creditCardForm) {
        CreditCardEntity creditCardEntity = new CreditCardEntity();

        creditCardEntity.setNick(creditCardForm.getNick());
        creditCardEntity.setFirst_name(creditCardForm.getFirstName());
        creditCardEntity.setLast_name(creditCardForm.getLastName());
        creditCardEntity.setCcv(creditCardForm.getCcv());
        creditCardEntity.setNumber(creditCardForm.getNumber());
        creditCardEntity.setExp_month(creditCardForm.getMonth());
        creditCardEntity.setExp_year(creditCardForm.getYear());
        creditCardEntity.setAmount(creditCardForm.getLimit());

        creditCardRepository.save(creditCardEntity);
    }
}
