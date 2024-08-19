/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramidmessagescheme;

/**
 *
 * @author Stephie
 */
import java.util.*;
import java.math.*;
public class PyramidMessageScheme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int L = input.nextInt();//number of lists
        int originalTime = 0;
        for(int i = 0; i<L; i++){
            int n = input.nextInt();//number of message recipients
            originalTime = n*10;
            for(int j =0; j<n; j++){
                int [] Arraytree = new int[n];               
                for(int x = 0; x<n; x++){
                    Arraytree[x] = input.nextInt();
                }
                
            }
        }
    }
    
}
