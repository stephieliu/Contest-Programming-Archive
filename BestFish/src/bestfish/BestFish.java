/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestfish;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class BestFish {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //GATHERING INFORMATION
        //# of fish for Casper:
        int C = input.nextInt();
        //fish weights and length
        int [][] Cfish = new int [C][2];
        for(int i = 0; i<C; i++){
            for(int j = 0; j<2; j++){
                Cfish[i][j] = input.nextInt();
            }
        }        
        //# of fish for Natalie:
        int N = input.nextInt();
        int [][] Nfish = new int [N][2];
        for(int i = 0; i<N; i++){
            for(int j = 0; j<2; j++){
                Nfish[i][j] = input.nextInt();
            }
        }
        //product of the fish lengths and weights for Casper
        int [] Cproduct = new int [C+1];
        for(int i = 0; i<C; i++){
            Cproduct[i] = Cfish[i][0]*Cfish[i][1];
        }
        //product of the fish lengths and weights for Casper
        int [] Nproduct = new int [N+1];
        for(int i = 0; i<N; i++){
            Nproduct[i] = Nfish[i][0]*Nfish[i][1];
        }
        Arrays.sort(Nproduct);
        Arrays.sort(Cproduct);
        if(C==0&&N==0){
            System.out.println("Tie");
        }
        else if(C<0&&N<0){
            if(Math.abs(C)>Math.abs(N)){
                System.out.println("Natalie");
            }
            else if(Math.abs(N)>Math.abs(N)){
                System.out.println("Casper");
            }
            else{
                System.out.println("Tie");
            }
        }
        else if(Nproduct[N]>Cproduct[C]){
            System.out.println("Natalie");
        }
        else if(Nproduct[N]<Cproduct[C]){
            System.out.println("Casper");
        }
        else{
            System.out.println("Tie");
        }
    }
    
}
