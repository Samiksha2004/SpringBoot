package com.example.FirstSpringApplication.controller;


import com.example.FirstSpringApplication.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class GreetingController {

    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz!";
    }
//    @GetMapping("/message")
//    public String getMessage() {
//        return "Hello from BridgeLabz!";
//    }

}