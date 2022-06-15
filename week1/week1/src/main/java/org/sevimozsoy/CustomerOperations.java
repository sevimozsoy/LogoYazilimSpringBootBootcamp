package org.sevimozsoy;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class CustomerOperations implements getAllInterface {

    static List<Customer> customerList = new ArrayList<>();
    static Customer customer = new Customer();

    public void setPreviousCustomers() {
        customerList.add(new Customer("Sevim", "Özsoy", 10, 6, 2020));
        customerList.add(new Customer("Burak", "Özsoy", 1, 6, 2022));
        customerList.add(new Customer("Berkay", "Soyisim", 10, 2, 2019));
        customerList.add(new Customer("Vin", "Soyisim", 12, 5, 2021));
        customerList.add(new Customer("Civciv", "Soyisim", 10, 2, 2019));
        customerList.add(new Customer("ivciv", "Soyisim", 10, 2, 2019));
    }

    public void addNewCustomer(String customerName, String customerSurname, int day, int month, int year) {
        List<Order> orderList = new ArrayList<>(); //ilk kullanıcı oluşturduğunda faturası olmamalı
        customerList.add(new Customer(customerName, customerSurname, day, month, year));
    }

    public void getCustomerNamesWithC() {
        customerList.stream().map(Customer::getName)
                .filter(customerName -> customerName.toLowerCase().contains("c")).toList().forEach(System.out::println);
    }

    public void getAll() {
        customerList.stream().map(Customer::getName).forEach(System.out::println);
    }

    public Set<Customer> juneCustomers() {
        return customerList.stream().filter(customer -> customer.getSignedUp() == 6).collect(Collectors.toSet());
    }

}