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
	public void TestCardTypeOne() {
		Card card = new Card(10, CardType.CLUBS);
		
		assertEquals(CardType.CLUBS, card.getType());
	}
	
	@Test
	public void TestCardTypeTwo() {
		Card card = new Card(10, CardType.DIAMONDS);
		
		assertEquals(CardType.DIAMONDS, card.getType());
    }
    
    @Test
    public void TestEquals()
    {
        Card card1 = new Card(10, CardType.DIAMONDS);
        Card card2 = new Card(10, CardType.DIAMONDS);

        assertEquals(card1, card2);
    }
}
