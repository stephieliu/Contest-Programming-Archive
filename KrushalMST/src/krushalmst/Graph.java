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
import java.util.*;
public class Graph {
    int vertices;
    ArrayList<Edge> allEdges;
    
    //constructor for graph
    public Graph(int v){
        vertices = v;
        allEdges = new ArrayList<Edge>();
    }
    //adding an edge
    public void addedge(int s, int d, int w){
        Edge e1 = new Edge(s, d, w);
        allEdges.add(e1);
    }
    
}
