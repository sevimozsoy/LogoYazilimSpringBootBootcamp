package com.week3project.week3.controller;


import com.week3project.week3.model.Card;
import com.week3project.week3.model.Customer;
import com.week3project.week3.model.Wallet;
import com.week3project.week3.service.CustomerService;
import com.week3project.week3.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public Customer createCustomer(@RequestBody Customer requestCustomer) {
        return customerService.createCustomer(requestCustomer);
    }

    @PostMapping(path = "/{name}/wallet")
    public Customer createWalletForCustomer(@PathVariable String name, @RequestBody Wallet wallet){
        return customerService.createWalletForCustomer(name, wallet);
    }

    @PostMapping(path = "/{name}/wallet/cards")
    public Customer createCardsForCustomer(@PathVariable String name, @RequestBody Card card){
        return customerService.createCardsForCustomer(name, card);
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping(value = "/{name}")
    public List<Customer> findCustomerByName(@PathVariable String name) {
        return customerService.findCustomerByName(name);
    }

    @GetMapping(value = "/active")
    public List<Customer> isCustomerActive() {
        return customerService.isCustomerActive();
    }

    @GetMapping(value = "/passive")
    public List<Customer> isCustomerPassive() {
        return customerService.isCustomerPassive();
    }


}
