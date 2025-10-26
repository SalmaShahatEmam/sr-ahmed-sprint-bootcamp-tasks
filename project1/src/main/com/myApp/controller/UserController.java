package main.com.myApp.controller;


import main.com.myApp.model.User;
import main.com.myApp.model.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import main.com.myApp.service.userService;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@Controller
public class UserController {


    @Autowired
    public userService userService;

    @RequestMapping("/getUserForm")
    public String UserForm()
    {
        return "userDataForm";
    }

    @RequestMapping("/registerUser")
    public String RegisterUser(Model model)
    {
        model.addAttribute("user", new User());

        return "Register";
    }

    @RequestMapping("/Register")
    public String Register(@Valid @ModelAttribute("user") User user, BindingResult bindingResult , Model model)
    {
            if(bindingResult.hasErrors())
            {
                model.addAttribute("user" , user);

                return "Register";
            }
            if(this.userService.Register(user))
            {
                model.addAttribute("user" , user);
                return "Register";

            }

            throw new RuntimeException("Something unexpected happened!");
    }




    @InitBinder
    public void initBinder(WebDataBinder binder) {
        StringTrimmerEditor stringTrimmer = new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class, stringTrimmer);
    }
}
