/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tides;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Tides {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int N = input.nextInt();
//        int [] tides = new int [N];
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        
//        int temp = 0;
//        for(int i = 0; i<N; i++){
//            tides[i] = input.nextInt();
//            if(tides[i]<min){
//                min = tides[i];
//                temp = i;
//            }
//            if(tides[i]>max){
//                max = tides[i];
//            }
//        }
//        boolean tide = true;
//        int [] diff = new int [N-1-temp];
//        for(int i = 0; i<N-1-temp; i++){
//            diff[i] = tides[temp+i+1]-tides[temp+i];
//            if(diff[i]<0){
//                System.out.println("unknown");
//                tide = false;
//                break;
//            }
//        }
//        if(tide){
//            System.out.println(Math.abs(max)-Math.abs(min));
//        }
//    }
//    
//}
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        boolean f = true;
        boolean s = false;
        int[] tmp = new int[N];
        int n = 0;
        int max = 0; 
        int min = 10000;
        for(int i = 0; i < N; i++){
            tmp[i] = input.nextInt();
            if(tmp[i] < min){
                min = tmp[i];
            }
            if(tmp[i] > max){
                max = tmp[i];
            }
        }
        n = tmp[0];
        if(n == min){
            s = true;
        }
        for(int i = 1; i < N; i++){
            if(tmp[i] == max || n == max){
                break;
            }
            if(tmp[i] - n < 0 && s){
                f = false;
                break;
            }
            if(tmp[i] == min){
                s = true;
            }
            n = tmp[i];
        }
        if(f && s){
            System.out.println(max - min);
        }
        else{
            System.out.println("unknown");
        }
    }
}
