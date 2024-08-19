/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.inputpracticeproblems;

/**
 *
 * @author steph
 */
import java.util.*;
public class MathInputPracticeProblems {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //PRODUCT OF TWO NUMBERS
//        System.out.println("Please enter the first integer value.");
//        int a = sc.nextInt();
//        System.out.println("Please enter the second integer value.");
//        int b = sc.nextInt();
//        System.out.println("The product is: "+ a*b);
        
        //AREA OF TRIANGLE
//        System.out.println("Please enter the base.");
//        int base = sc.nextInt();
//        System.out.println("Please enter the height.");
//        int height = sc.nextInt();
//        System.out.println("The area is: "+ base*height*0.5);
        
        //LENGTH OF HYPOTENUSE
//        System.out.println("Please enter the smallest side length.");
//        int smallest = sc.nextInt();
//        System.out.println("Please enter the middle side length.");
//        int middle = sc.nextInt();
//        System.out.println("The length of the hypotenuse is: " 
//                + Math.sqrt(Math.pow(smallest, 2)+Math.pow(middle, 2)));
        
        //FINDING THE AVERAGE MARK
//        System.out.print("Enter 3 marks: ");
//        int m1 = sc.nextInt(), m2 = sc.nextInt(), m3 = sc.nextInt();
//        System.out.print("\nEnter a course code: ");
//        String blank = sc.nextLine();
//        String cc = sc.nextLine();
//        System.out.print("\nEnter a student name: ");
//        String name = sc.nextLine();
//        System.out.println("\n" + name + ", your " + cc + " average is " + Math.round(((m1+m2+m3)/3.0)*100.0)/100.0);
        
        //EVEN OR ODD
//        System.out.println("Please enter an integer value.");
//        int number = sc.nextInt();
//        if(number%2 == 0) System.out.println("Even");
//        else System.out.println("Odd");
        
        //TIME CONVERTER
//        System.out.println("Please enter time in minutes (number from 1 to 999).");
//        int mins = sc.nextInt();
//        String mod = "";
//        if(mins%60 < 10) mod = "0";
//        System.out.println("The time is: " + mins/60 + ":" + mod + mins%60);
        
        //RANDOM INTEGER GENERATOR
        System.out.print("Enter the first integer: ");
        int first = sc.nextInt();
        System.out.print("Enter the second integer: ");
        int second = sc.nextInt();
        System.out.println((int)(Math.floor(Math.random()*(second - first + 1)) + first));
        
        sc.close();
    }
    
}
