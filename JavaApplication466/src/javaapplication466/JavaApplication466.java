/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication466;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class JavaApplication466 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        //while
//        //for
//        for(int i = 0; i<10; i++){
//            //i++ => i = i+1
//            //i-- => i = i-1
//            //++i is known as pre increment and i++ is post increment
//            System.out.println(i+" Hollo World");
//        }
//        //do while
//        //post-increment will print 10 instead of 11 in the following eample:
//        int j = 10;
//        System.out.println(j++);
//        //pre-increment will print 11
//        j = 10;
//        System.out.println(++j);
        //use the for loop and print the following number pattern
        //2 4 8 16 32 64 128 256 512 1024 2048
//        for(int i = 1; i<=10; i++){
//            System.out.println((int)Math.pow(2, i)+"\t");
//        }
        //print the following pattern using one loop:
        //1 2 3 4 5
        //2 4 6 8 10
        //3 6 9 12 15
        //4 8 12 16 20
        //5 10 15 20 25
//        int a = 1, b = 2, c = 3, d = 4, e = 5;
//        for(int i = 1; i<=5; i++){
//            System.out.println(i*a+"\t"+i*b+"\t"+i*c+"\t"+i*d+"\t"
//                    +i*e+"\t");
//        }
//        //print the pattern before with a nested for loop:
//        for(int i = 1; i<=5; i++){
//            for(int j = 1; j<=5; j++){
//                System.out.print(i*j+"\t");
//            }
//            System.out.println();
//        }
        //while loop
        //read an integer from user until the user enters a negative integer
//        while(true){
//            int read = input.nextInt();
//            if(read>0){
//                System.out.println(read);
//            }
//            else break;
//        }
//        //what is the minumum number of times a while loop will execute?
//        //The answer is 0.
//        //If the condition is not true, it will never execute it
//        
//        //do while loop
//        int intY = input.nextInt();
//        do{
//            System.out.println(intY);
//        }
//        while(intY>0);
         for (int i = 1; i <= 5; i++) {
        for (int j = i; j > 0; j--) {
           System.out.print(i);
        }
        System.out.println();
     }
    }
    
}
