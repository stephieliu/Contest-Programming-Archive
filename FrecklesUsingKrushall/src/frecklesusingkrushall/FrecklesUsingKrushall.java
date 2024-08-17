/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frecklesusingkrushall;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class FrecklesUsingKrushall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases= input.nextInt();
        for(int i = 0; i<cases; i++){
            int frecklenumber = input.nextInt();
            Graph freckles = new Graph(frecklenumber);
            freckles.addEdge(input.nextInt(), input.nextInt());
            freckles.KMST();
            //thoijeeokjsisfjoijrrdhiuhwwjheussdhiuheejhwusdhiuhwwjhsusd
        }
    }
    
}

/**
 * jneoijwwkjsis
 * 
 */






































