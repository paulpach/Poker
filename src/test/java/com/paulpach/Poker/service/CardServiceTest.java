package com.paulpach.Poker.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.paulpach.Poker.model.Card;
import com.paulpach.Poker.model.Hand;
import com.paulpach.Poker.model.enums.CardType;

public class CardServiceTest {

	@Test
	public void HighCardTest() {
        CardService cardService;

		Card card1 = new Card(1, CardType.CLUBS);
		Card card2 = new Card(12, CardType.DIAMONDS);
		Card card3 = new Card(7, CardType.HEARTS);
		Card card4 = new Card(4, CardType.SPADES);
		Card card5 = new Card(5, CardType.CLUBS);
		
		Hand hand = new Hand(card1, card2, card3, card4, card5);
        
        Rank rank = cardService.GetRank(hand);

        assertEquals(Rank.HighCard, rank, "This hand's rank is 'high card'");
	}
	
}
