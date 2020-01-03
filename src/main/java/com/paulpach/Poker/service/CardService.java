package com.paulpach.Poker.service;

import com.paulpach.Poker.model.Hand;
import com.paulpach.Poker.model.enums.Rank;

public class CardService {

	public Rank getRank(Hand hand) {

		int pairAmount = 0;
		boolean hasTrio = false;

		int[] cardValueArray = new int[13];

		cardValueArray[hand.getCard1().getValue() - 1]++;

		cardValueArray[hand.getCard2().getValue() - 1]++;

		cardValueArray[hand.getCard3().getValue() - 1]++;

		cardValueArray[hand.getCard4().getValue() - 1]++;

		cardValueArray[hand.getCard5().getValue() - 1]++;

		for (int i = 0; i < cardValueArray.length; i++) {
			if (cardValueArray[i] == 2)
				pairAmount++;
			
			if(cardValueArray[i] == 3)
				hasTrio = true;
		}

		if(hasTrio)
			return Rank.THREE_OF_A_KIND;
		else if (pairAmount == 2)
			return Rank.TWO_PAIR;
		else if (pairAmount == 1)
			return Rank.PAIR;
		else
			return Rank.HIGHCARD;
	}

}
