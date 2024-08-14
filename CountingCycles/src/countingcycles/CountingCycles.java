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
public class CountingCycles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int side = input.nextInt();
        int [][] adjMatrix = new int [side][side];
        CycleDetector graph = new CycleDetector(4);
        for(int i = 0; i<side; i++){
            for(int j = 0; j<side; j++){
                adjMatrix[i][j] = input.nextInt();
            }
        }
        for(int i = 0, x = 1; i<side&&x<side; i++, x++){
            for(int j = 0, y = 1; j<side&&y<side; j++, y++){
                graph.addEdge(adjMatrix[i][j], adjMatrix[x][y]);
            }
        }
        System.out.println(graph.isCyclic());
    }
    
}
