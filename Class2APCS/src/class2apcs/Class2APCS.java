/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class2apcs;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Class2APCS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(Math.random());
        //Math.random() generates a number between 0 and 1
        int intR1 = (int)(Math.random()*10);
        System.out.println(intR1);
        //This give a number from 0 to 9
        int intR2 = (int)(Math.random()*11)+1;
        //between 1 and 11
        //if we need to generate a random number between min and mas
        //then (int)(Math.random()*(max-min+1)+min
        //-20, 100
        int intR3 = (int)(Math.random()*(100+20+1)-20);
        System.out.println(intR3);
        
        //Declaring boolean variables
        boolean isThirsty = true;
        boolean isHungry = true;
        //using boolean expression in programming
        if(isHungry){
            System.out.println("Call Pizza Hut");
        }
        else{
            System.out.println("Do your APCS Homework");
        }
        System.out.println("I am outside of if");
        
        //Using Relational Operators
        int intX = 10;
        int intY = 20;
        int intZ = 30;
        int intD = 10;
        //checking for equality
        if(intX == intD){
            //== can be only used to compare primitive data types
            //Primitive data types = Data types that are not objects
            System.out.println(intX+" is the same as "+intD);
        }
        //Not equal
        if(intX!= intY){
            System.out.println(intX+" is not the same as "+intY);
        }
        //greater than or equal
        if(intY >= intX){
            System.out.println(intY+" is greater than "+intX);
        }
        //smaller than or equal
        if(intX <= intY){
            System.out.println(intX+" is less than "+intY);
        }
        //comparing the relational operators with or / and
        if(intX<intY && intY<intZ){
            System.out.println(intX+" is the smallest");
            //from left to right, && takes higher precedence
            //than or
        }
    }
    
}
