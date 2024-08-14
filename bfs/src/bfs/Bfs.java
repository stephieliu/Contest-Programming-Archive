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
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


/**
 *
 * @author Stephie
 */
public class Bfs {

    int V ; // The Number of Vertices
    int E ; // The Number of Edges
    int W; //The weight associated between two Edges
    int [][] adjWeight;// Keep tracking  of the weights between two
    //vertices
    boolean [][] adjMatrix;// Keep tracking whether there is a connection betweenn two
    // vertices
    
    //The constructor for the Graph
    public Bfs(int v){
        V = v;
        E = 0;// The number of edges in the beginning is zero
        adjMatrix = new boolean[V][V];
        adjWeight = new int[V][V];
        for(int i = 0; i < V; i++){
            for(int j = 0; j < V; j++){
                adjMatrix[i][j] = false;
            }
        }
    }
    
    //Adding a Edge
    /**
     * 
     * @param v1 is the starting Vertex
     * @param v2 is the ending vertex
     * @param w is the weight associated between v1 and v2
     * add the connection
     */
    public void addEdge(int v1, int v2, int w){
        if(v1 <= V && v2 <= V){
            adjMatrix[v1][v2] = true;
            adjWeight[v1][v2] = w;
            E++;
        }
    }
    /**
     * 
     * @param src is the starting Vertex
     * print the order in which the Vertices can be visited starting
     * at vertex src using the BFS algorithm
     */
    public void BFS(int src){
        /**
         * Choose any vertex( this case the src), mark it as visited and push it onto queue
            While the queue is not empty:
            Pop to top vertex v from the queue and print the vertex
            For each vertex adjacent to v that has not been visited:
            Mark it visited, and
            Push it onto the queue. This continues until the queue is empty

         */
        Queue<Integer> myQueue = new LinkedList<Integer>();
        boolean [] isVisited = new boolean[V];
        
        for(int i = 0; i < V; i++){
            isVisited[i] = false;
        }
        isVisited[src] = true;
        myQueue.add(src);
        while(!myQueue.isEmpty()){
            int Vertex = myQueue.poll();
            System.out.print(Vertex+"\t");
            for(int j = 0; j < V; j++){
                if(!isVisited[j] && adjWeight[Vertex][j] > 0){
                    myQueue.add(j);
                    isVisited[j] = true;
                }
            }
        }
        System.out.println("");
    }
    
    public void DFS(int src){

        boolean [] isVisited = new boolean[V];
        for(int i = 0; i < V; i++){
            isVisited[i] = false;
        }
        Stack<Integer> myStack = new Stack<Integer>();
        myStack.push(src);
        isVisited[src] = true;
        while(!myStack.isEmpty()){
            
            
            int Vertex = myStack.pop();
            System.out.print(Vertex +"\t");
            //Explore the neighbours of Vertex and marked them as visited 
            // and push them into the stack
            for(int j = 0; j < V; j++){
                if(!isVisited[j] && adjWeight[Vertex][j] > 0){
                    isVisited[j] = true;
                    myStack.push(j);
                }
            }
        }
        System.out.println("");
    }
    
    public void BellManFord(int src){
        //Once you update the dist array print the distance array
        int [] dist = new int[V];
        for(int i = 0; i < V; i++) dist[i] = Integer.MAX_VALUE;
        dist[src] = 0;
        
        for(int i = 0; i < V - 1; i++){         
            //To process eacg edge we need to travel though the adjMatrix
            for(int j = 0; j < V; j++){
                for(int k = 0; k < V; k++){
                    if(adjMatrix[j][k] && dist[j] + adjWeight[j][k] < dist[k]){
                        dist[k] = dist[j] + adjWeight[j][k];
                    }
                }
            }
        }
        //print the distance array
        for(int i = 0; i < V; i++){
            System.out.println(i + "\t"+ dist[i]);
        } 
        
        for(int i = 0; i < V - 1; i++){
            //To process eacg edge we need to travel though the adjMatrix
            for(int j = 0; j < V; j++){
                for(int k = 0; k < V; k++){
                    if(adjMatrix[j][k] && dist[j] + adjWeight[j][k] < dist[k]){
                       System.out.println("There is a nagative cycle found");
                       return;
                    }
                }
            }
        }
    }
}