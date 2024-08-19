/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s1compcontinclassstuff;

/**
 *
 * @author Stephie
 */
import java.util.*;

public class S1compcontInClassStuff {

    public static void homework6(String[] args){
        Scanner input = new Scanner(System.in);
        int nMessage = input.nextInt(); //the number of messages
        //let keep the root node home in the array
        String []strArr = new String[nMessage+1];
        strArr[0] ="Home";
        //reading the messages
        for(int i = 1; i<strArr.length; i++){
            strArr[i] = input.next();
        }
        BinaryTree t1 = new BinaryTree();
        Node root = new Node("Home");//the root node of the binary tree has home
        t1.root = root;
        for(int i = 1; i<strArr.length-1; i++){
            Node node1, node2;
            t1.currentNode = null;//initially the currentnode is null
            t1.lookup(root, strArr[i]);//will give us the currentnode
            node1 = t1.currentNode;
            t1.currentNode = null;
            t1.lookup(root, strArr[i+1]);
            node2 = t1.currentNode;
            if(node1==null||node2==null){
                if(node1==null){
                    node1 = new Node(strArr[i]);
                }
                if(node2==null){
                    node2 = new Node(strArr[i+1]);
                }
            }
            t1.insert(node1, node2);
        }
        //find the time saved
        System.out.println(nMessage*10-(t1.maxDepth(root)-1)*20);   
    }
    //Dijekstra's Shortest Path Algorithim, Breadth First, Depth First
    //Prim's Tree
    int V;//number of vertices
    int E;//number of edges
    int [][] adjWeight;//storing the weight between two vertices
    boolean [][] adjMatrix;//keep tracking whether there is a connection between
    //two verticies
    int w; //the weight between any vertices
    //the constructor for the graph
    public S1compcontInClassStuff(int v){
        V = v;
        E = 0;//no connection in the beginning
    
        for(int i=0; i<V; i++){
            for(int j = 0; j<V; j++){
                adjMatrix[i][j] = false;
            }
        }
    }
    //adding an edge
    //v1 = starting vertex, v2 = ending vertex, w = weight associated between v1 and v2
    public void addEdge(int v1, int v2, int w){
        if(v1<=V&&v2<=V){
            adjWeight[v1][v2] = w;
            adjMatrix[v1][v2] = true;
            E++;
        }
    }
    //removing an edge
    public void removeEdge(int v1, int v2){
        if(v1<=V&&v2<=V){
            adjMatrix[v1][v2] = false;
            adjWeight[v1][v2] = 0;
            E--;
        }
    }
    public void printGraphV1(){
        for(int i = 0; i<V; i++){
            for(int j = 0; j<V; j++){
                System.out.println(adjWeight[i][j]+"\t");
            }
        }
    }
    public boolean printGraphV2(){
        for(int i = 0; i<V; i++){
            for(int j = 0; j<V; j++){
                System.out.println(adjWeight[i][j]+"\t");
            }
        }
        return false;
    }
    public static void Graph(String[] args){
        
    }
    //dist is the array that keeps tracking the shortest distance from the 
    //src vertex to other vertices, visited is the array that keeps
    //tracking whether a vertex being visited or not
    public int minIndex(int [] dist, boolean [] visited){
        int index = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<dist.length; i++){
            if(!visited[i]&&dist[i]<min){
                min = dist[i];
                index = i;
            }
        }
        return index;
    }
    //src is the source vertex
    //print the smallest distance ot every other vertex from src
    public void dijkstra(int src){
        int [] dist = new int[V];
        boolean [] visited = new boolean[V];
        //let assign the min distance for eveyr vertex as integer.max(infinity)
        //assign false to all the vertices in visited array
        for(int i = 0; i<V; i++){
            dist[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }
        dist[src] = 0;
        visited[src] = true;
        for(int i= 0; i<V-1; i++){
            //find the next Vertex to travel
            int u = minIndex(dist, visited);
            visited[u] = true;
            //need to update the distance from u to every other vertex
            //that can be travelled
            for(int v = 0; v<V; v++){
                if(!visited[v]&&dist[u]!=Integer.MAX_VALUE&&adjWeight[u][v]>0
                        &&(dist[v])>dist[u]+adjWeight[u][v]){
                    dist[v] = dist[u]+adjWeight[u][v];
                }
            }
        }
        //print the shortest distance from the src vretex to every other
        //vertex
        
        System.out.println("Vertex"+"\t"+"dist");
        for(int i = 0; i<dist.length; i++){
            System.out.println(i+"\t"+dist[i]);
        }
    }
    public int dijkstraV1(int src, int dis){
        int [] dist = new int[V];
        boolean [] visited = new boolean[V];
        //let assign the min distance for eveyr vertex as integer.max(infinity)
        //assign false to all the vertices in visited array
        for(int i = 0; i<V; i++){
            dist[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }
        dist[src] = 0;
        visited[src] = true;
        for(int i= 0; i<V-1; i++){
            //find the next Vertex to travel
            int u = minIndex(dist, visited);
            visited[u] = true;
            //need to update the distance from u to every other vertex
            //that can be travelled
            for(int v = 0; v<V; v++){
                if(!visited[v]&&dist[u]!=Integer.MAX_VALUE&&adjWeight[u][v]>0
                        &&(dist[v])>dist[u]+adjWeight[u][v]){
                    dist[v] = dist[u]+adjWeight[u][v];
                }
            }
        }
        //print the shortest distance from the src vretex to every other
        //vertex
        
        
        System.out.println("Vertex"+"\t"+"dist");
        for(int i = 0; i<dist.length; i++){
            System.out.println(i+"\t"+dist[i]);
        }
        return dist[dis];
    }
    public int dijkstraV3(int src, int dis){
        int [] dist = new int[V];
        boolean [] visited = new boolean[V];
        //let assign the min distance for eveyr vertex as integer.max(infinity)
        //assign false to all the vertices in visited array
        for(int i = 0; i<V; i++){
            dist[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }
        dist[src] = 0;
        visited[src] = true;
        for(int i= 0; i<V-1; i++){
            //find the next Vertex to travel
            int u = minIndex(dist, visited);
            visited[u] = true;
            //need to update the distance from u to every other vertex
            //that can be travelled
            for(int v = 0; v<V; v++){
                if(!visited[v]&&dist[u]!=Integer.MAX_VALUE&&adjWeight[u][v]>0
                        &&(dist[v])>dist[u]+adjWeight[u][v]){
                    dist[v] = dist[u]+adjWeight[u][v];
                }
            }
        }
        //print the shortest distance from the src vretex to every other
        //vertex
        
        
        System.out.println("Vertex"+"\t"+"dist");
        for(int i = 0; i<dist.length; i++){
            System.out.println(i+"\t"+dist[i]);
        }
        //add the pencil cost to every city's
        for(int i = 0; i<V; i++){
            int[] pencilCost = new int [V];
            dist[i] = dist[i]+ pencilCost[i];
        }
        Arrays.sort(dist);
        return dist[0];
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
