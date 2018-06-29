package sda.tickets.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserForm {

    String firstName;
    String lastName;
    String nick;
    String email;

}
