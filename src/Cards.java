
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
