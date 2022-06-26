package com.week3project.week3.service;

import com.week3project.week3.model.Card;
import com.week3project.week3.model.Customer;
import com.week3project.week3.model.Wallet;
import com.week3project.week3.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    public Customer createCustomer(Customer requestCustomer) {
        return customerRepository.create(requestCustomer);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.getAll();
    }


    public List<Customer> findCustomerByName(String name) {
        Optional<Customer> foundCustomer = customerRepository.findByName(name);
        if (foundCustomer.isPresent()) {
            return foundCustomer.stream().toList();
        }
        return null;
    }

    public List<Customer> isCustomerActive() {
        return customerRepository.isActive();
    }

    public List<Customer> isCustomerPassive() {
        return customerRepository.isPassive();
    }

    public Customer createWalletForCustomer(String name, Wallet wallet) {
        return customerRepository.createWallet(name, wallet);
    }

    public Customer createCardsForCustomer(String name, Card card) {
        return customerRepository.createCards(name, card);
    }
}
