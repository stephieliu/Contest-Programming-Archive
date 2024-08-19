/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s1compcontclass8test1;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class S1compcontClass8Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double WT = input.nextInt()/100;
        double WA = input.nextInt()/100;
        double WP = input.nextInt()/100;
        double WQ = input.nextInt()/100;
        double totalmark = 0;
        int pass = 0;
        int NN = input.nextInt();
        for(int i = 0; i<NN; i++){
            int Ti = input.nextInt();
            int Ai = input.nextInt();
            int Pi = input.nextInt();
            int Qi = input.nextInt();
            totalmark = Ti*WT+Ai*WA+Pi*WP+Qi*WQ;
            if(totalmark>=50){
                pass++;
            }
        }
        System.out.println(pass);
    }
    
}
