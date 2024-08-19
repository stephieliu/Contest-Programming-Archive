/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrwangchocolatefactory;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
public class MrWangChocolateFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double regular;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your regular hourly wage: ");
        regular = input.nextDouble(
        );
        
        double hours;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of hours you worked this week: ");
        hours = in.nextDouble(
        );
        
        
        
        if(hours > 40){
           double p;
           p = (regular * hours) * 1.5;
           System.out.println("You should be paid $" + p);
        }else if(hours == 40){
            double t;
            t = regular * 40;
            System.out.println("You should be paid $" + t);   
        }else{
            double pay;
            pay = regular * hours;
            System.out.println("You should be paid $" + pay);
        }
    }
    
}
