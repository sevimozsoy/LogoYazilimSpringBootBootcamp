package com.week3project.week3.repository;

import com.week3project.week3.controller.CardController;
import com.week3project.week3.model.Card;
import com.week3project.week3.model.Wallet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class WalletRepository {

    Wallet wallet = new Wallet();
    @Autowired
    private CardController cardController;

    public Wallet create(Wallet requestWallet) {
        wallet = requestWallet;
        return wallet;
    }

    public Wallet addCard(Card requestCard) {
        wallet.setCard(cardController.createCard(requestCard));
        return wallet;
    }
}
