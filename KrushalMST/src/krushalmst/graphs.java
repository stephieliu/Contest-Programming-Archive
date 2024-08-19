/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krushalmst;

/**
 *
 * @author Stephie
 */
public class graphs {

    int V;
    int E;
    Edge[] edge;
    int [] parent;
    int [] rank;
    public class Edge{
        int dest;
        int src;
    }
    public graphs(int v, int e){
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
    
    public int find(int [] parent, int i){
        if(parent[i]==-1){
            return i;
        }
        return find(parent, parent[i]);
        
    }
    public void union(int []parent, int x, int y){
        int intX = find(parent, x);
        int intY = find(parent, y);
        parent[intX]=intY;
    }
    
    public int isCycle(int [] parent, int x, int y){
        int intX = find(parent, x);
        int intY = find(parent, y);
        if(intX == intY){
            return 1;
        }
        union(parent, x, y);
            return -1;
        }
    }

