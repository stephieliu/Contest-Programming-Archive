/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computingcompetition;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class ComputingCompetition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	int N = input.nextInt();
        int K = input.nextInt();
        int round1[] = new int[N];
        int round2[] = new int[N];
        int temp[] = new int[N];
        for(int i=0; i<N; i++){
            round1[i] = input.nextInt();
            round2[i] = input.nextInt();
            temp[i] = round1[i];
        }
        Arrays.sort(temp);
        int expected = temp[N-K];
        int max = -1;
        int index = -1;
        for(int i = 0; i<N; i++){
            if(round1[i] >= expected && round2[i] > max) { 
                max = round2[i]; index = i;
            }
        }
        System.out.println(index+1);
    }
    
}
