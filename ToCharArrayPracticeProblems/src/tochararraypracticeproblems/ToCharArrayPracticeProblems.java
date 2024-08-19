/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tochararraypracticeproblems;

/**
 *
 * @author steph
 */
import java.util.*;
public class ToCharArrayPracticeProblems {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //1.
//        System.out.println("String: ");
//        System.out.println(sc.nextLine().replaceAll("1", "one"));
        
        //2.
//        System.out.println("String: ");
//        String input = sc.nextLine();
//        System.out.println("Letter: ");
//        String letter = sc.nextLine();
//        System.out.println(input.split(letter).length);
        
        //3.
        System.out.println("String: ");
        char [] input = sc.nextLine().toCharArray();
        System.out.println("Letter: ");
        String letter = sc.nextLine();//assume only one character
        int count = 0;
        for(int i = 0; i<input.length; i++){
            if(count == 2){
                System.out.println(i-1);
                break;
            }
            if(input[i] == letter.charAt(0)){
                count++;
            }
        }
        
        if(count == 1) System.out.println(-1);
        else if(count == 0) System.out.println(-2);
        
        sc.close();        
    }
    
}
