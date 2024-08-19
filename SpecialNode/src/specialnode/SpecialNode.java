/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package specialnode;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class SpecialNode {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();//number of nodes
        int M = input.nextInt();//number of edges
        int K = input.nextInt();//number of special nodes
        int [] specialNodes = new int [K];
        for(int i = 0; i<K; i++){
            specialNodes[i] = input.nextInt();
        }
        int max=0;
        int[][] nodeEdge = new int [M][3];
        for(int i = 0;i<M;i++){
            for(int j = 0; j<3; j++){
                nodeEdge[i][j] = input.nextInt();
                if(i==j){
                    max = i;
                }
            }
        }
        System.out.println(nodeEdge[max]);
    }
}
