/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package powerrankings;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class PowerRankings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int P = input.nextInt();
        String [] names = new String [N];
        for(int i = 0; i<N; i++){
            names[i] = input.next();
        }
        int [][] time = new int [P][N];
        for(int i = 0; i<P; i++){
            for(int j = 0; j<N; j++){
                time[i][j] = input.nextInt();
            }
        }
        int [] sum = new int [N];
        for(int i = 0; i<N; i++){
            for(int j = 0; j<P; j++){
                sum[i] += time[j][i];
            }
        }
        Map <Integer, String> rank = new TreeMap<>(Collections.reverseOrder());
        for(int i = 0; i<N; i++){
            rank.put(sum[i], names[i]);
        }
        Descending(sum, N);
        int ranking = 3;
        for(int i = 0; i<N; i++){
            System.out.println(ranking+". " + rank.get(sum[i]));
            ranking++;
        }
    }
    public static int [] Descending(int [] sum, int N){
        int temp;
        for (int i = 0; i < N; i++){
            for (int j = i + 1; j < N; j++) {
                if (sum[i] < sum[j]){
                    temp = sum[i];
                    sum[i] = sum[j];
                    sum[j] = temp;
                }
            }
        }
        return sum;
    }
}
