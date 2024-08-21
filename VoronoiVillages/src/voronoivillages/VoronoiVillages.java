/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voronoivillages;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class VoronoiVillages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double [] a = new double[N];
        double [] b = new double[N-1];
        double [] size = new double[N-2];
        for(int i = 0; i < N; i++){
            a[i] = sc.nextDouble();
        }
        Arrays.sort(a);
        for(int i = 0; i < N-1; i++){
            b[i] = (a[i] + a[i+1])/2;
        }
        for(int i = 0; i < N-2; i++){
            size[i] = Math.abs(b[i] - b[i + 1]);
        }
        Arrays.sort(size);
        System.out.println(String.format("%.1f", size[0]));
    }
    
}
