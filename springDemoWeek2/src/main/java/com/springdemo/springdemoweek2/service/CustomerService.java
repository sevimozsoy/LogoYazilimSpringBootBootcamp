package com.springdemo.springdemoweek2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service //Bean tanımı!!
public class CustomerService {

    //Avoid field injection use constructor or setter injections mostly!

    private OrderService orderService;
    @Autowired
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;

    }



    public static void incrementCustomerAge(Customer customer) {
        customer.setAge(customer.getAge() + 3);
        System.out.println(customer.getAge());
    }





    public Customer create(String name) {
        System.out.println(orderService.toString());
        //orderService.createOrder();
        return new Customer(name, 25, new ArrayList<>());

    }

    public List<Customer> prepareCustomerList() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("bilisim.io", 25, prepareOrderList()));
        customers.add(new Customer("cem", 30, prepareOrderList()));
        customers.add(new Customer("ömer", 21, prepareOrderList()));
        customers.add(new Customer("haluk", 32, prepareOrderList()));
        customers.add(new Customer("halil", 25, prepareOrderList()));
        customers.add(new Customer("fatih", 18, prepareOrderList()));
        return customers;
    }

    private List<Order> prepareOrderList() {
        List<Order> orders = new ArrayList<>();
        int randomOrderNumber = new Random().nextInt(5);
        for (int i = 0; i < randomOrderNumber; i++) {
            Order order = new Order(prepareProductList(randomOrderNumber));
            orders.add(order);
        }
        return orders;
    }

    private List<Product> prepareProductList(int randomOrderNumber) {
        List<Product> products = new ArrayList<>();
        Random random = new Random();
        products.add(new Product("MacBook Pro", random.nextDouble(1000)));
        products.add(new Product("MacBook air", random.nextDouble(1000)));
        products.add(new Product("Mac Mini", random.nextDouble(1000)));
        products.add(new Product("iPhone 11", random.nextDouble(1000)));
        products.add(new Product("iPhone 12", random.nextDouble(1000)));

        return products.stream().limit(randomOrderNumber).toList();
    }
}
