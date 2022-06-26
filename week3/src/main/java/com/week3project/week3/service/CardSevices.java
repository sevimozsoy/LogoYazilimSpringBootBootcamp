package com.week3project.week3.service;

import com.week3project.week3.model.Card;
import com.week3project.week3.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardSevices {

    @Autowired
    private CardRepository cardRepository;
    public List<Card> createCard(Card requestCard) {
        return cardRepository.create(requestCard);
    }
}
