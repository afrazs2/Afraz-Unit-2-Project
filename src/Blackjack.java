public class Blackjack {
    private int playerTotal;
    private int dealerTotal;


    public Blackjack() {
        // Deal initial two cards
        playerTotal = drawCard() + drawCard();
        dealerTotal = drawCard() + drawCard();
    }


    public int drawCard() {
        return (int)(Math.random() * 10) + 2; // Card values 2-11
    }


    public int getPlayerTotal() {
        return playerTotal;
    }


    public int getDealerTotal() {
        return dealerTotal;
    }
    public int DealerHit()
    {
        if (dealerTotal <= 16);
        {
            dealerTotal += drawCard();
            return playerTotal;
        }
    }

    public void playerHit() {
        playerTotal += drawCard();
    }



}
