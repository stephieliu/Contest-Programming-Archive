/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countingcycles;

/**
 *
 * @author Stephie
 */
import java.util.*;
class CycleDetector {
    int V;
    List<List<Integer>> adj;
    
    public CycleDetector(int V){
        this.V = V;
        adj = new ArrayList<>(V);
        for(int i = 0; i<V; i++){
            adj.add(new LinkedList<>());
        } 
    }
    private boolean isCyclic(int i, boolean[] Visited, boolean[] Stack){
        if(Stack[i]){
            return true;
        }
        if(Visited[i]){
            return false;
        }
        Visited[i] = true;
        Stack[i] = true;
        List<Integer> children = adj.get(i);
        for(Integer c: children){
            if(isCyclic(c, Visited, Stack)){
                return true;
            }
        }
        Stack[i] = false;
        return false;
    }
    void addEdge(int src, int dest){
        adj.get(src).add(dest);
    }
    int isCyclic(){
        int count = 0;
        boolean[] Visited = new boolean[V];
        boolean[] Stack = new boolean[V];
        for(int i = 0; i<V; i++){
            if(isCyclic(i, Visited, Stack)){
                count++;
                return count;
            }
        }
        return count;
    }
}
