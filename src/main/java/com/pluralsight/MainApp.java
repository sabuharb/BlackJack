import java.util.Scanner;

public class MainApp {
    public static <Hand> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create deck and shuffle
        Deck deck = new Deck();
        deck.shuffle();

        // Get player names
        System.out.println("Enter player 1 name: ");
        String player1 = scanner.nextLine();
        System.out.println("Enter player 2 name: ");
        String player2 = scanner.nextLine();

        // Create hands for each player
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();

        // Deal 2 cards to each hand
        hand1.deal(deck.deal());
        hand1.deal(deck.deal());

        hand2.deal(deck.deal());
        hand2.deal(deck.deal());

        // Calculate hand values
        int hand1Value = hand1.getValue();
        int hand2Value = hand2.getValue();

        // Display hand values
        System.out.println(player1 + "'s hand value: " + hand1Value);
        System.out.println(player2 + "'s hand value: " + hand2Value);

        // Determine winner
        if (hand1Value > 21 && hand2Value > 21) {
            System.out.println("Both players busted!");
        } else if (hand1Value > 21) {
            System.out.println(player2 + " wins!");
        } else if (hand2Value > 21) {
            System.out.println(player1 + " wins!");
        } else if (hand1Value > hand2Value) {
            System.out.println(player1 + " wins!");
        } else if (hand2Value > hand1Value) {
            System.out.println(player2 + " wins!");
        } else {
            System.out.println("It's a tie!");
        }

        scanner.close();
    }
}
