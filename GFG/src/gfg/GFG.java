/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfg;

/**
 *
 * @author steph
 */
// Java program to find quotient and remainder
// when a number is divided by large number
// represented as String.
import java.util.Vector;

class GFG {

// Function to calculate the modulus
	static void modBigNumber(String num, long m) {
		// Store the modulus of big number
		Vector<Integer> vec = new Vector<>();
		long mod = 0;

		// Do step by step division
		for (int i = 0; i < num.length(); i++) {

			int digit = num.charAt(i) - '0';

			// Update modulo by concatenating
			// current digit.
			mod = mod * 10 + digit;

			// Update quotient
			int quo = (int) (mod / m);
			vec.add(vec.size(), quo);

			// Update mod for next iteration.
			mod = mod % m;
		}

		System.out.print("\nRemainder : " + mod + "\n");

		System.out.print("Quotient : ");

		// Flag used to remove starting zeros
		boolean zeroflag = false;
		for (int i = 0; i < vec.size(); i++) {
			if (vec.get(i) == 0 && zeroflag == false) {
				continue;
			}
			zeroflag = true;
			System.out.print(vec.get(i));
		}

		return;
	}

// Driver Code
	public static void main(String[] args) {

		String num = "727202214173249351";
		long m = 6;
		modBigNumber(num, m);
	}
}
