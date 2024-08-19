/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solnforslotmachines;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Solnforslotmachines {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int m[] = new int[3], time[] = {35, 100, 10},reward[] = {30, 60, 9};
        for(int i = 0; i<3; i++){
            m[i] = input.nextInt();
           
        }
        int count = 0;
        while(N>0){
            for(int i = 0; i<3; i++){
                m[i]++;N--; count++;
                if(m[i]==time[i]){
                    N+=reward[i]; m[i] = 0;
                }
                if(N==0) break;
            }
        }
        
//        int M1 = input.nextInt();
//        int M2 = input.nextInt();
//        int M3 = input.nextInt();
//        int count = 0;
//        while(true){
//            M1++; N--; count++;
//            if(M1 == 35){
//                N+=30; M1 = 0;
//            }
//            if(N==0) break;
//            M2++; N--; count++;
//            if(M2 == 100){
//                N+=60; M2 = 0;
//            }
//            if(N==0) break;
//            M3++; N--; count++;
//            if(M3 == 10){
//                N+=9; M3 = 0;
//            }
//            if(N==0) break;
//        }
        System.out.println("Martha plays "+count+" before going broke.");
    }
    
}
