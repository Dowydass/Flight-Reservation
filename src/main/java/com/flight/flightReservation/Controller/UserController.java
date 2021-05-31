package com.flight.flightReservation.Controller;

import com.flight.flightReservation.Model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.flight.flightReservation.Repository.UserRepository;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Calendar;


@Controller
@EnableAutoConfiguration
public class UserController {

    @Autowired
   private UserRepository userRepository;




    private BCryptPasswordEncoder encoder;

    @RequestMapping("/register")
    public String showRegistrationPage() {
        return "register";
    }



    @RequestMapping(value = "registerUser", method = RequestMethod.POST)
    public String register(@ModelAttribute("user") User user) {

        userRepository.save(user);
        return "login";
    }

    @RequestMapping("/login")
    public String showLoginPage() {
        return "login";
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("email") String email,@RequestParam("password") String password, ModelMap modelMap){
       User user = userRepository.findByEmail(email);
       if(user.getPassword().equals(password)){
        return "findFlights";
       }else{
           modelMap.addAttribute("msg", "Invalid user name or password. Please try again.");

       }
        return "login";
    }
}
