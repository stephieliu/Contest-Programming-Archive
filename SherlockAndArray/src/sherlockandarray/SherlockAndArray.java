/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sherlockandarray;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class SherlockAndArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for(int i = 0; i<T; i++){
            int n = input.nextInt();
            int [] Array = new int [n];
            for(int j = 0; j<n; j++){
                Array[j] = input.nextInt();
            }
            System.out.println(decision(Array));
           
        }
    }
    public static String decision(int [] Array){
        int sum = 0;
        for(int i = 0; i<Array.length; i++){
            sum +=Array[i];
        }
        int c = 0;
        for(int j = 0; j<Array.length; j++){
            if(c == sum - Array[j]-c){
                return "YES";
            }
            c += Array[j];
        }
        return "NO";
    }
        
    

}


    

