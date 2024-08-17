/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework17s1q2;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Homework17S1Q2 {

    public static int minIndex(int [] dist, boolean [] isVisited){
        int smallest = Integer.MAX_VALUE;
        int index= -1;
        for(int i = 0; i<dist.length; i++){
            if(dist[i]<smallest&&!isVisited[i]){
                smallest = dist[i];
                index = i;
            }
        }
        return index;
    }
    public static void MST(int [][] graph, int [][] danger){
        int [] parent = new int[graph.length];
        int [] dist = new int[graph.length];
        boolean []isVisited = new boolean[graph.length];
        for(int i = 0; i<dist.length; i++){
            dist[i] = Integer.MAX_VALUE;
            isVisited[i] = false;
        }
        dist[0] = 0;
        parent[0] = -1;
        for(int i = 0; i<dist.length-1; i++){
            //find next vertex to be visited
            int u = minIndex(dist, isVisited);
            //mark as visited
            isVisited[u] = true;
            //explore all the vertices connected to u and update distance
            for(int j = 0; j<dist.length; j++){
                if(graph[u][j]>0&&!isVisited[j]&dist[j]>graph[u][j]){
                    dist[j] = graph[u][j];
                    parent[j] = u;
                }
            }
        }
        
        for(int i = 0; i<graph.length; i++){
            System.out.println(i+"\t"+dist[i]);
        }
        int minDistance = 0;
        int minDanger = 0;
        for(int i = 1; i<parent.length; i++){
            if(graph[i][parent[i]] ==9999){
                //this is danger link
                minDistance +=danger[i][parent[i]];
                minDanger++;
            }
            else{
                minDistance+=graph[i][parent[i]];
            }
        }
        System.out.println(minDanger+"\t"+minDistance);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int [][] graph = new int [N][N];
        int [][] danger = new int [N][N];
        int M = input.nextInt();//number of connections/edges
        for(int i = 0; i<M; i++){
            int x = input.nextInt();
            int y= input.nextInt();
            int w= input.nextInt();
            int d = input.nextInt();
            if(d==0){
                graph[x-1][y-1] = w;
                graph[y-1][x-1] = w;
            }
            else{
                //assign weight between edges on the graph as 9999
                graph[x-1][y-1]=9999;
                graph[y-1][x-1] = 9999;
                danger[x-1][y-1] = w;
                danger[y-1][x-1] = w;
            }
     
        }
        MST(graph, danger);
    }
    
}
