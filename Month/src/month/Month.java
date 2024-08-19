/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package month;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
public class Month {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int day;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 12 inclusive: ");
        day = input.nextInt();
        
        if (day == 1){
            System.out.println("January");
        }else if (day == 2){
            System.out.println("February");
        }else if (day == 3){
            System.out.println("March");
        }else if (day == 4){
            System.out.println("April");
        }else if (day == 5){
            System.out.println("May");
        }else if (day == 6){
            System.out.println("June");
        }else if (day == 7){
            System.out.println("July");
        }else if (day == 8){
            System.out.println("August");
        }else if (day == 9){
            System.out.println("September");
        }else if (day == 10){
            System.out.println("October");
        }else if (day == 11){
            System.out.println("November");
        }else if (day == 12){
            System.out.println("December");
        }else{
            System.out.println("That is not a month. Please try again.");
        } 
            
    }
    
}
