package com.week3project.week3.model;

import java.util.List;

public class Wallet {
    private boolean active;
    private int balance;
    private List<Card> card;

    public Wallet(boolean active, int balance, List<Card> card) {
        this.active = active;
        this.balance = balance;
        this.card = card;
    }

    public List<Card> getCard() {
        return card;
    }

    public void setCard(List<Card> card) {
        this.card = card;
    }

    public Wallet() {

    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


}
