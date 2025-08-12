import java.util.Scanner;

public class DeckOfCards {

    // Method to initialize the deck
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck
    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute the deck
    public static String[][] distributeCards(String[] deck, int numPlayers, int numCards) {
        if (numPlayers * numCards > deck.length) {
            System.out.println("Not enough cards to distribute!");
            return null;
        }

        String[][] players = new String[numPlayers][numCards];
        int cardIndex = 0;

        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < numCards; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    // Method to print players and their cards
    public static void printPlayers(String[][] players) {
        if (players == null) return;

        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (String card : players[i]) {
                System.out.println("  " + card);
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of players: ");
        int numPlayers = sc.nextInt();
        System.out.print("Enter number of cards per player: ");
        int numCards = sc.nextInt();

        // Initialize and shuffle
        String[] deck = initializeDeck();
        shuffleDeck(deck);

        // Distribute and print
        String[][] players = distributeCards(deck, numPlayers, numCards);
        printPlayers(players);

        sc.close();
    }
}