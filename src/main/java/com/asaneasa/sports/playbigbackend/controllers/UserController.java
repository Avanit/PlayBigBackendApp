package com.asaneasa.sports.playbigbackend.controllers;

import com.asaneasa.sports.playbigbackend.repositories.UserRepository;
import com.asaneasa.sports.playbigbackend.responses.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private static final String template = "Hello %s, to PlayBig Backend App!";
    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("/user")
    public Greeting greeting(@RequestParam(value="firstName", defaultValue="Aditya") String firstName) {
        userRepository.findByFirstName(firstName);
        return new Greeting(String.format(template, firstName));
    }
}
