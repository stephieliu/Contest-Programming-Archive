/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication45;

/**
 *
 * @author Stephie
 */
    import java.util.Scanner;

public class JavaApplication45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        Scanner i = new Scanner(System.in);
        System.out.println("Please enter three numbers:");
        num1 = input.nextInt(
        );
        num2 = in.nextInt(
        );
        num3 = i.nextInt(
        );
        
        if (num1>num2&& num1>num3){
            System.out.println("The largest number is "+num1);
        }else if(num2>num1&&num2>num3){
            System.out.println("The largest number is "+num2);
        }else if(num3>num1&&num3>num2){
            System.out.println("The largest number is "+num3);
        }else{
            System.out.println("They are equal.");
        }
    }
    
}
