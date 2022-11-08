//Instructions for Assignment 4
// Invoking Math.random() returns a (pseudo)random number of type double from
//the half-open interval [0, 1). Use this generator to draw cards from a standard deck.
//First, draw an integer from the interval [1, 4] (corresponding to suit: clubs, diamonds,
//hearts, spades) and then another number from the interval [2, 14] (deuce, trey, four,
//five, . . . , ten, Jack, Queen, King, Ace). Using the switch expression, define strings
//describing cards and display five such random cards on the console. For example, the
//following program
//download Cards.java
//public class Cards {
//public static void main(String[] args) {
//for (int i = 0; i < 5; ++i) {
///*
//* Define two integers using only Math.random():
//*
//col is a random integer from range [1, 4]
//*
//rnk is a random integer from range [2, 14]
//*/
//String color = switch(col) {
//// ...
//};
//String rank = switch(rnk) {
//// ...
//};
//System.out.println(rank + " of " + color);



public class Cards {
    public static void main(String[] args) {
        for (int i = 0; i < 5; ++i) {
            int col = 1 + (int)(Math.random()*(4-1+1));
            int rnk = 2 + (int)(Math.random()*(14-2+1));
            String color = switch (col) {
                case 1 -> "Clubs";
                case 2 -> "Diamonds";
                case 3 -> "Hearts";
                case 4 -> "Spades";
                default -> "Unknown colour";
            };
            String rank = switch (rnk) {
                case 2 -> "Ace";
                case 3 -> "Deuce";
                case 4 -> "Trey";
                case 5 -> "Four";
                case 6 -> "Five";
                case 7 -> "Six";
                case 8 -> "Seven";
                case 9 -> "Eight";
                case 10 -> "Nine";
                case 11 -> "Ten";
                case 12 -> "Jack";
                default -> "Unknown rank";
            };
            System.out.println(rank + " of " + color);
        }
    }
    }
