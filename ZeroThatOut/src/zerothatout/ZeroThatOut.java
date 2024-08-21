/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zerothatout;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class ZeroThatOut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int K = input.nextInt();
        Stack <Integer> s1 = new Stack<>();
        for(int i =0; i<K; i++){
            int temp = input.nextInt();
            if(temp!=0){
                s1.push(temp);
            }
            else if(temp==0){
                s1.pop();
            }            
        }
        int sum = 0;
        while(!s1.isEmpty()) {
            sum = sum+s1.pop();            
        }
        System.out.println(sum);        
    }
    
}
