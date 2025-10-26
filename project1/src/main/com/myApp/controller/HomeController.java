package main.com.myApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.time.Period;

@Controller
public class HomeController
{

    @RequestMapping("/")
    public String showHomePage()
    {
        return "formPage";
    }

    @RequestMapping("/processForm")
    public String processForm(@RequestParam("day") String day , @RequestParam("month") String month , @RequestParam("year") String year , Model model)
    {
        int dayint = Integer.parseInt(day);
        int monthint = Integer.parseInt(month);
        int yearint  = Integer.parseInt(year);
        LocalDate use_date = LocalDate.of(yearint ,monthint, dayint);
        LocalDate now = LocalDate.now();
        Period period = Period.between(use_date, now);

        model.addAttribute("years" , period.getYears());
        model.addAttribute("months" , period.getMonths());
        model.addAttribute("days" , period.getDays());
        //step3: return view page
        return "resultPage";
    }
}


