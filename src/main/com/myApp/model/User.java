package main.com.myApp.model;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.sql.Date;


@Data
@Component
public class User {

    public String firstName ;
    public String lastName ;
    public String email;
    public Date date_of_birth;
    public String city;

}
