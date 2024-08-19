/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexicographically;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Lexicographically {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String direction1 = sc.nextLine();
        if(direction1 == "R"){
            String Direction1 = "LEFT";
        }
        else{
            String Direction1 = "RIGHT";
        }
        
        String place1 = sc.nextLine();
        String direction2 = sc.nextLine();
        if(direction2 == "R"){
            String Direction2 = "LEFT";
        }
        else{
            String Direction2 = "RIGHT";
        }
        String place2 = sc.nextLine();
        String direction3 = sc.nextLine();
        if(direction3 == "R"){
            String Direction3 = "LEFT";
        }
        else{
            String Direction3 = "RIGHT";
        }
        String place3 = sc.nextLine();
        
        System.out.println("Turn "+ Direction3+ " onto "+ place2 + " street.");
        System.out.println("Turn "+ Direction2+ " onto "+ place1+ " street.");
        System.out.println("Turn "+ Direction1+ " into your HOME.");
    }
    
}
