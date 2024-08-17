/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floyedwarshallalgorithm;

/**
 *
 * @author Stephie
 * there is a good try 
 * for (int i = 0; i<0; i++)
 */
import java.util.*;
import java.lang.*;
import java.io.*;
class FloyedWarshallAlgorithm {

    final static int INF = 99999, V = 4;
    void floydWarshall(int graph[] []){
        int dist[][] = new int [V][V];
        int i, j, k;
        for(i = 0; i<V; i++){
            
        for (i = 0; i < V; i++) 
            for (j = 0; j < V; j++) 
                dist[i][j] = graph[i][j]; 
  
        for (k = 0; k < V; k++) 
        { 
            // Pick all vertices as source one by one 
            for (i = 0; i < V; i++) 
            { 
                // Pick all vertices as destination for the 
                // above picked source 
                for (j = 0; j < V; j++) 
                { 
                    // If vertex k is on the shortest path from 
                    // i to j, then update the value of dist[i][j] 
                    if (dist[i][k] + dist[k][j] < dist[i][j]) 
                        dist[i][j] = dist[i][k] + dist[k][j]; 
                } 
            } 
        } 
  
        // Print the shortest distance matrix 
        printSolution(dist); 
        }
    }
    void printSolution(int dist[][]){ 
        
        System.out.println("The following matrix shows the shortest "+ 
                         "distances between every pair of vertices"); 
        for (int i=0; i<V; ++i) 
        { 
            for (int j=0; j<V; ++j) 
            { 
                if (dist[i][j]==Integer.MAX_VALUE) 
                    System.out.print("INF "); 
                else
                    System.out.print(dist[i][j]+"   "); 
            } 
            System.out.println(); 
        } 
    } 
  
    // Driver program to test above function 
    public static void main (String[] args){ 
        int graph[][] = { {0,   5,  INF, 10}, 
                          {INF, 0,   3, INF}, 
                          {INF, INF, 0,   1}, 
                          {INF, INF, INF, 0} 
                        }; 
        FloyedWarshallAlgorithm a = new FloyedWarshallAlgorithm(); 
  
        // Print the solution 
        a.floydWarshall(graph); 
    } 

} 
        