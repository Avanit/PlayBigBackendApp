package com.asaneasa.sports.playbigbackend.controllers;

import com.asaneasa.sports.playbigbackend.responses.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello %s, to PlayBig Backend App!";

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="Friend") String name) {
        return new Greeting(String.format(template, name));
    }
}
