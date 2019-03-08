package com.journaldev.spring.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.journaldev.spring.model.User;

@Controller
public class HomeController
{

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping (value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model)
    {
        model.addAttribute("message", "Home Page Requested for XML example");
        return "home";
    }

    @RequestMapping (value = "/user", method = RequestMethod.POST)
    public String user(@Validated User user, Model model)
    {
        System.out.println("User Page Requested");
        model.addAttribute("userName", user.getUserName());
        return "user";
    }
}
