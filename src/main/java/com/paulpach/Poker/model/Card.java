package com.paulpach.Poker.model;

import com.paulpach.Poker.model.enums.CardType;

public class Card {

	private Integer id;
	private CardType cardType;
	
	public Card (Integer id, CardType cardType) {
		this.id = id;
	}
	
	public Integer getValue() {
		return this.id;
	}
	
}
