/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highways;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Highways {

    /**
     * @param args the command line arguments
     */
    static Scanner input;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //use dijkstra & dfs - to find shortest path and to find connections
        //respectively
        int cases = input.nextInt();
        int n, m, start = 0, end = 0, numb1 = 0, numb2;
        Graphs g = null;
        int [][] citystartandend = null;
        for(int i = 0; i<cases; i++){
             n = input.nextInt();//number of cities
             m = input.nextInt();//number of higheays
             start = input.nextInt();//starting city
             end = input.nextInt();//ending city
            //cities = 1 --> n
            g = new graphs(n);
            for(int j = 0; j<m; j++){
                for(int x = 0; x<m; x++){
                    for(int y =0; y<2; y++){
                        citystartandend[x][y] = input.nextInt();
                        g.addEdge(citystartandend[x][y], citystartandend[y][x]);

                    }
                }
                //highway reaches from numb1 ro numb2
                int time = input.nextInt();//time to travel along highway
                
            }
            if(g.DFS(start)!=end){
                System.out.println("NONE");
            }
            else{
                for(int x = 0; x<m; x++){
                    for(int y =0; y<2; y++){
                        g.dijkstra(citystartandend[][], start);                        
                    }
                }
            }
        }
            

        
    }
    
}
