package sda.tickets.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class User {

    String name;
    String surname;
    String password;
    String nick;
    String email;

    public User() {
    }
}
