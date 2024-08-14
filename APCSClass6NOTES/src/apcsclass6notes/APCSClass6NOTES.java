/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcsclass6notes;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class APCSClass6NOTES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //Declaring a two dimesional integer array
        int [][] arr1 = new int[3][3];
        int [][] arr2 = new int [3][4];
        //length of the 2D array is the number of rows in it
        System.out.println(arr1.length);//gives 3
        System.out.println(arr2.length);//gives 4
        //Initializing a value into a two dimensional array
        arr1[1][2] = 34;
        System.out.println(arr1[1][2]);//prints 34
        //using nested for loop to initialize a two dimensional array
        for(int i = 0; i<arr1.length; i++){
            for(int j = 0; j<arr1[i].length; j++){
                arr1[i][j] = input.nextInt();
            }
        }
        //printing a 2D array
        for(int i = 0; i<arr1.length; i++){
            for(int j = 0; j<arr1[i].length; j++){
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.println("");
        }
        //f we know the content of the two dimensional array, we can
        //initialize them by rows
        int [][] intarr3 = {{1,2},{4,5,6},{7,8,9,10}};
        //print the content of intarr3 in a table format
        /**
         * 1 2
         * 4 5 6
         * 7 8 9 10
         */
        for(int i = 0; i<intarr3.length; i++){
            for(int j = 0; j<intarr3[i].length; j++){
                System.out.print(intarr3[i][j]+" ");
            }
            System.out.println("");
        }
        //declaring a srring 2D array
        String [][] strArr = new String [3][4];
        //declaring a double array
        double [][] dblArr = new double [4][5];
        //declaring boolean array
        boolean [][] isVisited  = new boolean[3][4];
    }
    
}
