/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squares;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Squares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tiles = input.nextInt();
        double side  = Math.sqrt(tiles);
        int IntSide = (int)Math.floor(side);
        System.out.println("The largest square has side length "+IntSide+".");
    }
    
}
