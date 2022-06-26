package com.week3project.week3.service;

import com.week3project.week3.model.Customer;
import com.week3project.week3.model.User;
import com.week3project.week3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RabbitMQService rabbitMQService;
    public User createUser(User userRequest) {
        rabbitMQService.sendEmail(userRequest.getEmail());
        return userRepository.save(userRequest);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserByEmail(String email) {
        boolean isPresent = userRepository.findUserByEmail(email).isPresent();
        if(isPresent){
            return userRepository.findUserByEmail(email).get();
        }
        //return userRepository.findUserByEmail(email).orElseThrow(() -> new RuntimeException()); //null dönme!
        //return userRepository.findUserByEmail(email).orElseThrow(RuntimeException::new); //null dönme!
        return null;
    }

    public List<Customer> getUsersCustomers(String email) {
        Optional<User> foundUser = userRepository.findUserByEmail(email);
        if (foundUser.isPresent()){
            return foundUser.get().getCustomerList();
        }
        return null;
    }
}
