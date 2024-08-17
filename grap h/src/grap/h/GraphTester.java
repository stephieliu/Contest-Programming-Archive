/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grap.h;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class GraphTester {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int V = 3;
        int E = 3;
        GrapH g1 = new GrapH(3,3);
        g1.edge[0].src = 0;
        g1.edge[0].dest = 1;
        g1.edge[1].src = 0;
        g1.edge[1].dest = 2;
        g1.edge[2].src = 1;
        g1.edge[2].dest = 2;
        
        if(g1.isCycle(g1)==1){
            System.out.println("Contains cycle");
        }
        else{
            System.out.println("Contains no cycle");
        }
    }
}
