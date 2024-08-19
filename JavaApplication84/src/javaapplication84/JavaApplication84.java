/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication84;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
public class JavaApplication84 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter N: ");
        int N= input.nextInt();
        System.out.println("Enter an Array of numbers: ");
        int [] Array = new int [N];
        for (int i = 0;i<N;i++){
           Array[i] = input.nextInt();
        }
        bubblesort(Array);
    }
    public static void bubblesort(int [] intArray){
        for(int i = 0;i<intArray.length-1;i++){
        for(int j = 0;j<intArray.length-1-i;j++){
            if(intArray[j]>intArray[j-1]){
                int temp = intArray[j];
                intArray[j]= intArray[j+1];
                intArray[j+1]=temp;
            }
        }
    }
    }  
}
