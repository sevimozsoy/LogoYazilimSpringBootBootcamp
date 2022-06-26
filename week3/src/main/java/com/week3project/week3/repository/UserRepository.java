package com.week3project.week3.repository;

import com.week3project.week3.model.Customer;
import com.week3project.week3.model.User;
import com.week3project.week3.model.Wallet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {

    //database işlemleri var normalde...

    private static List<User> userList = new ArrayList<>();



    public User save(User userRequest) {
        userList.add(userRequest);
//            userRequest.getCustomerList().add(new Customer("Burak","Özsoy","burak@test",12,true, new Wallet(true,10000)));
//        userRequest.getCustomerList().add(new Customer("Selin","Özsoy","selin@test",22,true,new Wallet(true,10000)));
        return userRequest;
    }

    public List<User> findAll() {
        return userList;
    }

    public Optional<User> findUserByEmail(String email) {
        return userList.stream().filter(user -> user.getEmail().equals(email)).findFirst();
    }
}
