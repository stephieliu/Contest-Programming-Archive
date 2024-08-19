/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mst;

/**
 *
 * @author Stephie
 */
import java.util.*; 

  
class MSTSolutionforFreckles 
{ 
    // Number of verrtices in the graph 
    private static final int V=5; 
  
    // A utility function to find the vertex with minimum key 
    // value, from the set of vertices not yet included in MSTSolutionforFreckles 
    int minKey(int key[], Boolean mstSet[]) 
    { 
        // Initialize min value 
        int min = Integer.MAX_VALUE, min_index=-1; 
  
        for (int v = 0; v < V; v++) 
            if (mstSet[v] == false && key[v] < min) 
            { 
                min = key[v]; 
                min_index = v; 
            } 
  
        return min_index; 
    } 
  
    // A utility function to print the constructed MSTSolutionforFreckles stored in 
    // parent[] 
    void printMST(int parent[], int n, int graph[][]) 
    { 
        System.out.println("Edge \tWeight"); 
        for (int i = 1; i < V; i++) 
            System.out.println(parent[i]+" - "+ i+"\t"+ 
                            graph[i][parent[i]]); 
    } 
  
    // Function to construct and print MSTSolutionforFreckles for a graph represented 
    // using adjacency matrix representation 
    void primMST(int graph[][]) 
    { 
        // Array to store constructed MSTSolutionforFreckles 
        int parent[] = new int[V]; 
  
        // Key values used to pick minimum weight edge in cut 
        int key[] = new int [V]; 
  
        // To represent set of vertices not yet included in MSTSolutionforFreckles 
        Boolean mstSet[] = new Boolean[V]; 
  
        // Initialize all keys as INFINITE 
        for (int i = 0; i < V; i++) 
        { 
            key[i] = Integer.MAX_VALUE; 
            mstSet[i] = false; 
        } 
  
        // Always include first 1st vertex in MSTSolutionforFreckles. 
        key[0] = 0;     // Make key 0 so that this vertex is 
                        // picked as first vertex 
        parent[0] = -1; // First node is always root of MSTSolutionforFreckles 
  
        // The MSTSolutionforFreckles will have V vertices 
        for (int count = 0; count < V-1; count++) 
        { 
            // Pick thd minimum key vertex from the set of vertices 
            // not yet included in MSTSolutionforFreckles 
            int u = minKey(key, mstSet); 
  
            // Add the picked vertex to the MSTSolutionforFreckles Set 
            mstSet[u] = true; 
  
            // Update key value and parent index of the adjacent 
            // vertices of the picked vertex. Consider only those 
            // vertices which are not yet included in MSTSolutionforFreckles 
            for (int v = 0; v < V; v++) 
  
                // graph[u][v] is non zero only for adjacent vertices of m 
                // mstSet[v] is false for vertices not yet included in MSTSolutionforFreckles 
                // Update the key only if graph[u][v] is smaller than key[v] 
                if (graph[u][v]!=0 && mstSet[v] == false && 
                    graph[u][v] < key[v]) 
                { 
                    parent[v] = u; 
                    key[v] = graph[u][v]; 
                } 
        } 
  
        // print the constructed MSTSolutionforFreckles 
        printMST(parent, V, graph); 
    } 
  
    public static void main (String[] args) 
    { 
        /* Let us create the following graph 
        2 3 
        (0)--(1)--(2) 
        | / \ | 
        6| 8/ \5 |7 
        | /     \ | 
        (3)-------(4) 
            9         */
        MSTSolutionforFreckles t = new MSTSolutionforFreckles(); 
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int graph[][] = new int[y][x]; 
        for(int i = 0; i<y; i++){
            for(int j = 0; j<x; j++){
                graph[i][j] = input.nextInt();
            }
        }
        // Print the solution 
        t.primMST(graph); 
        double total = (x+y);
        System.out.println(total);
    } 
}

