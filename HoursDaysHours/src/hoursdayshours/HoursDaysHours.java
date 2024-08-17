/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoursdayshours;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
public class HoursDaysHours {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int h;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of hours: ");
        h = input.nextInt(
        );
        
        int d;
        d = h / 24;
        
        int hours;
        hours = h % 24;
        
        System.out.println("It is " + d + " days and " + hours + " hours long.");
        
    }
    
}
