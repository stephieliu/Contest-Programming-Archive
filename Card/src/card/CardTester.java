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
 * This is a class that tests the Card class.
 */
import java.util.*;
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Card c = new Card("jack","diamonds",11);
            System.out.println((c).rank());
            System.out.println((c).pointValue());
            System.out.println((c).suit());
            System.out.println((c).toString());
            Card b = new Card("queen","diamonds",12);
            System.out.println((b).rank());
            System.out.println((b).pointValue());
            System.out.println((b).suit());
            System.out.println((b).toString());
            System.out.println((b).matches(c));
            Card a = new Card("queen","diamonds",12);
            System.out.println((a).rank());
            System.out.println((a).pointValue());
            System.out.println((a).suit());
            System.out.println((a).toString());
            System.out.println((a).matches(b));
	}
}