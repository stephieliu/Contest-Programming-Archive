/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Frame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int H = input.nextInt();
        int W = input.nextInt();
        char [][] English = new char [H+2][W+2];
        for(int i =0 ; i<H+2; i++){
            for(int j = 0; j<W+2; j++){
                English[i][j] = '#';
            }
        }
        for(int i = 1; i<H+1; i++){
            String n = input.next();
            for(int j = 1; j<W+1; j++){
                English[i][j] = n.charAt(j-1);
            }
        }
        
        for(int i = 0; i<H+2; i++){
            for(int j = 0; j<W+2; j++){
                
                System.out.print(English[i][j]);
            }
            System.out.println();
        }
        
    }
    
}
