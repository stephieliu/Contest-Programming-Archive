/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veci;

/**
 *
 * @author Stephie
 */
import java.util.*;
import java.io.*;
public class Veci {
    
//    public static String [] permutation(String str, int l, int r){
//        String [] answer = new String [r];
//        permute(str, l, r);
//        
//        return answer;
//    }
//    public static int [] permute(String str, int l, int r, int [] n, int 
//            count){
//        if (l == r){ 
//            n[count]=Integer.parseInt(str);
//            count++;
//        }
//        else{ 
//            for (int i = l; i <= r; i++) { 
//                str = swap(str, l, i); 
//                permute(str, l + 1, r, n, count); 
//                str = swap(str, l, i); 
//            } 
//        }
//        return n;
//    }
//    public static String swap(String a, int i, int j){ 
//        char temp; 
//        char[] charArray = a.toCharArray(); 
//        temp = charArray[i]; 
//        charArray[i] = charArray[j]; 
//        charArray[j] = temp; 
//        return String.valueOf(charArray); 
//    }   

//    public static void main(String[] args){
//        @SuppressWarnings("resource")Scanner input = new Scanner(System.in);
//         int X = input.nextInt();
//         String str = String.valueOf(X);
//        char [] result = str.toCharArray();
//        Arrays.sort(result);
//         for(int i = 0; i<999999; i++){
//             String temp = String.valueOf(i);
//             char [] extra = temp.toCharArray();
//             Arrays.sort(extra);
//             if(Arrays.equals(result, extra)){
//                 System.out.println(i);
//                 System.exit(0);
//             }
//         }
//        System.out.println("0");
//       }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);        
        int x = input.nextInt();//store the given integer
        String str = String.valueOf(x);//convert to string
        char[] result = str.toCharArray();//array to store each digit
        Arrays.sort(result);//sort the array from least to greatest
        for(int i = x+1; i<999999; i++){
            //EXPLANATION FOR THE FOR LOOK: keep increasing by one each
            //time and look for the next int that has the same digits as x
            //by starting the search from x+1, you cannot get anything less
            //than the starting value
            String tmp = String.valueOf(i);//store the value of i as a string
            char[] extra = tmp.toCharArray();//store each digit of i into an array
            Arrays.sort(extra);//sort the extra array from least to greatest
            if(Arrays.equals(result,extra)){//if they contain the same digits,
                //this statement should be true.
                System.out.println(i);//therefore, print out i because it will
                //be the least possible integer after x that has the same digits
                //as x.
                System.exit(0);//exit the entire void after printing out
                //the answer so that you don't keep going and print 0
            }
        }
        System.out.println("0");//print 0 if there is no other value found.
    }
}
