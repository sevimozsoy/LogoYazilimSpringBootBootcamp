package com.week3project.week3.model;

public class Customer {
    private String name;
    private String surname;
    private String email;
    private int age;
    private boolean active;
    private Wallet wallet;


    public Customer(String name, String surname, String email, int age, boolean active, Wallet wallet) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.active = active;
        this.wallet = wallet;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
