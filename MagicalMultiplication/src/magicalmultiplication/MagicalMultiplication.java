/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicalmultiplication;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class MagicalMultiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A = input.next();
        String B = input.next();
        int product = 0;
        for(int i = 0; i<A.length(); i++){
            for(int j = 0; j<B.length();j++){
                product = product+(Character.getNumericValue(A.charAt(i))*Character.getNumericValue(B.charAt(j)));
            }
        }
        System.out.println(product);
    }
    
}
