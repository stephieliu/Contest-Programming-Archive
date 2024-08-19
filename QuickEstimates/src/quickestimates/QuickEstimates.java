/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quickestimates;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class QuickEstimates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        String temp = input.nextLine();
        for(int i = 0; i<N; i++){
            String cost = input.nextLine();
            System.out.println(cost.length());
        }
    }
    
}
