/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canshahirevengetthere;

/**
 *
 * @author Stephie
 * USED BFS
 * Found if a path existed using the search and if yes, then print Go Shahir
 * Other wise, print No Shahir
 */
import java.util.*;
class canshahirevengetthere{
    private int V;
    private LinkedList<Integer> adj[];
    canshahirevengetthere(int v){
        V=v;
        adj = new LinkedList[v];
        for(int i = 0; i<v; i++){
            adj[i] = new LinkedList();
        }
    }
    void addEdge(int v, int w){
        adj[v].add(w);
    }
    Boolean isReachable(int s, int d){
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s] = true;
        queue.add(s);
        Iterator<Integer> i;
        while(queue.size()!=0){
            s = queue.poll();
            int n;
            i = adj[s].listIterator();
            while(i.hasNext()){
                n = i.next();
                if(n==d){
                    return true;
                }
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        return false;
    } 
}