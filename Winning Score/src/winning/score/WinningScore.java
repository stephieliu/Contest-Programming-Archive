/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package winning.score;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class WinningScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tpa = input.nextInt();
        int twpa = input.nextInt();
        int opa = input.nextInt();
        int tpb = input.nextInt();
        int twpb = input.nextInt();
        int opb  = input.nextInt();
        int Ascore = tpa*3 + twpa*2+opa;
        int Bscore = tpb*3 + twpb*2+opb;
        if(Ascore>Bscore){
            System.out.println("A");
        }
        else if(Ascore<Bscore){
            System.out.println("B");
        }
        else if(Ascore==Bscore){
            System.out.println("T");
        }
    }
    
}
