package com.paulpach.Poker.model;

import com.paulpach.Poker.model.enums.CardType;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CardTest {

	@Test
	public void TestCard() {
        Card card = new Card(10, CardType.CLUBS);
        
        assertEquals(10, card.getValue());
	}
	
}
