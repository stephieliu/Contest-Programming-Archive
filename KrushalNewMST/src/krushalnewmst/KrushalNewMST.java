/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krushalnewmst;

/**
 *
 * @author Stephie
 */
import java.util.*;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.ArrayList;
public class KrushalNewMST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Graph g1 = new Graph(5);
        g1.addEdge(0,1,1);
        g1.addEdge(1,2,2);
        g1.addEdge(2,3,3);
        g1.addEdge(3,0,2);
        g1.addEdge(2,0,1);
        g1.addEdge(2,4,5);
        g1.addEdge(4,3,6);
        g1.KMST();
    }
    
}
