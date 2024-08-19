/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetodecompress;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class TimeToDecompress {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int L= input.nextInt();
        for(int i = 0;i<L; i++){
            int times= input.nextInt();
            String character = input.next();
            for(int j = 0; j<times; j++){
                System.out.print(character);
            }
            System.out.println();
        }
    }
    
}
