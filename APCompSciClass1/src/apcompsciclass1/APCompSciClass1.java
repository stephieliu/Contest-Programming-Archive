/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcompsciclass1;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class APCompSciClass1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //print() vs println() command
        System.out.print("Welcome to APCS");
        System.out.println("Hello World");
        System.out.print("Java is a high level language");
        System.out.println("This is tricky");
        //Escape sequence
        System.out.println("\"Welcome\"");
        //backslash is the escape
        //printing a tab ->\t
        System.out.println("Welcome \t Rob \t Ford");
        System.out.println("Rob\tFord");
        //tab counts 8 spaces starting from the first letter
        //if the word is already greater than 8 spaces, then it will print 8 spaces after the word
        //if the word is greater, you can align it by leaving more whitespaces for the names that have less letters
        System.out.println("Rob\t\tFord");
        System.out.println("Elephant\tFord");
        //Printing a new line -> \n
        System.out.print("Welcome:\nRob's\nFord");
        System.out.println("C:\"\nancy's dog is white\n");
         
    }
}
