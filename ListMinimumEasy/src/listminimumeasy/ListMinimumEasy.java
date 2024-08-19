/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listminimumeasy;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class ListMinimumEasy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int [] permutation = new int [N];
        for(int i = 0; i<N; i++){
            permutation[i] = input.nextInt();
        }
        Arrays.sort(permutation);
        for(int i = 0; i<N; i++){
            System.out.print(permutation[i]+" ");
        }
    }
    
}
