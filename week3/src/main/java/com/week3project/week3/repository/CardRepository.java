package com.week3project.week3.repository;

import com.week3project.week3.model.Card;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CardRepository {

    List<Card> cards = new ArrayList<>();
    public List<Card> create(Card requestCard) {
        cards.add(requestCard);
        return cards;
    }
}
