/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thereturnofaplusb;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class TheReturnOfAPlusB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for(int i = 0; i<N; i++){
            int A = input.nextInt();
            int B = input.nextInt();
            System.out.println(A+B);
        }
        
    }
    
}
