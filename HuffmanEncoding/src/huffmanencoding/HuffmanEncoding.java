/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffmanencoding;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class HuffmanEncoding {

    /**
     * @param x is the binary code to be encoded
     * @param y is the array that contains all the data
     */
    
    public static void encode(int x, int [][] y){
        //need to find how many groups of code there are,
        //divide the length by 2 until the leftover is a multiple of 3
        //store each group separately in an array
        //decode each group, store into another array
        //print the array
        //find out the number of groups
        int groupsnumb = 0;
        for(int i = 0; i<y.length; i++){
            if(y.length%2!=0){
                if(y.length%3==0){
                    groupsnumb++;
                }
            }
            else if(y.length%2==0){
                groupsnumb++;
            }
        }
        //array to store the groups        
        int [] groups = new int [groupsnumb];
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int [][] lettercode = new int [2][k];
        for(int i = 0; i<2; i++){
            for(int j = 0; j<k; j++){
                lettercode[i][j] = input.nextInt();
            }
        }
        int binary = input.nextInt();
    }
}