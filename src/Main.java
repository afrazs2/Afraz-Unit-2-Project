import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Blackjack game = new Blackjack();


        System.out.println("Welcome to Simplified Blackjack!");
        System.out.println("Your starting hand value: " + game.getPlayerTotal());



        System.out.println("Do you want to hit or stand? ");
        String input = scan.nextLine();


        if (input.equals("hit")) {
            game.playerHit();
            System.out.println("You drew a card! Total now: " + game.getPlayerTotal());
        } else {
            System.out.println("Player stands for now.");
        }



        scan.close();
    }
}
