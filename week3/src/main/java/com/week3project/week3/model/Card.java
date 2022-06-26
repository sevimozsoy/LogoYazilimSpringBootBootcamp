package com.week3project.week3.model;

public class Card {
    private String bank;
    private String cardName;
    private int cardNumber;

    public Card(String bank, String cardName, int cardNumber) {
        this.bank = bank;
        this.cardName = cardName;
        this.cardNumber = cardNumber;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
}
