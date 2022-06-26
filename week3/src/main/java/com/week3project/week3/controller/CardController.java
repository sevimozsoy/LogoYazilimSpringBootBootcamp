package com.week3project.week3.controller;

import com.week3project.week3.model.Card;
import com.week3project.week3.service.CardSevices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cards")
public class CardController {
    @Autowired
    private CardSevices cardSevices;

    @PostMapping
    public List<Card> createCard(@RequestBody Card requestCard){
        return cardSevices.createCard(requestCard);
    }

}
