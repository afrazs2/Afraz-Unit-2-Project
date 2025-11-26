import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Blackjack game = new Blackjack();


        System.out.println("Welcome to Simplified Blackjack!");
        System.out.println("Your starting hand value: " + game.getPlayerTotal());
        System.out.println("Dealer's starting hand value: " + game.getDealerTotal());


        while (true) {
            System.out.println("Do you want to hit or stand? ");
            String input = scan.nextLine();


            if (input.equalsIgnoreCase("hit")) {
                game.playerHit();
                System.out.println("You drew a card! Total now: " + game.getPlayerTotal());


                if (game.getPlayerTotal() > 21) {
                    System.out.println("You busted! Dealer wins.");
                    return;
                }


            } else if (input.equalsIgnoreCase("stand")) {
                System.out.println("You stand.");
                break;
            } else {
                System.out.println("Invalid input. Type hit or stand.");
            }
        }


        System.out.println("Dealer's turn:");
        while (game.getDealerTotal() <= 16) {
            System.out.println("Dealer hits");
            game.dealerHit();
            System.out.println("Dealer's total is now: " + game.getDealerTotal());
        }


        if (game.getDealerTotal() > 21) {
            System.out.println("Dealer busts! You win!");
            return;
        }


        System.out.println("Final Results:");
        System.out.println("Your total: " + game.getPlayerTotal());
        System.out.println("Dealer total: " + game.getDealerTotal());


        if (game.getPlayerTotal() > game.getDealerTotal()) {
            System.out.println("You win!");
        } else if (game.getPlayerTotal() < game.getDealerTotal()) {
            System.out.println("Dealer wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}


