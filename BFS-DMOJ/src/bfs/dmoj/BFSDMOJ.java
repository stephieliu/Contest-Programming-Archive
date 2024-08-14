/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfs.dmoj;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class BFSDMOJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt()*5;
        int D = input.nextInt()*10;
        int Q = input.nextInt()*25;
        int L = input.nextInt()*100;
        int T = input.nextInt()*200;
        int sum = N+D+Q+L+T;
        System.out.println(sum);
    }
    
}
