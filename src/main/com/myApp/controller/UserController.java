package main.com.myApp.controller;


import main.com.myApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import main.com.myApp.service.userService;

import javax.servlet.http.HttpServletRequest;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@Controller
public class UserController {


    @Autowired
    public userService userService;

   /* public UserController()
    {
        this.userService = new userService();
    }*/

    @RequestMapping("/getUserForm")
    public String UserForm()
    {
        return "userDataForm";
    }

    @RequestMapping("save")
    public String saveUserData(HttpServletRequest request , Model model)
    {
        String dateString = request.getParameter("date");
        java.sql.Date sqlDate = null;

        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date utilDate = formatter.parse(dateString);
            sqlDate = new java.sql.Date(utilDate.getTime());

        } catch (ParseException e) {
            e.printStackTrace();
        }

        User user = new User();
        user.setCity(request.getParameter("city"));
        user.setEmail(request.getParameter("email"));
        user.setDate_of_birth(sqlDate);
        user.setFirstName( request.getParameter("first_name"));
        user.setLastName( request.getParameter("last_name"));

        this.userService.saveUser(user);

        model.addAttribute("full_name" ,user.getFirstName() + ' ' + user.getLastName());
        model.addAttribute("email" , user.getEmail());
        model.addAttribute("city" , user.getCity());
        model.addAttribute("date_of_birth" , user.getDate_of_birth());

        return "userData";

    }
}
