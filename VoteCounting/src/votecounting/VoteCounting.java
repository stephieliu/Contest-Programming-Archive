/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votecounting;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class VoteCounting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a = 0;
        int b = 0;
        String vote = input.nextLine();
        
        while("A".equals(vote) || "B".equals(vote)){
            if("A".equals(vote)){
                a++;
            }
            else if ("B".equals(vote)){
                b++;
            }
            else if (vote == "E"){
                break;
            }
        }
        if(a>b){
            System.out.println("A is the winner");
        }
        else if(a<b){
            System.out.println("B is the winner");
        }
        else{
            System.out.println("It was a tie");
        }
        
    }
    
}
