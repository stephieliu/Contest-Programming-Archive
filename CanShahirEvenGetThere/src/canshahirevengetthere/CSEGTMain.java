/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canshahirevengetthere;

import java.util.Scanner;

/**
 *
 * @author Stephie
 */
public class CSEGTMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int A = input.nextInt();
        int B = input.nextInt();
        canshahirevengetthere g = new canshahirevengetthere(N);
        for(int i = 0; i<M; i++){
            g.addEdge(input.nextInt(), input.nextInt());
        }
        if(g.isReachable(A, B)){
            System.out.println("GO SHAHIR!");
        }
        else{
            System.out.println("NO SHAHIR!");
        }
    }
}
