package com.example.UserService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/name")
    public String getName() {
        return "Anar";
    }

    @GetMapping("/address")
    public String getAddress() {
        return "Baku";
    }

    @GetMapping("/status")
    public String getStatus() {
        return "Active";
    }


}
