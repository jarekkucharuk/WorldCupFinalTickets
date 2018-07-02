package sda.tickets.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "credit_cards")
public class CreditCardEntity {

    @Id
    private String nick;

    private String first_name;
    private String last_name;
    private String ccv;
    private int number;
    private int exp_month;
    private int exp_year;
    private int amount;
}
