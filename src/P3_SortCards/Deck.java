package P3_SortCards;

public class Deck {
    private Card[] deck;
    private int cardCount;

    public Deck(int arraySize) {
        this.deck = new Card[arraySize];
        cardCount = 0;
    }

    public boolean addCard(Card.Color color, int number) {
        Card newCard = new Card(color, number);
        if (cardCount == deck.length)
            return false;
        else {
            deck[cardCount] = newCard;
            cardCount = cardCount + 1;
            return true;
        }
    }

    public Card[] getDeck() {
        return this.deck;
    }

    public void sortDeck() {

        for (int j = (deck.length-1); j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (deck[i].getNumber() > deck[i+1].getNumber()) {
                    Card temp = deck[i];
                    deck[i] = deck[i+1];
                    deck[i+1] = temp;
                }
            }
        }
        // TODO: Implementierung hinzufuegen
    }

    public abstract class compareTo implements Comparable <Card>{

        public int compareTo(Card.Color c1 ) {
            if (c1== Card.Color.RED)
            return 1;
            else if (c1 == Card.Color.YELLOW)
                return 2;
            else if (c1 == Card.Color.BLUE)
                return 3;
            else if (c1== Card.Color.GREEN)
                return 4;
            return 0;
        }
    }
}
