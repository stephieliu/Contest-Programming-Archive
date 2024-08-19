/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawarmup;

/**
 *
 * @author steph
 */
import java.util.*;
public class JavaWarmup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //HELLOW WORLD
//        System.out.println("Hello World!");
        
        //VARIABLES
        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter your name.");
//        String name = sc.nextLine();
//        System.out.println("Hello, "+name+"!");
        
        //MATH OPERATIONS
//        System.out.println("Please enter two integers separated by a space.");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println((long)Math.pow(a,b));

        //CONDITIONS
//        System.out.println("Please enter your age.");
//        int age = sc.nextInt();
//        if(age>=18){
//            System.out.println("You are old enough to vote!");
//        }
//        else{
//            System.out.println("You are not old enough to vote.");
//        }
        
        //MULTIPLE CONDIITIONS
//        boolean valid = false;
//        for(;!valid;){
//            System.out.println("Please enter your age.");
//            int age = sc.nextInt();
//            if(0<=age && age<=17){
//                System.out.println("You are a minor.");
//                valid = true;
//            }
//            else if(18<=age && age<=64){
//                System.out.println("You are the age of majority.");
//                valid = true;
//            }
//            else if(age>200){
//                System.out.println("AIYA WHY U SO OLDDDD U NO PAY PENSION >:(((((((((( ok now make me lao gan ma noodles plz");
//            }
//            else if(age>=65){
//                if (age == 69) {
//                    System.out.println("You are Fatima.");
//                }
//                else System.out.println("You are an elder.");
//                valid = true;
//            }
//            else{
//                System.out.println("Invalid age.");
//            }
//        }
        
        //CHALLENGE: RANDOM NUMBERS
//        Random rand = new Random();
//        int min = 1, max = 10;
//        int random = (int) (Math.floor(Math.random() * (max - min + 1)) + min);
//        boolean correct = false;
//        while(!correct){
//            System.out.println("Guess a number between 1 and 10:");
//            int user = sc.nextInt();
//            if(user>10 || user<1){
//                System.out.println("Invalid guess! Try again.");
//            }
//            else if(user == random){
//                System.out.println("Correct!!");
//                correct = true;
//            }
//            else if(user<random){
//                System.out.println("Higher! Try again.");
//            }
//            else if(user>random){
//                System.out.println("Lower! Try again.");
//            }
//        }
        System.out.println(-10%7);
        sc.close();
    }
    
}
