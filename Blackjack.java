public class Blackjack {
    private int playerTotal;
    private int dealerTotal;

    public Blackjack() {

        playerTotal = drawCard() + drawCard();
        dealerTotal = drawCard() + drawCard();
    }

    public int drawCard() {
        return (int)(Math.random() * 10) + 2; // Card values 2–11
    }

    public int getPlayerTotal() {
        return playerTotal;
    }

    public int getDealerTotal() {
        return dealerTotal;
    }

    public int dealerHit() {
        if (dealerTotal <= 16) {
            dealerTotal += drawCard();
        }
        return dealerTotal;
    }

    public void playerHit() {
        playerTotal += drawCard();
    }
}



