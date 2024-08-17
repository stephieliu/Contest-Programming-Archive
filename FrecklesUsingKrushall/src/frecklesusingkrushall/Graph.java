/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frecklesusingkrushall;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
/**
 *
 * @author Stephie
 */
public class Graph {
    int vertices;
    ArrayList<Edge> allEdge;
    int [] parent;//keeps track of the parent vertexes
    //constructor for graph
    int [] rank;
    public Graph(int v){
        vertices = v;
        allEdge = new ArrayList<Edge>();
        //have all parents = -1
        parent = new int[v];
        rank = new int[v];
        for(int i = 0; i<v; i++){
            parent[i] = -1;
            rank[i] = 1;
        }
    }
    //adding an edge
    public void addEdge(int s, int d){
        Edge e1 = new Edge(s,d);
        allEdge.add(e1);
    }
    
    //set up disjoint set methods
    
    public int find(int src){
        if(parent[src]==-1) return src;
        return find(parent[src]);
    }
    //union method
    public void union(int src, int des){
        int intX = find(src);
        int intY = find(des);
        if(rank[intX]<rank[intY]){
            parent[intX] = intY;
        }
        else if(rank[intY]< rank[intX]){
            parent[intY] = intX;
        }
        else{
            parent[intY] = intX;
            rank[intX] = rank[intX]+1;
        }
    }
    public boolean isCycle(int src, int des){
        int intX = find(src);
        int intY = find(des);
        if(intX==intY) return true;
        union(src, des);
        return false;
    }
    public void printMST(ArrayList<Edge>e){
        for(int i = 0; i<e.size(); i++){
            System.out.println("src"+e.get(i).src+"\t");
            System.out.print("des "+e.get(i).des+"\t");
        }
    }
    
    public void KMST(){
        //put all the edges into a priority queue
        //poll each edge
        //check whether they form a cycle
        //if don't form cycle, add into an MST
        PriorityQueue<Edge> pq = new 
        PriorityQueue<>(allEdge.size());
        for(int i = 0; i<allEdge.size(); i++){
            pq.add(allEdge.get(i));
        }
        ArrayList<Edge>mst = new ArrayList<Edge>();
        for(int i = 0; i<vertices-1; i++){
            Edge e1 = pq.poll();
            int intX = find(e1.src);
            int intY = find(e1.des);
            if(intX!=intY){
                mst.add(e1);
                union(e1.src, e1.des);
            }
        }
        printMST(mst);
        
    }
}

