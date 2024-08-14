/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commonchild;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class CommonChild {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();
        int i = 0;
        while(i<a.length()){
            if(a.charAt(i)==b.charAt(i)){
                int j = 0;
                j++;
            }
            i++;
        }
        System.out.println(j);
    }
    
}
