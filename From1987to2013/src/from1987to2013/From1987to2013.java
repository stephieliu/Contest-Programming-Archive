/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package from1987to2013;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class From1987to2013 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int Y = input.nextInt();
        int D = Y;
        for(;;){
            D = D+1;
            if(IsUnique(D)){
                break;
            }
        }
        System.out.println(D);
    }
    static boolean IsUnique(int n){ 
        // Create an array of size 10 and initialize all 
        // elements as false. This array is used to check 
        // if a digit is already seen or not. 
        boolean arr[]=new boolean[10]; 
        for (int i = 0; i < 10; i++) 
            arr[i] = false; 
      
        // Traverse through all digits  
        // of given number 
        while (n > 0) 
        { 
            // Find the last digit 
            int digit = n % 10; 
      
            // If digit is already seen,  
            // return false 
            if (arr[digit]) 
            return false; 
      
            // Mark this digit as seen 
            else arr[digit] = true; 
      
            // Remove the last digit from number 
            n = n / 10; 
        } 
        return true; 
    }
}