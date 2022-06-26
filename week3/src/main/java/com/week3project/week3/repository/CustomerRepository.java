package com.week3project.week3.repository;

import com.week3project.week3.controller.WalletController;
import com.week3project.week3.model.Card;
import com.week3project.week3.model.Customer;
import com.week3project.week3.model.Wallet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CustomerRepository {

    List<Customer> customerList = new ArrayList<>();

    @Autowired
    private WalletController walletController;

    public Customer create(Customer requestCustomer) {
        customerList.add(requestCustomer);
        return requestCustomer;
    }

    public List<Customer> getAll() {
        return customerList;
    }

    public Optional<Customer> findByName(String name) {
        return customerList.stream().filter(customer -> customer.getName().equals(name)).findFirst();
    }


    public List<Customer> isActive() {
        return customerList.stream().filter(Customer::isActive).toList();
    }

    public List<Customer> isPassive() {
        return customerList.stream().filter(customer -> !customer.isActive()).toList();
    }

    public Customer createWallet(String name, Wallet wallet) {
        Optional<Customer> customer = findByName(name);
        if (customer.isPresent()) {
            customer.get().setWallet(walletController.createWallet(wallet));
            return customer.get();
        }
        return null;
    }

    public Customer createCards(String name, Card card) {
        Optional<Customer> customer = findByName(name);
        if (customer.isPresent()) {
            customer.get().setWallet(walletController.createCards(card));
            return customer.get();
        }
        return null;
    }
}
