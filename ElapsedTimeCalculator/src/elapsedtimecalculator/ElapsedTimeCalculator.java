/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elapsedtimecalculator;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class ElapsedTimeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting hour: ");
        int start = input.nextInt();
        System.out.print("Enter the am or pm: ");
        String ampm = input.next();
        System.out.print("Enter the number of elapsed hours: ");
        int end = input.nextInt();
        String pmam = "pm";
        if(("pm").equals(ampm)){
            start+=12;
            pmam = "am";
        }
        start+=end;
        if(start>=24){
            start-=24;
        }
        System.out.println("The time is: "+start+":00 "+pmam);
    }
    
}
