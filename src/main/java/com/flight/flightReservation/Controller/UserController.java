package com.flight.flightReservation.Controller;

import com.flight.flightReservation.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.flight.flightReservation.Repository.UserRepository;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/register")
    public String showRegistrationPage() {
        System.out.println("Patvirtinta");
        return "register";
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String register(@ModelAttribute("user") User user) {
        System.out.println(user);
        userRepository.save(user);
        return "login";
    }
}
