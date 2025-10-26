package main.com.myApp.model;

import lombok.Data;
import main.com.myApp.Validation.confirmed;
import org.springframework.stereotype.Component;

import javax.validation.constraints.*;
import java.sql.Date;


@Data
@Component
@confirmed
public class User {

    @NotBlank(message = "first name is required !")
    @Size(min=3 , message ="name must be more than 3 letters !")
    private String firstName ;

    @NotNull(message = "first name is required !")
    @Size(min=3 , message ="name must be more than 3 letters !")
    private String lastName ;

    @Email
    @NotBlank(message = "email is required !")
    private String email;

    @NotNull(message = "password is required !")
    private String password;

    @NotBlank(message = "password confirmation is required !")
    private String password_confirmed;

    private String city;
    private Date date_of_birth;
}
