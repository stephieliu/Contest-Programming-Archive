/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package narcissisticnumber;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class NarcissisticNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i = 100; i<=1000 && i>=100; i++){
            int a = i;
            LinkedList<Integer> data = new LinkedList <>();
            while(a>0){
                data.push(a%10);
                a = a/10;
            }
            int b = 0;
            for(Integer n : data){
                b += Math.pow(n, data.size());
            }
            if(i == b){
                System.out.println(i);
            }
        }
    }   
}
