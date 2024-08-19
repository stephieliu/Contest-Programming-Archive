/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyears;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class LeapYears {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int start = input.nextInt();
        int end = input.nextInt();
        int counter = start;
        while(counter<=end){
           counter++;
           if(counter%4 ==0 && counter%100 != 0 && counter%400 != 0){
               System.out.println(counter);
           }
           else{
               
           }
        }
    }
    
}
