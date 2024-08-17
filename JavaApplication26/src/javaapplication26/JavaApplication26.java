/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mark;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your mark: ");
        mark = input.nextInt();  
        
        if (mark >= 90){
            System.out.println("You got an 'A'! Good job!");          
        }else if (mark >= 80) {
            System.out.println("You got a 'B'. Still good!");
        } else if (mark >= 70){
            System.out.println("You got a 'C'. You can do better!");
        }else{
            System.out.println("You suck. Try harder next time... ");
        }
    }
    
}
