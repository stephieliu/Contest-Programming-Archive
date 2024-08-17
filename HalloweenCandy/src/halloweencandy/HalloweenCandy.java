/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halloweencandy;

/**
 *
 * @author Stephie
 */
import java.util.*;
import java.math.*;
public class HalloweenCandy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        BigInteger f = new BigInteger("1");
        f = f.multiply(BigInteger.valueOf(N+1));
        f = f.multiply(BigInteger.valueOf(N));
        f= f.divide(BigInteger.valueOf(2));
        System.out.println(f);
    }
}

