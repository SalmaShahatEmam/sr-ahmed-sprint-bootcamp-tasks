package main.com.myApp.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Data
@Component
public class UserDetails {
    public String role;
    public String password;
    public String city;
    public String programming_lang;
    public List<String> os = new ArrayList<>();
}
