package com.paulpach.Poker.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.paulpach.Poker.model.Card;
import com.paulpach.Poker.model.Hand;
import com.paulpach.Poker.model.enums.CardType;
import com.paulpach.Poker.model.enums.Rank;

public class CardServiceTest {

	@Test
	public void HighCardTest() {
        CardService cardService = new CardService();

		Card card1 = new Card(1, CardType.CLUBS);
		Card card2 = new Card(12, CardType.DIAMONDS);
		Card card3 = new Card(7, CardType.HEARTS);
		Card card4 = new Card(4, CardType.SPADES);
		Card card5 = new Card(5, CardType.CLUBS);
		
		Hand hand = new Hand(card1, card2, card3, card4, card5);
        
        Rank rank = cardService.getRank(hand);

        assertEquals(Rank.HIGHCARD, rank, "This hand's rank is 'high card'");
    }
    
	@Test
	public void PairTest() {
        CardService cardService = new CardService();

		Card card1 = new Card(1, CardType.CLUBS);
		Card card2 = new Card(1, CardType.DIAMONDS);
		Card card3 = new Card(7, CardType.HEARTS);
		Card card4 = new Card(4, CardType.SPADES);
		Card card5 = new Card(5, CardType.CLUBS);
		
		Hand hand = new Hand(card1, card2, card3, card4, card5);
        
        Rank rank = cardService.getRank(hand);

        assertEquals(Rank.PAIR, rank, "There are 2 aces, this should be a Pair");
	}
    
    @Test
	public void KingPairTest() {
        CardService cardService = new CardService();

		Card card1 = new Card(13, CardType.CLUBS);
		Card card2 = new Card(13, CardType.DIAMONDS);
		Card card3 = new Card(7, CardType.HEARTS);
		Card card4 = new Card(4, CardType.SPADES);
		Card card5 = new Card(5, CardType.CLUBS);
		
		Hand hand = new Hand(card1, card2, card3, card4, card5);
        
        Rank rank = cardService.getRank(hand);

        assertEquals(Rank.PAIR, rank, "There are 2 kings, this should be a Pair");
	}
    
    @Test
    public void TwoPairTest() {
    	CardService cardService = new CardService();

		Card card1 = new Card(1, CardType.CLUBS);
		Card card2 = new Card(1, CardType.DIAMONDS);
		Card card3 = new Card(7, CardType.HEARTS);
		Card card4 = new Card(5, CardType.SPADES);
		Card card5 = new Card(5, CardType.CLUBS);
		
		Hand hand = new Hand(card1, card2, card3, card4, card5);
        
        Rank rank = cardService.getRank(hand);
        
        assertEquals(Rank.TWO_PAIR, rank, "There are 2 pairs this hand should be 'Two Pairs' rank");
    }
    
    @Test
    public void ThreeOfAKindTest() {
    	CardService cardService = new CardService();

		Card card1 = new Card(1, CardType.CLUBS);
		Card card2 = new Card(1, CardType.DIAMONDS);
		Card card3 = new Card(5, CardType.HEARTS);
		Card card4 = new Card(5, CardType.SPADES);
		Card card5 = new Card(5, CardType.CLUBS);
		
		Hand hand = new Hand(card1, card2, card3, card4, card5);
        
        Rank rank = cardService.getRank(hand);
        
        assertEquals(Rank.THREE_OF_A_KIND, rank, "There is 1 trio this hand should be 'Three of a Kind' rank");
    }
}
