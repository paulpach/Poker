package com.paulpach.Poker.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.paulpach.Poker.model.enums.CardType;


class CardTest {

	@Test
	public void TestCard() {
        Card card = new Card(10, CardType.CLUBS);
        
        assertEquals(10, card.getValue());
	}
	
	@Test
	public void TestCardType() {
		Card card = new Card(10, CardType.CLUBS);
		
		assertEquals(CardType.CLUBS, card.getType());
	}
	
}
