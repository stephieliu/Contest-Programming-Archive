/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shiftysum;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class ShiftySum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int k = input.nextInt();
        long sum = 0;
        for(int i = 0; i<=k; N*=10, i++){
            sum+=N;
        }
        System.out.println(sum);
    }
    
}
