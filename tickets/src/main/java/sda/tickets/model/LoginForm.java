package sda.tickets.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

@Valid
@Data
@AllArgsConstructor
public class LoginForm {

    @NotEmpty
    String username;
    @NotEmpty
    String password;

    public LoginForm(){

    }
}
