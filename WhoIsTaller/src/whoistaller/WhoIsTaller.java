/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whoistaller;

/**
 *
 * @author Stephie
 */
import java.util.*;

class WhoIsTaller {

    /**
     * @param args the command line arguments
     */
    private int V;   // No. of vertices 
    private LinkedList<Integer> adj[]; //Adjacency Lists 
  
    // Constructor 
    WhoIsTaller(int v) 
    { 
        V = v; 
        adj = new LinkedList[v]; 
        for (int i=0; i<v; ++i) 
            adj[i] = new LinkedList(); 
    } 
  
    // Function to add an edge into the graph 
    void addEdge(int v,int w) 
    { 
        adj[v].add(w); 
    } 
  
    // prints BFS traversal from a given source s 
    public void BFS(int src) 
    { 
        // Mark all the vertices as not visited(By default 
        // set as false) 
        boolean visited[] = new boolean[V]; 
  
        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>(); 
  
        // Mark the current node as visited and enqueue it 
        visited[src]=true; 
        queue.add(src); 
  
        while (queue.size() != 0) 
        { 
            // Dequeue a vertex from queue and print it 
            src = queue.poll(); 
            System.out.print(src+" "); 
  
            // Get all adjacent vertices of the dequeued vertex s 
            // If a adjacent has not been visited, then mark it 
            // visited and enqueue it 
            Iterator<Integer> i = adj[src].listIterator(); 
            while (i.hasNext()) 
            { 
                int n = i.next(); 
                if (!visited[n]) 
                { 
                    visited[n] = true; 
                    queue.add(n); 
                } 
            } 
        }
        int y = queue.getLast();
        System.out.println(y);
    } 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();//number of people
        int M = input.nextInt();//number of comparisons
        int [][] tallshort =  new int [M][2];//array to store x and y values
        WhoIsTaller g = new WhoIsTaller(N);
        for(int i = 0; i<M; i++){
            for(int j = 0; j<2; j++){
                tallshort[i][j] = input.nextInt();
            }
        }
        int p = input.nextInt();
        int q = input.nextInt();
        for(int i = 0; i<M; i++){
            g.addEdge(tallshort[i][0], tallshort[i][1]);
        }
        g.BFS(q);
        g.BFS(p);
   }
    
}
