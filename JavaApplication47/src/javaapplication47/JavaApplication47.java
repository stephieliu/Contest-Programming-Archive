/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication47;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
public class JavaApplication47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int fourthNumber;
        int fifthNumber;
        int largest;
        int smallest;
        System.out.print("Enter first number: ");
        firstNumber = input.nextInt();
        smallest = firstNumber;
        largest = firstNumber;
        System.out.print("Enter second number: ");
        secondNumber = input.nextInt();
        if(secondNumber < smallest)
            smallest = secondNumber;
        if(secondNumber > largest)
            largest = secondNumber;
        System.out.print("Enter third number: ");
        thirdNumber = input.nextInt();
        if (thirdNumber < smallest)
            smallest = thirdNumber;
        if(thirdNumber> largest)
            largest = thirdNumber;
        System.out.print("Enter fourth number: ");
        fourthNumber = input.nextInt();
        if (fourthNumber < smallest)
            smallest = fourthNumber;
        if(fourthNumber> largest)
            largest = fourthNumber;
        System.out.print("Enter fifth number: ");
        fifthNumber = input.nextInt();
        if (fifthNumber < smallest)
            smallest = fifthNumber;
        if(fifthNumber> largest)
            largest = fifthNumber;
        System.out.printf("Numbers input: %d %d %d %d %d\n\n", firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber);
        System.out.printf("Smallest number is: %d\n", smallest);
        System.out.printf("Largest number is: %d\n", largest);
    }
    
}
