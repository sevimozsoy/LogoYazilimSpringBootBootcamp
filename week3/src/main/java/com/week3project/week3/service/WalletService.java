package com.week3project.week3.service;

import com.week3project.week3.model.Card;
import com.week3project.week3.model.Wallet;
import com.week3project.week3.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WalletService {

    @Autowired
    private WalletRepository walletRepository;
    public Wallet createWallet(Wallet requestWallet) {
        return walletRepository.create(requestWallet);
    }

    public Wallet addCards(Card requestCard) {
        return walletRepository.addCard(requestCard);
    }
}
