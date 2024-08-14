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
public class TwoDimensionalArrayPractice {
    public static void main(String [] args){
//        Scanner input = new Scanner(System.in);
//        int [][] intArr1 = {{1,2,3}, {4,5,6}, {7,8,9}};
//        /**
//         * print the right and left diagonal elements
//         * in the same line
//         */
//        for(int i = 0; i<intArr1.length; i++){
//            System.out.println(intArr1[i][i]+"\t"+intArr1[i]
//                    [intArr1.length-i-1]);
//        }
//        /**
//         * reverse the rows in intArr2
//         */
        int [][] intArr2 = {{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}};
        int [] intTemp = intArr2[0];//stores 1 2 3
//        for(int i = 0; i<intTemp.length; i++){
//            System.out.print(intTemp[i]+"\t");
//        }
//        System.out.println("");
        for(int x = 0; x<intArr2.length/2; x++){
            intTemp = intArr2[x];
            intArr2[x] = intArr2[intArr2.length-x-1];
            intArr2[intArr2.length-x-1] = intTemp;                
        }
        for(int i = 0; i<intArr2.length; i++){
            for(int j = 0; j<intArr2[i].length; j++){
                System.out.print(intArr2[i][j]+"\t");
            }
            System.out.println("");
        }
        //should give
        /**
         * 13 14 15
         * 10 11 12
         * 9 8 7
         * 6 5 4
         * 3 2 1
         */
    }
}
