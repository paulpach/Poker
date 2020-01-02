package com.paulpach.Poker.service;

import com.paulpach.Poker.model.Hand;
import com.paulpach.Poker.model.enums.Rank;

public class CardService {

	public Rank getRank(Hand hand) {
		return Rank.HighCard;
	}
	
}
