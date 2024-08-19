/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rollthedice;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class RollTheDice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int count = 0;
        for(int i = 1; i<=m && i<10; i++){
            if(10-i<=n && 10-i>0){
                count++;
            }
        }
        if(count==1){
            System.out.println("There is "+count+" way to get the sum 10.");
        }
        else{
            System.out.println("There are "+count+" ways to get the sum 10.");
        }
    }
    
}
