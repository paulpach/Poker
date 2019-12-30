package com.paulpach.Poker.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.paulpach.Poker.model.enums.CardType;

public class HandTest {

	@Test
	public void HandTest() {
		Hand hand;
	}
	
	@Test
	public void HandCardsNotNullTest() {
		Card card1 = new Card(1, CardType.CLUBS);
		Card card2 = new Card(2, CardType.DIAMONDS);
		Card card3 = new Card(3, CardType.HEARTS);
		Card card4 = new Card(4, CardType.SPADES);
		Card card5 = new Card(5, CardType.CLUBS);
		
		Hand hand = new Hand(card1, card2, card3, card4, card5);
		
		assertNotEquals(null, hand.getCard1());
		assertNotEquals(null, hand.getCard2());
		assertNotEquals(null, hand.getCard3());
		assertNotEquals(null, hand.getCard4());
		assertNotEquals(null, hand.getCard5());
	}
	
	@Test
	public void HandCardsEquals() {
		Card card1 = new Card(1, CardType.CLUBS);
		Card card2 = new Card(2, CardType.DIAMONDS);
		Card card3 = new Card(3, CardType.HEARTS);
		Card card4 = new Card(4, CardType.SPADES);
		Card card5 = new Card(5, CardType.CLUBS);
		
		Hand hand = new Hand(card1, card2, card3, card4, card5);
		
		assertEquals(card1, hand.getCard1());
		assertEquals(card2, hand.getCard2());
		assertEquals(card3, hand.getCard3());
		assertEquals(card4, hand.getCard4());
		assertEquals(card5, hand.getCard5());
	}
	
}
