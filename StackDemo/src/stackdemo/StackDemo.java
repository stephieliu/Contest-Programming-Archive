/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackdemo;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class StackDemo {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //declaring a stack to store integers in
        Stack<Integer> intStack1 =new Stack<Integer>();
        //Declaring a stack to store strings
        Stack<String>strStack1 = new Stack<String>();
        //declaring a stack to store double
        Stack<Double>doubleStack1 = new Stack<Double>();
        //push
        intStack1.push(10);
        intStack1.push(20);
        //looking at the element in the top of the stack
        System.out.println(intStack1.peek());
        System.out.println(intStack1.peek());
        //removing the element at the top of the stack
        System.out.println(intStack1.pop());
        System.out.println(intStack1.peek());
        //the size of the stack
        System.out.println(intStack1.size());
        //isEmpty
        System.out.println(intStack1.isEmpty());
        //adding multiple elements into the stack
        for(int i = 0; i<5; i++){
            int k = input.nextInt();
            intStack1.push(k);
        }
        while(!intStack1.empty()){
            System.out.println(intStack1.pop());
        }
    }
    
}
