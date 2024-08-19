/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Modulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<Integer> unique = new HashSet<>();
        for(int i = 0; i<10; i++){
            int mod = input.nextInt();
            int remainder = mod%42;
            unique.add(remainder);
        }
        System.out.println(unique.size());
    }
    
}
