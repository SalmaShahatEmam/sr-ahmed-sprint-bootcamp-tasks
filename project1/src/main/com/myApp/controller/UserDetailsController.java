package main.com.myApp.controller;

import main.com.myApp.model.User;
import main.com.myApp.model.UserDetails;
import main.com.myApp.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import main.com.myApp.service.userDetailsService;
import java.util.List;

@Controller
public class UserDetailsController {

    @Autowired
    public userDetailsService userService;


    @RequestMapping("/userdetails")
    public String userDetails(Model model) {
        model.addAttribute("user", new UserDetails());
        return "userdetails";
    }

    @RequestMapping("/userdetails/store-user-details")
    public String processForm(@ModelAttribute("userModel") UserDetails userModel, Model model)
    {
        this.userService.save(userModel);
        model.addAttribute("userModelResult" , userModel);

        return "userDetailsResultPage";
    }
}
