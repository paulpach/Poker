package com.paulpach.Poker.service;

import com.paulpach.Poker.model.Hand;

public interface ICardService {

    public int[] countCards(Hand hand);
}