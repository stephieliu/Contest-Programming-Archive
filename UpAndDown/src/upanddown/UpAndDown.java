/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upanddown;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class UpAndDown {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int s = input.nextInt();
        if(a == 0 || d == 0){
            System.out.println("N/A");
        }
        else{
            int Nikky = a - b;
            int NSteps = a + b;
            int Byron = c - d;
            int BSteps = c + d;
            while(NSteps<s){
                NSteps = a + b;
            }
            
        }
    }
    
}
