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
public class ShipAndShopp {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int nCities = input.nextInt();
//                return dist[dis];
        S1compcontInClassStuff g1 = new S1compcontInClassStuff(nCities);
        int nPath= input.nextInt();
        //read the path and sitacne for each nPath
        for(int i = 0; i<nPath; i++){
            int x = input.nextInt();
            int y = input.nextInt();
            int w = input.nextInt();
            g1.addEdge(x-1, y-1, w);
            g1.addEdge(y-1, x-1, w);
        }
        int nPencils = input.nextInt();//number of cities selling pencils
        int [] pCost = new int [nCities];
        //initialize the pencil coast in each city
        for(int i = 0; i<nCities; i++){
            pCost[i] = Integer.MAX_VALUE;
        }
        for(int j = 0; j<nPencils; j++){
            int location = input.nextInt();
            int cost = input.nextInt();
            pCost[location-1] = cost;
            
        }
        
        System.out.println(g1.dijkstraV3(nPath, nPath));
        //print the shortest path
        //
    }
}
