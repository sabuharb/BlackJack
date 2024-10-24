package com.pluralsight;


import com.sun.jdi.Value;

public class Card {
    private final String suit;
    private final String value;
    private boolean isFaceUp;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false; // Cards are face down by default
    }

    public String getSuit() {
// only return the suit if the card is face up
        if (isFaceUp) {
            return suit;
        } else {
            return "#"; // hide suit if face down
        }
    }

    public String getValue() {
        if (isFaceUp) {
// this is the string value of the card
// i.e. A, K, Q, J, 10, 9 ...
            return value; // return the value(A, K, Q, J.etc)
        } else {
            return "#"; // Return placeholder if face down
        }
    }

    public int getPointValue() {
// Assigning point values
        if (isFaceUp) {
            if (value.equals("A")) {
                return 11; //Ace is worth 11 point
            } else if (value.equals("k") || value.equals("Q") || value.equals("Q") || value.equals("J")) {
                return 10; // Face cards are worth 10 points
            } else {
                return Integer.parseInt(value); //Numeric cards are their face value
            }
        } else {
            return 0; // Hidden Card has no point value
        }
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void flip() {
        isFaceUp = !isFaceUp;  //Flips the card face up or face down
    }

}