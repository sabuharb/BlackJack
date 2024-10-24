package com.pluralsight;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8",
                "9", "10", "J", "Q", "K", "A"};
// these loops create all the cards in the deck
// and add them to the ArrayList

        for (String suit : suits) {
            for (String value : values) {
                Deque<Card> Cards = null;
                Cards.add(new Card(suit, value)); //Use the new card Class
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards); //Shuffle the deck
}

    public Object deal() {
    if (cards.size() > 0) {
        return cards.remove(0); // Remove the top card from the deck
    } else {
        return null; // No more cards to deal
    }

    }

    public int getSize() {
    return cards. size(); // Return the number of cards left in the Deck
}

}
    

