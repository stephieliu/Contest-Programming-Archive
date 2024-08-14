/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. Mirosaka Naomi
 * Inoshi Hane
 * Kumo Takeru
 * 
 */
package pkg16bitswonly;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long N = input.nextInt();
        for(long i = 0; i<N; i++){
            long A = input.nextLong();
            long B = input.nextLong();
            long P = input.nextLong();
            if(A*B == P){
                System.out.println("POSSIBLE DOUBLE SIGMA");
            }
            else{
                System.out.println("16 BIT S/W ONLY");
            }
        }
    }
    
}
