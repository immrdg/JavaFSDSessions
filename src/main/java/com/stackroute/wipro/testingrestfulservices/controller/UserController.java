package com.stackroute.wipro.testingrestfulservices.controller;

import com.stackroute.wipro.testingrestfulservices.model.User;
import com.stackroute.wipro.testingrestfulservices.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/v1")
public class UserController {


    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService=userService;
    }

    @PostMapping("/addUser")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        User savedUser=userService.saveUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> savedUsers=userService.getAllUsers();
        return new ResponseEntity<>(savedUsers,HttpStatus.OK);
    }

}
