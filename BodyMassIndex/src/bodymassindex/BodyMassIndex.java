/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodymassindex;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class BodyMassIndex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();
        double height = input.nextDouble();
        double BMI = weight/(height*height);
        if(BMI>25){
            System.out.println("Overweight");
        }
        else if(BMI>=18.5&&BMI<=25){
            System.out.println("Normal weight");
        }
        else{
            System.out.println("Underweight");
        }
    }
    
}
