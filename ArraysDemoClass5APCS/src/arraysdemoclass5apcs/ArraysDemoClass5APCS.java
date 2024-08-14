/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysdemoclass5apcs;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class ArraysDemoClass5APCS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //declaring an integer array
        int [] intArr1 = new int[5];
        //assigning value into an array
        intArr1[0] = 14;
        intArr1[1] = 15;
        intArr1[2] = 16;
        intArr1[3] = 67;
        intArr1[4] = 99;
        //printing the value in a specified index:
        System.out.println(intArr1[0]);
        //assigning value to an array using for loop
        for(int i = 0; i<intArr1.length; i++){
            intArr1[i] = input.nextInt();
        }
        //using for loop to print the elements of an array
        for(int i = 0; i<intArr1.length; i++){
            System.out.print(intArr1[i]+"\t");
        }
        System.out.println("");
        //if we know the content of the array we can 
        int [] intArr2 = {87, 90, 99, 91, 92, 72};
        //for each loop
        for(int k: intArr2){
            System.out.print(k+" ");
        }
        //Ex 1: generate too integers between 1 and 20 randomly and print
        //their frequency along with the number
        
        int [] arr = new int [20];
        for(int i = 0; i<500; i++){
            int rand = (int)(Math.random()*(20))+1;
            System.out.println(rand);
            arr[rand-1]++;
        }
        for(int i = 0; i<20; i++){
            System.out.println((i+1)+"-" +arr[i]);
        }
        //ex 2: reverse the array
        int [] arr1 = {98, 45, 100, 67, 101, 200};
        for(int i = 0, j = arr1.length-1; i<arr1.length; i++){
            int temp = arr1[i];
            arr1[i] = arr1[j-i];
            arr[j-1] = temp;
        }
        for(int i = 0; i< arr1.length; i++){
            System.out.print(arr1[1]+"\t");
        }
        System.out.println("");
        //45 67 98, 100, 101, 200
        //find the max and min value in an array
        //assme the first element is the max and min
        int max = arr1[0];
        int min = arr1[0];
        
    }
    
}
