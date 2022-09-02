package com.stackroute.wipro.testingrestfulservices.services;

import com.stackroute.wipro.testingrestfulservices.model.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    List<User> getAllUsers();

}
