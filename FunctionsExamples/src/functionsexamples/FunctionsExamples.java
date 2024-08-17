/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionsexamples;

/**
 *
 * @author Stephie
 */
public class FunctionsExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sayHelloto("Bob", 12);
        add(1,2);
    }
    
    public static void sayHelloto(String name, int args) {
        System.out.println(name+" is "+ args+ " years old.");
    }  
    public static int add(int num1, int num2){
        int sum = num1+num2;
        return sum;
    }
}