/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoftwostacks;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class GameofTwoStacks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int g = input.nextInt();
        Stack <Integer> A = new Stack<>();
        Stack <Integer> B = new Stack<>();
        int count = 0;
        int sum = 0;
        int x = 0;
        for(int i = 0; i<(g*3); i++){
            int n = input.nextInt();
            int m = input.nextInt();
            x = input.nextInt();
            for(int j = 0; j<n; j++){
                A.push(input.nextInt());
            }
            for(int y = 0; y<m; y++){
                B.push(input.nextInt());
            }
        }
        while(sum!=x){
            if(A.peek()<B.peek()){
                sum = sum + A.peek();
                count++;
            }
            else if(B.peek()<A.peek()){
                sum = sum + B.peek();
                count++;
            }
            else{
                sum = sum + A.peek();
                count++;
            }
        }
        System.out.println(count);
    }
    
}
