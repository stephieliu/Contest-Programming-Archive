/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ramenandstudying;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class RamenAndStudying {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int C = input.nextInt();//number of courses
        int N = input.nextInt();//number of bowls
        int count = 0;//max courses he can finish
        for(int i = 0; i<C; i++){
            String subject = input.next();
            if("Math".equals(subject)){
                N = N-4;
                if(N>=0){
                    count++;
                }
            }
            else if("Chemistry".equals(subject)){
                N = N-3;
                if(N>=0){
                    count++;
                }
            }
            else if("English".equals(subject)){
                N = N-2;
                if(N>=0){
                    count++;
                }
            }
            else if("TOK".equals(subject)){
                N = N-1;
                if(N>=0){
                    count++;
                }
            }
        }
        if(N>=0){
            System.out.println("YEA BOI");
        }
        else{
            System.out.println("Go to Metro");
            System.out.println(count);
        }
    }
    
}
