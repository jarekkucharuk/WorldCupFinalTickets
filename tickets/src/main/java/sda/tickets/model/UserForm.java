package sda.tickets.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Valid
@Data
@AllArgsConstructor
public class UserForm {

    @NotEmpty
    String firstName;
    @NotEmpty
    String lastName;
    @NotEmpty
    String nick;
    @Email
    String email;
    @NotEmpty
    String password1;
    @NotEmpty
    String password2;
    String id;

    public UserForm(){
    }

}
