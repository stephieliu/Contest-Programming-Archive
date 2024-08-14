/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author steph
 */
public class Deck {
    /**
	 * cards contains all the cards in the deck.
	 */
        private List<Card> cards;

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
            
                cards = new ArrayList<Card>();
		for(int i = 0; i < suits.length; i++){
                    for(int j = 0; j < ranks.length; j++){
                        Card c1 = new Card(ranks[j], suits[i], values[j]);
                        cards.add(c1);
                    }
                }
                size = cards.size();
                shuffle();

        }
	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		return  size == 0;
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		return size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		for(int i =0; i<cards.size(); i++){
                    int intRandom = (int)(Math.random()*cards.size());
                    Card c1 = cards.get(intRandom);
                    Card temp = cards.get(i);
                    cards.set(i, c1);
                    cards.set(intRandom, temp);
                }                
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
                if(cards.isEmpty()){
                    return  null;
                }
                
                else{
                    this.shuffle();
                    return cards.get(size-1);
                    
                }
                
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}

        
        public String myToString(){
            String strTemp = "";
            for(int i = 0; i < 52; i++){
                strTemp += (cards.get(i)) + "\n";//this will execute the to string method
                //of the card object
            }
            return strTemp;
        }
}
