/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfs;
import java.util.Scanner;
/**
 *
 * @author Stephie
 */
public class Tester {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Bfs g = new Bfs(4); 
  
        g.addEdge(0, 1,1); 
        g.addEdge(1, 0,1);
        g.addEdge(0, 2,1); 
        g.addEdge(1, 2,1);
        g.addEdge(2, 1,1);
        g.addEdge(2, 0,1); 
        g.addEdge(2, 3,1); 
        g.addEdge(3, 3,1); 
  
        
  
        g.BFS(2); 
        // 2 0 1 3
        g.DFS(2);
        Bfs g2 = new Bfs(7);
        g2.addEdge(1, 2, 1);
        g2.addEdge(2, 4, -3);
        g2.addEdge(2, 3, -2);
        g2.addEdge(2, 5, -4);
        g2.addEdge(2, 6, -2);
        g2.addEdge(3, 1, -7);
        g2.addEdge(4, 6, -3);
        g2.addEdge(5, 6, -5);
        g2.addEdge(5, 3, -1);
        g2.BellManFord(1);
        
        // Positive Infinity 0 1 -4 -2-3 1
    }
}