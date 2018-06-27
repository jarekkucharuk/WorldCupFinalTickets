package sda.tickets.model;

import lombok.Data;

@Data
//@NoArgsConstructor
public class CreditCard {

    String ownerName;
    String ownerSurname;
    String number;
    String month;
    String year;
    String ccv;

    public CreditCard(String owner, String number, String month, String year, String ccv) {
        this.ownerName = ownerName;
        this.ownerSurname = ownerSurname;
        this.number = number;
        this.month = month;
        this.year = year;
        this.ccv = ccv;
    }
}
