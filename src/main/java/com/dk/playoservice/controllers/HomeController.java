package com.dk.playoservice.controllers;

import com.dk.playoservice.entities.User;
import com.dk.playoservice.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/home")
public class HomeController {

    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private UserService userService;

    // http://localhost:9012/api/home/users
    @GetMapping("/users")
    public List<User> getUsers() {
        this.logger.error("This is working message");
        return userService.getUsers();
    }

    @GetMapping()
    public String getCurrentUser(Principal principal) {
        return principal.getName();
    }
}
