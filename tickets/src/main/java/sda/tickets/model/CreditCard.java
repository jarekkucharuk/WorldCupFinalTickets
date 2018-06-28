package sda.tickets.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreditCard {

    String ownerName;
    String ownerSurname;
    String number;
    String month;
    String year;
    String ccv;
    int limit;



    public CreditCard() {
    }
}
