/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dotheshuffle;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class DoTheShuffle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b = 0;
        int n = 0;
        String[] CMP = {"A", "B", "C", "D", "E"};
        OUTER:
        while (true) {
            b = input.nextInt();
            n = input.nextInt();
            switch (b) {
                case 1:
                    CMP = b1(CMP, n);
                    break;
                case 2:
                    CMP = b2(CMP, n);
                    break;
                case 3:
                    CMP = b3(CMP, n);
                    break;
                default:
                    System.out.println(Arrays.toString(CMP).replace("[", "").replace("]", "").replace(",", ""));
                    break OUTER;
            }
        }   
    }
    public static String[] b1(String[] a, int n){
        for(int j = 0; j < n; j++){
            String t = a[0];
            for(int i = 1; i < 5; i++){
                a[i - 1] = a[i];
            }
            a[4] = t;
        }
        return a;
    }
    public static String[] b2(String[] a, int n){
        for(int j = 0; j < n; j++){
            String t = a[4];
            for(int i = 4; i > 0; i--){
                a[i] = a[i - 1];
            }
            a[0] = t;
        }
        return a;
    }
    public static String[] b3(String[] a, int n){
        for(int i = 0; i < n; i++){
            String t = a[0];
            a[0] = a[1];
            a[1] = t;
        }
        return a;
    }
}        
    


