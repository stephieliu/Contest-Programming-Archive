/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mountainview;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class MountainView {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //My first attempt at mountain view
        //didn't work because it was too slow
        //Deleted some parts in an attempt to fix but it didn't work
        //mountainview1 is the working file
        Scanner input = new Scanner(System.in);
        for(int i = 0; i<10; i++){
            int n = input.nextInt();//number of mountains
            int [][] mountainHeight = new int [2][n];
            for(int j = 0; j<n; j++){
                mountainHeight[0][j] = input.nextInt();
                mountainHeight[1][j] = j;
            }
            //collected the information using for loop
            //pick any mountain number, and check surrounding mountains
            //if those mountains are shorter, then that is the 
            //best view
            for(int j = 0; j<n; j++){
                for(int x = 0; x<n; x++){
                    
                }
            }
        }
    }
    
}
