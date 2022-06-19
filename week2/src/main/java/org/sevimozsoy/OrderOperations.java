package org.sevimozsoy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static org.sevimozsoy.CustomerOperations.customer;
import static org.sevimozsoy.CustomerOperations.customerList;

public class OrderOperations {
    static List<Order> orderList = new ArrayList<>();


    public void setOldOrders() {
        orderList.add(new Order(1, 1200));
        orderList.add(new Order(2, 1600));
        orderList.add(new Order(3, 1700));
    }

    public void createNewOrder(Order order, String customerName) {
        if (customerList.contains(customerName)) {
            customer.setName(customerName);
            customer.getOrderList().add(order);
        }
        orderList.add(order);
    }

    public Map<Integer, Integer> listExpensiveOrders() {
        return orderList.stream().filter(order -> order.getOrderTotalPrice() > 1500).collect(Collectors.toMap(Order::getOrderId, Order::getOrderTotalPrice));
    }

    public void averageExpensiveOrders() {
        Map<Integer, Integer> average = listExpensiveOrders();
        int sum = average.values().stream().reduce(0, Integer::sum);
        System.out.println(sum / average.size());
    }

    public void getAll() {
        orderList.stream().map(Order::getOrderId).forEach(System.out::println);
    }


}
