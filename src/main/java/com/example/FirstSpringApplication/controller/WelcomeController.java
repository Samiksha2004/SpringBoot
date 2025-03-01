package com.example.FirstSpringApplication.controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hello")
public class WelcomeController {

    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
