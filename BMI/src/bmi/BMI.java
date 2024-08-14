/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
public class BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float w;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight (in kilograms): ");
        w = sc.nextFloat(
        );
        
        float h;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your height (in meters): ");
        h = input.nextFloat(
        );
        
        double r;
        r = w/(Math.pow(h, 2));
        
        if (r<15){
            System.out.println("Your category is Starvation.");
        }else if (r<17.5){
            System.out.println("Your category is Anorexic.");   
        }else if (r<18.5){
            System.out.println("Your category is Underweight.");
        }else if (25 > r && r >= 18.5){
            System.out.println("Your category is Ideal.");
        }else if (r>=50 && r<30){
            System.out.println("Your category is Overweight.");
        }else if (r>=30 && r<40){
            System.out.println("Your category is Obese.");
        }else if (r>=40){
            System.out.println("Your category is Morbidly Obese.");
        }else{
            System.out.println("Sorry, this program is not capable of computing your ratio.");
        }
            
    
    }
    
}
