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
public class GrapH {

    int V;
    int E;
    Edge[] edge;
    int [] parent;
    int [] rank;
    public class Edge{
        int dest;
        int src;
    }
    public GrapH(int v, int e){
        V = v;
        E=e;
        parent = new int [V];
        rank = new int [V];
        edge = new Edge[e];
        for(int i = 0; i<e; i++){
            edge[i] = new Edge();
            parent[i] = -1;
            rank[i] = 1;
        }
    }
    //parent = parent array
    //i = Vertex
    //return parent of the vertex
    
    public int find(int i){
        if(parent[i]==-1){
            return i;
        }
        return find(parent[i]);
        
    }
    public void union(int src, int des){
        int intX = find(src);
        int intY = find(des);
        parent[intX]=intY;
        if(rank[intX]<rank[intY]){
            parent[intX] = intY;
        }
        else if(rank[intY]<rank[intX]){
            parent[intY] = intX;
        }
        else{
            parent[intY] = intX;
            rank[intX] = rank[intX]+1;
        }
    }
    
    public int isCycle(GrapH graph){
        int count = 0;
        for(int i = 0; i<parent.length; i++){
            parent[i] = -1;
        }
        for(int i = 0; i<graph.E; i++){
            int src = edge[i].src;
            int dest = edge[i].dest;
            if(graph.find(src)==graph.find(dest)){
                count++;
            }
            graph.union(src, dest);
            
        }
        return count;
    }
}
