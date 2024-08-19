/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedlooppracticeproblems;

/**
 *
 * @author steph
 */
import java.util.*;
public class NestedLoopPracticeProblems {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //1.
//        for(int i = 0; i<5; i++){
//            for(int j = 0; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        
        //2.
//        System.out.print("Size: ");
//        int s = sc.nextInt();
//        for(int i = 0; i<s; i++){
//            for(int j = 0; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        
        //3.
//        System.out.print("Width: ");
//        int w = sc.nextInt();
//        System.out.print("\nHeight: ");
//        int h = sc.nextInt();
//        for(int i = 0; i<h; i++){
//            for(int j = 0; j<w; j++){
//                if((j%2 == 0 && i%2 == 0) || (j%2 != 0 && i%2 != 0)) System.out.print("*");
//                else if((j%2 == 0 && i%2 != 0) || (j%2 != 0 && i%2 == 0)) System.out.print(" ");
//            }
//            System.out.println();
//        }
        
        //4.
//        System.out.println("Base    Result");
//        for(int i = 1; i<=20; i++){
//            System.out.println(i + "\t"+ (int)Math.pow(i, 2));
//        }
        
        //5.
        while(true){
            System.out.println("Enter an integer from 0 - 9.");
            int user = sc.nextInt();
            if(user == -1) break;
            
        }
        
        sc.close();
    }
    
}
