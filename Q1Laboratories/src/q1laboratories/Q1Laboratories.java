/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1laboratories;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Q1Laboratories {

    /**
     * @param args the command line arguments
     */
    public static void SelectionSort(String [] strArr){
        for(int i = strArr.length-1; i>=0; i--){
            String strTemp = strArr[0];
            int index = 0;
            for(int j = 0; j<=i; j++){
                if(strArr[j].compareTo(strTemp)>=0){
                    strTemp = strArr[j];
                    index = j;
                }
            }
            String temp = strArr[i];
            strArr[i] = strTemp;
            strArr[index] = temp;
        }
    }
    public static void PrintArray(String [] strArr){
        for(int i = 0; i<strArr.length; i++){
            System.out.print(strArr[i]+"\t");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String [] strArr = {"B", "E", "A", "C", "M", "F"};
//        SelectionSort(strArr);
//        PrintArray(strArr);
        int nDep = input.nextInt();
        String [] strDep = new String[nDep];
        for(int i = 0; i<nDep; i++){
            strDep[i] = input.next();
        }
        SelectionSort(strDep);
        String temp = strDep[0];
        int count = 0;
        
        for(int i = 0; i<strDep.length; i++){
            if(strDep[i].equals(temp)){
                count++;
            }
            else{
                System.out.println(temp+"\t"+count);
                count = 1;
                temp = strDep[i];
            }
        }
        System.out.println(temp+"\t"+count);
    }
    
}
