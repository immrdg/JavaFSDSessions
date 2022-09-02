package com.stackroute.wipro.testingrestfulservices.repository;

import com.stackroute.wipro.testingrestfulservices.model.User;
import com.stackroute.wipro.testingrestfulservices.services.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
//@SpringBootTest
@DataJpaTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void givenUserToSaveShouldReturnSavedUser(){
        User user=new User(1,"Gireesh","D",21);
        userRepository.save(user);
        User user1=userRepository.findById(user.getId()).get();
        assertNotNull(user1);
        assertEquals(user1.getFirstName(),user1.getFirstName());
    }

    @Test
    public void givenGetAllUsersThenShouldReturnListOfAllUsers(){
        User user=new User(2,"Rahul","D",22);
        userRepository.save(user);
        User user1=new User(3,"Shiva","Kumar",25);
        userRepository.save(user1);
        List<User> users=new ArrayList<>();
        users.add(user);
        users.add(user1);

        List<User> allUsers= (List<User>) userRepository.findAll();
        assertEquals("Shiva",allUsers.get(1).getFirstName());
//        assertEquals(user1.getFirstName(),user1.getFirstName());
    }

}