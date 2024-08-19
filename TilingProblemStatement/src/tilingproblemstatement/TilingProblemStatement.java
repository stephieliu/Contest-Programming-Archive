/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tilingproblemstatement;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class TilingProblemStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //take input and assign variables
        System.out.print("Enter the length of tile 1: ");
        int tile1 = input.nextInt();
        int Area1 = tile1*tile1;
        System.out.print("Enter the cost of a box of 100: ");
        int cost1 = input.nextInt();
        int tilecost1 = cost1/100;
        System.out.print("Enter the length of tile 2: ");
        int tile2 = input.nextInt();
        int Area2 = tile2*tile2;
        System.out.print("Enter the cost of a box of 100: ");
        int cost2 = input.nextInt();
        int tilecost2 = cost2/100;
        System.out.print("Enter the length of the room in inches: ");
        int rooml = input.nextInt();
        System.out.print("Enter the width of the room in inches: ");
        int roomw = input.nextInt();
        int rooma = rooml*roomw;
        
        int calc1 = rooma/Area1*tilecost1;
        int calc2 = rooma/Area2*tilecost2;
        if(calc1<calc2){
            System.out.println("The lower cost is using tile 1.");
            int tilesneeded = rooma/Area1;
            double parttiles = rooma/Area1-tilesneeded;
            System.out.println(tilesneeded + " whole tiles and "+parttiles+ " part tiles are necessary.");
            System.out.println("The cost is $"+calc1);
        }
        else if(calc2<calc1){
            System.out.println("The lower cost is using tile 2.");
            int tilesneeded = rooma/Area2;
            double parttiles = rooma/Area1-tilesneeded;
            System.out.println(tilesneeded + " whole tiles and "+parttiles+" part tiles are necessary.");
            System.out.println("The cost is $"+calc2);
        }
    }
    
}
