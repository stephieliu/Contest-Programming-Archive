/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2darrayextrapracticeproblems;

/**
 *
 * @author steph
 */
import java.util.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //2.
//        System.out.println("Enter an odd, positive integer.");
//        int n = sc.nextInt();
//        int [][] arr = new int[n][n];
//        int [] freq = new int[9];
//        int max = 0;
//        for(int i = 0; i<n; i++){
//            for(int j = 0; j<n; j++){
//                arr[i][j] = (int)(Math.random()*9+1);
//                freq[arr[i][j]-1]++;
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//        for(int i = 0; i<9; i++){
//            if(freq[i]>=freq[max]){
//                max = i;
//            }
//        }
//        System.out.println(max+1);
        
        //3.
//        System.out.println("Enter a positive integer.");
//        int n = sc.nextInt(), temp = 0;
//        int [][] arr = new int[n][n];
//        for(int i = 0; i<n; i++){
//            for(int j = 0; j<n; j++){
//                arr[i][j] = (int)(Math.random()*9+1);
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//        for(int i = 0; i<n; i++){
//            for(int j=0; j<n/2; j++){
//                temp = arr[i][j];
//                arr[i][j] = arr[i][n-j-1];
//                arr[i][n-j-1] = temp;
//            }
//        }
//        System.out.println();
//        for(int i = 0; i<n; i++){
//            for(int j = 0; j<n; j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
        
        //4.
//        int n = sc.nextInt();
//        int [][] arr = new int[n][n];
//        for(int i = 0; i<n; i++){
//            for(int j = 0; j<n; j++){
//                if(j == n-i-1) arr[i][j] = 1;
//                else if(j>n-i-1) arr[i][j] = 2;
//                else arr[i][j] = 0;
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
        
        //5. RouteCipher
        int EorD = sc.nextInt();//1 for encrypt, 2 for decrypt
        sc.nextLine();//read the newline scanner
        String message = sc.nextLine();
        if(message.length()%2 != 0) message += " ";//space is a buffer for 
        //reading odd length into an array
        String r1 = "", r2 = "";
        //if encrypting:
        if(EorD == 1){
            r1 = message.substring(0, message.length()/2);
            r2 = message.substring(message.length()/2);
            for(int i = 0; i<message.length()/2; i++){
                System.out.print(r1.substring(i, i+1)+r2.substring(i, i+1));
            }
        }
        //if decrypting:
        else if(EorD == 2){
            for(int i = 0; i<message.length(); i++){
                if(i%2 == 0) r1+=message.substring(i, i+1);
                else r2 += message.substring(i, i+1);
            }
            System.out.print(r1+r2);
        }
        System.out.println();
        
        sc.close();
    }
    
}
