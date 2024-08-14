/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.necklace;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Necklace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first starting number: ");
        int start1 = input.nextInt();
        System.out.print("Enter the second starting number: ");
        int start2 = input.nextInt();
        int prevNum = (start1+start2)%10;
        
        System.out.print(start1+" "+start2+" "+prevNum+" ");
        
        for(int i = 0;;i++){
            int nextNum = (prevNum+start2)%10;
            System.out.print(nextNum+" ");
            start2 = prevNum;
            prevNum = nextNum;
            if(start2==1&&prevNum==8){
                break;
            }
        }
    }
    
}
