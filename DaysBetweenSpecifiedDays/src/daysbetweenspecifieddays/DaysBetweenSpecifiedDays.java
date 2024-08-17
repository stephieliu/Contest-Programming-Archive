/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daysbetweenspecifieddays;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class DaysBetweenSpecifiedDays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first day of the year: ");
        String day = input.next();
        System.out.print("Enter month, day of the week, ordinal: ");
        String a = input.next();
        System.out.print("Enter month, day of the week, ordinal: ");
        String b = input.next();
        
        char month1 = a.charAt(1);
        char dow1 = a.charAt(2);
        char ordinal1  = a.charAt(3);
        char month2 = b.charAt(1);
        char dow2 = b.charAt(2);
        char ordinal2 = b.charAt(3);
        int result;
        
        if(month1 == month2){
            result = (ordinal2/ordinal1)*7;
        }
        else{
            result = (month1-month2) * (ordinal2/ordinal1)*7;
        }
    }
    
}
