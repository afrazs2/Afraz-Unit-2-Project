import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Blackjack game = new Blackjack();


        System.out.println("Welcome to Simplified Blackjack!");
        System.out.println("Your starting hand value: " + game.getPlayerTotal());
        System.out.println("The Dealer Starting Hand Value:" + game.getDealerTotal());



        System.out.println("Do you want to hit or stand? ");
        String input = scan.nextLine();


        if (input.equals("hit")) {
            game.playerHit();
            System.out.println("You drew a card! Total now: " + game.getPlayerTotal());
        } else {
            System.out.println("Player stands for now.");
        }
//        System.out.println("The dealers current hand is " + game.getDealerTotal());
//        if (game.getDealerTotal() <= 16)
//        {
//            System.out.println("The dealer draws a card");
//            game.DealerHit();
//            System.out.println("The Dealers current hand is  " + game.getDealerTotal());
//        }

        for (int i = game.getDealerTotal(); i < 16; i = game.getDealerTotal())
        {
            if (game.getDealerTotal() <= 16)
            {
                System.out.println("The dealer draws a card");
                game.DealerHit();
                System.out.println("The Dealers current hand is  " + game.getDealerTotal());
            }
        }





    }
}
