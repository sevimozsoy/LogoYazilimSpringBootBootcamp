package com.week3project.week3.controller;

import com.week3project.week3.model.Customer;
import com.week3project.week3.model.User;
import com.week3project.week3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Response Body kullanılmasına gerek yok
@RequestMapping(value = "/users")
//@Controller //Body
public class UserController {

    @Autowired
    private UserService userService;

    //modelin kendisini dönme response objesi döndür.
    @PostMapping
    public User createUser(@RequestBody User userRequest){
        return userService.createUser(userRequest);
    }

    @GetMapping
    //@RequestMapping(method = RequestMethod.GET) eski versiyonu!
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping(value = "/{email}")
    public User getUserByEmail(@PathVariable String email){
        return userService.getUserByEmail(email);
    }

    @GetMapping(value = "/{email}/customers")
    public List<Customer> getUsersCustomersByEmail(@PathVariable String email){
        return userService.getUsersCustomers(email);
    }
}
