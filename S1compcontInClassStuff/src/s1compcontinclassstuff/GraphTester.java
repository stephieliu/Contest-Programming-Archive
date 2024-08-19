/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s1compcontinclassstuff;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class GraphTester {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        S1compcontInClassStuff g1 = new S1compcontInClassStuff(5);
        //A-B//0-1
        g1.addEdge(0,1, 10);
        g1.dijkstra(1);
    }
}
