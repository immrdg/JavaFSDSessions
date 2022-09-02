package com.stackroute.wipro.testingrestfulservices.services;

import com.stackroute.wipro.testingrestfulservices.model.User;
import com.stackroute.wipro.testingrestfulservices.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceImpl userService;

    @Test
    public void givenUserToSaveShouldReturnSavedUser(){
        User user=new User(1,"Gireesh","D",21);
        when(userRepository.save(any())).thenReturn(user);
        userService.saveUser(user);

        verify(userRepository,times(1)).save(any());
    }

}