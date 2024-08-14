/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcs.abstractclasses;
import java.util.*;
/**
 *
 * @author Stephie
 */
public class ShapeTester {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        //you cannot create an instance of an abstract class
//        APCSAbstractClasses s1 = new APCSAbstractClasses("Square", 10);
        Rectangle r1 = new Rectangle("R", 4, 10, 5);
        //calculate the area
        System.out.println(r1.getArea());
        //Perimeter
        System.out.println(r1.getPerimeter());
        //toString
        System.out.println(r1);
        APCSAbstractClasses s2 = new Rectangle("R2", 4, 12, 3);
        //calculate the area
        System.out.println(s2.getArea());
        //Perimeter
        System.out.println(s2.getPerimeter());
        //toString
        System.out.println(s2);
        /**
         * Create a Triangle Class which has 3 additional instance
         * variables that represents the length of the three sides
         * Provide two different test cases to test your triangle class
         */
        Triangle r3 = new Triangle("R", 4, 3,4,5);
        //calculate the area
        System.out.println(r3.getArea());//should return 6.0
        //Perimeter
        System.out.println(r3.getPerimeter());//should return 12.0
        //toString
        System.out.println(r3);
        
        Triangle r4 = new Triangle("R", 4, 6,8,10);
        //calculate the area
        System.out.println(r4.getArea());//should return 24.0
        //Perimeter
        System.out.println(r4.getPerimeter());//should return 24.0
        //toString
        System.out.println(r4);
        
        Triangle T1 = new Triangle("T1", 3,3,4,5);
        //calculate the area
        System.out.println(T1.getArea());//should return 24.0
        //Perimeter
        System.out.println(T1.getPerimeter());//should return 24.0
        //toString
        System.out.println(T1.toString());
    }
}
