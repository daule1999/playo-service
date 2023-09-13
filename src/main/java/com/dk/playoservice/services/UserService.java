package com.dk.playoservice.services;

import com.dk.playoservice.entities.User;
import com.dk.playoservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<User> getUsers() {
        return  userRepository.findAll();
    }

    public User getUserById(String id) {
        return userRepository.findById(id).get();
    }

    public User createUser(User user) {
        user.setUseId(UUID.randomUUID().toString());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
}