/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//MST(Minimum spanning tree)
package class10s1compcont;

/**
 *
 * @author Stephie
 */
public class Class10S1Compcont {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public class MST {

    // Number of vertices in the graph
    static final int V=3;
 
    // A utility function to find the vertex with minimum key
    // value, from the set of vertices not yet included in MST
    int minKey(double key[], Boolean mstSet[])
    {
        // Initialize min value
        double min = Integer.MAX_VALUE;
        int min_index=-1;
 
        for (int v = 0; v < V; v++)
            if (mstSet[v] == false && key[v] < min)
            {
                min = key[v];
                min_index = v;
            }
 
        return min_index;
    }
 
   // Find the minimum distance to travel every vertex in
    // a graph
   public double printMST(int parent[], int n, double graph[][])
    {
      double total = 0;
        //System.out.println("Edge   Weight");
        for (int i = 1; i < V; i++){
            //System.out.println(parent[i]+" - "+ i+"    "+
                              // graph[i][parent[i]]);
            total = total +  graph[i][parent[i]];
        }
        return total;
        //System.out.println(total);
    }
 
    // Function to construct and print MST for a graph represented
    //  using adjacency matrix representation
    public double primMST(double graph[][])
    {
        // Array to store constructed MST
        int parent[] = new int[V];
 
        // Key values used to pick minimum weight edge in cut
        double key[] = new double [V];// similar to distance array in Dikejstra
 
        // To represent set of vertices not yet included in MST
        Boolean mstSet[] = new Boolean[V];
 
        // Initialize all keys as INFINITE
        for (int i = 0; i < V; i++)
        {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }
 
        // Always include first 1st vertex in MST.
        key[0] = 0;     // Make key 0 so that this vertex is
                        // picked as first vertex
        parent[0] = -1; // First node is always root of MST
 
        // The MST will have V vertices
        for (int count = 0; count < V-1; count++)
        {
            // Pick thd minimum key vertex from the set of vertices
            // not yet included in MST
            int u = minKey(key, mstSet);
 
            // Add the picked vertex to the MST Set
            mstSet[u] = true;
 
            // Update key value and parent index of the adjacent
            // vertices of the picked vertex. Consider only those
            // vertices which are not yet included in MST
            for (int v = 0; v < V; v++)
 
                // graph[u][v] is non zero only for adjacent vertices of m
                // mstSet[v] is false for vertices not yet included in MST
                // Update the key only if graph[u][v] is smaller than key[v]
                if (graph[u][v]!=0 && mstSet[v] == false &&
                    graph[u][v] <  key[v])
                {
                    parent[v]  = u;// You are visiting the Vertex v from
                    // vertext u
                    key[v] = graph[u][v];
                }
        }
 
        // print the constructed MST
        return printMST(parent, V, graph);
    }
    
    public void mst(int src){
        boolean [] isVisited = new boolean[V];//keep tracking on the 
        //vertices being explored
        int [] dist = new int [V];//keep tracking on the distances
        //to all the vertices
        int [] parents = new int [V];//keep tracking on the parent vertex
        for(int i = 0; i<V; i++){
            isVisited[i] = false;
        }
        for(int i =0; i<V; i++){
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0;
        parents[src] = 0;
        for(int i = 0; i<V-1; i++){
            //find the nest vertes to be visited with lowest distance
            int u = minimumIndex(dist, isVisited);
            isVisited[u] = true;
        }
        //explore every vertice that is adjacent to vertex u
        //and not being explored yet. update the distance
        for(int j = 0; j<V; j++){
            if(isVisited[j] && adjWeight[u][j]>0 && dist[j]>adjWeight[u][j]){
                dist[j]?adjWeight[u][j];
                dist[j] = adjWeight[u][j];
                parents[j] = u;
            }
            
        }
        System.out.println("Vertex"+"\t"+"Dis"+"\t"+"Parents");
        
        }
    }
    }
