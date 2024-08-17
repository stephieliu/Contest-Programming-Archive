/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework17s1q1;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Homework17S1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();//size of matrix
        int [][] graph = new int[N][N];
        cycle g1 = new cycle(N, N);
        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                graph[i][j] = input.nextInt();
                if(graph[i][j]!=0){
                    g1.edge[i].src = i;
                    g1.edge[i].dest = j;
                }
            }
        }
        System.out.println(g1.isCycle(g1));
    }
    
}
