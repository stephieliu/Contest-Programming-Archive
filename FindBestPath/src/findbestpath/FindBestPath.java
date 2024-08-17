/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findbestpath;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class FindBestPath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FindBestPath graph = new FindBestPath();
        int Tt= input.nextInt();//number of test cases
        int [][] testCases = new int [Tt][2];
        int [][] edges=null;
        for(int i = 0; i<Tt; i++){
            for(int j = 0; j<2; j++){
                testCases[i][j] = input.nextInt();//collecting test cases
                for(int x =0; x<i; x++){
                    for(int y = 0; y<j; y++){
                        edges[x][y] = input.nextInt();
                    }
                }
            }
        }
        System.out.println(mSt.class);
    }
    
}
