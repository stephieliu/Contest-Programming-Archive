/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card;

/**
 *
 * @author steph
 */
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
            String [] strRank = {"2","3","4","5","6","7","A","8","9","10","J","K","Q"};
            String [] strSuit = {"D","C","H","S"};
            int [] intPoint = {2,3,4,5,6,7,8,9,10,1,0,0,0};
            Deck d1 = new Deck(strRank, strSuit, intPoint);
            System.out.println(d1);
            d1.shuffle();
        }
}