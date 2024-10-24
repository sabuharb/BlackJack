package com.pluralsight;

public class Hand {
    private ArrayList<Card> cards;
    public Hand(){
        cards = new ArrayList<>();
    }
    // A Card is dealt to the com.pluralsight.Hand and the com.pluralsight.Hand is responsible
// to store the card
    public void Deal(Card card){
        cards.add(card);
    }
    public int getSize(){
        return cards.size();
    }
    // The com.pluralsight.Hand uses the methods of each card to determine
// the value of each card - and adds up all values
    public int getValue(){
        int value = 0;
        for(Card card: cards){
            card.flip(); // turn the card over to see the value
            value += card.getPointValue();
            card.flip(); // hide the card again
        }
        return value;
    }
}

