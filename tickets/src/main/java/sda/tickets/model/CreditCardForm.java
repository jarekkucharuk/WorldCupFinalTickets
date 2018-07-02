package sda.tickets.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreditCardForm {

    String nick;
    String firstName;
    String lastName;
    int number;
    int month;
    int year;
    String ccv;
    int limit;

    public CreditCardForm() {
    }
}
