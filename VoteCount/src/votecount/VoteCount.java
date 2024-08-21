/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votecount;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class VoteCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int V = input.nextInt();
        String votes = input.next();
        int A = 0, B = 0;
        for(int i = 0; i<votes.length(); i++){
            if(votes.charAt(i)=='A'){
                A++;
            }
            else{
                B++;
            }
        }
        if(A>B){
            System.out.println("A");
        }
        else if(B>A){
            System.out.println("B");
        }
        else{
            System.out.println("Tie");
        }
    }
    
}
