package org.sevimozsoy;


import java.util.Calendar;
import java.util.List;

public class Customer {

    final Calendar signedUp = Calendar.getInstance();
    List<Order> orderList;
    private String name;

    public Customer() {}

    private String surname;

    Customer(String name, String surname, int day, int month, int year, List<Order> orderList) {
        this.name = name;
        this.surname = surname;
        this.signedUp.set(year, month, day);
        this.orderList = orderList;
    }

    public Customer(String name, String surname, int day, int month, int year) {
        this.name = name;
        this.surname = surname;
        this.signedUp.set(year, month, day);
        //System.out.println(signedUp.get(Calendar.MONTH));
    }


    public int getSignedUp(){
        return (signedUp.get(Calendar.MONTH));
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}