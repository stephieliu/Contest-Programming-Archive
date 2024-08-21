/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniqueelement;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class UniqueElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        Set <Integer> distinct = new HashSet();
        for(int i = 0; i<N; i++){
            int x = input.nextInt();
            distinct.add(x);
        }
        System.out.println(distinct.size());
    }
    
}
