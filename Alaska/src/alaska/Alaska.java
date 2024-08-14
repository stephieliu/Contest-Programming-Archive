/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alaska;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Alaska {

    /**
     * @param args the command line arguments
     */
    
    //I made this program for infinite scenarios, because 
    //the question said the input contained several scenarios.
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] locations = new int [n];
        for(int i = 0; i<n; i++){
            locations[i] = input.nextInt();
        }
        for(int i = 0; i<n; i++){
            if(locations[i]+200 != locations[i+1]){
                System.out.println("IMPOSSIBLE");
                break;
            }
            else if(locations[i]+200 == locations[i+1]&&i+1 == n){
                System.out.println("POSSIBLE");
                break;
            }
        }
    }
    
}
