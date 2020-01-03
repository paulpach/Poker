package com.paulpach.Poker.service;

import java.util.Arrays;

import com.paulpach.Poker.model.Hand;
import com.paulpach.Poker.model.enums.Rank;

public class CardService {


    /** Count how many of each card we have */
    private int[] countCards(Hand hand)
    {
        int[] cardValueArray = new int[13];
		cardValueArray[hand.getCard1().getValue() - 1]++;

		cardValueArray[hand.getCard2().getValue() - 1]++;

		cardValueArray[hand.getCard3().getValue() - 1]++;

		cardValueArray[hand.getCard4().getValue() - 1]++;

        cardValueArray[hand.getCard5().getValue() - 1]++;
        return cardValueArray;
    }

	public Rank getRank(Hand hand) {

		int pairAmount = 0;
		boolean hasTrio = false;

        int[] cardValueArray = countCards(hand);

		for (int i = 0; i < cardValueArray.length; i++) {
			if (cardValueArray[i] == 2)
				pairAmount++;

			if (cardValueArray[i] == 3)
				hasTrio = true;
        }
        
		if(isStraight(hand))
			return Rank.STRAIGHT;
		else if (hasTrio)
			return Rank.THREE_OF_A_KIND;
		else if (pairAmount == 2)
			return Rank.TWO_PAIR;
		else if (pairAmount == 1)
			return Rank.PAIR;
		else
			return Rank.HIGHCARD;
	}

    private boolean isStraight(Hand hand) {
        int[] handCardValueArray = getCardValues(hand);
        int sequenceCounter = 0;
        
		Arrays.sort(handCardValueArray);
		
		int lastValue = 0;
		
		for(int i = 0; i < handCardValueArray.length; i++) {
			if(i == 0)
				sequenceCounter = 1;
			else if(handCardValueArray[i] == lastValue + 1)
				sequenceCounter++;
			
			lastValue = handCardValueArray[i];
		}
        return sequenceCounter == 5;
    }

    private int[] getCardValues(Hand hand) {
        int[] handCardValueArray = new int[5];
        
		handCardValueArray[0] = hand.getCard1().getValue();
		handCardValueArray[1] = hand.getCard2().getValue();
		handCardValueArray[2] = hand.getCard3().getValue();
		handCardValueArray[3] = hand.getCard4().getValue();
		handCardValueArray[4] = hand.getCard5().getValue();
        return handCardValueArray;
    }

}
