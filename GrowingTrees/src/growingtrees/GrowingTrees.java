/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package growingtrees;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class GrowingTrees {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [][] arr = new int [n][2];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<2; j++){
                arr[i][0] = input.nextInt();
            }
            
        }
    }
    
}
