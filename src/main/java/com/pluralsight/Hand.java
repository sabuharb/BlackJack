import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void deal(Card card) {
        cards.add(card);  // Add a card to the hand
    }

    public int getValue() {
        int value = 0;
        int aceCount = 0;
        for (Card card : cards) {
            int cardValue = card.getPointValue();
            value += cardValue;
            if (cardValue == 11) {
                aceCount++;  // Count the number of aces
            }
        }
        // Adjust Ace value from 11 to 1 if necessary
        while (value > 21 && aceCount > 0) {
            value -= 10;  // Count Ace as 1 instead of 11
            aceCount--;
        }
        return value;
    }

    public int getSize() {
        return cards.size();  // Returns the number of cards in the hand
    }
}
