/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lovetriangle;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class LoveTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long N = input.nextInt();
        long M = input.nextInt();
        long sum = N+M;
        long diff = Math.abs(N-M);
        long prod = N*M;
        long [] compare = {sum, diff, prod};
        Arrays.sort(compare);
        System.out.println(compare[2]);
    }
    
}
