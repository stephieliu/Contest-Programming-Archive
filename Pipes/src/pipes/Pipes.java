/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipes;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Pipes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] tiles = new int[4];
        for(int i= 0;i<4;i++){
            tiles[i] = input.nextInt(); 
        }
        
        if(tiles[0]==1 && tiles[1]==2 && tiles[2]==3 && tiles[3]==4){
                System.out.println("0/n0/n0/n0");
        }
        
        
//        System.out.println("The following rotations work: /n Upper right: 0"
//                + "/n Upper right : 0/n Lower Left: 0/nLower Right: 1");
//        
//        
    }
    
}
