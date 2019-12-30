package com.paulpach.Poker.model;

import com.paulpach.Poker.model.enums.CardType;

public class Card {

	private Integer id;
	private CardType cardType;
	
	public Card (Integer id, CardType cardType) {
        this.id = id;
        this.cardType = cardType;
	}
	
	public Integer getValue() {
		return this.id;
	}
    
    public CardType getType()
    {
        return cardType;
    }
    
    @Override
    public boolean equals(Object obj) {
    	Card card = null;
    	
    	if(obj instanceof Card)
    		card = (Card)obj;
    	
    	if(card != null) {
    		if(this.id == card.getValue() && this.cardType == card.getType())
    			return true;
    	}
    	
    	return false;
    }
}
