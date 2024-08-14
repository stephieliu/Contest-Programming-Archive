/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxandwhiskers;

/**
 *
 * @author Stephie
 */
import java.text.DecimalFormat;
import java.util.*;
public class BoxAndWhiskers {

    /**
     * @param args the command line arguments
     */
    static int median(int a[], int l, int r){ 
        int n = r - l + 1; 
        n = (n + 1) / 2 - 1; 
        return n + l; 
    } 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int [] SortData = new int [N];
        for(int i = 0; i<N; i++){
            SortData[i] = input.nextInt();
        }
        Arrays.sort(SortData);
        System.out.print(SortData[0]+" "+SortData[N-1]+" ");
        //Find Q1
        int separation = (int)Math.floor(N/2);
        DecimalFormat df = new DecimalFormat("###.#");
        double Q1= 0, Q2 = 0, Q3 = 0;
        Q1 = SortData[median(SortData, 0, separation-1)];
        System.out.print(df.format(Q1)+" ");
        //Find Q2
        if(SortData.length%2!=0){
            //odd number of numbers, only need one number
            Q2 = (double) SortData[SortData.length/2];
        }
        else{
            //even number of numbers, need to find middle two and avg
            Q2 = ((double)SortData[SortData.length/2] + 
                    (double)SortData[SortData.length/2 - 1])/2;
        }
        System.out.print(df.format(Q2)+" ");
        //Find Q3
        Q3 = SortData[median(SortData, separation,N)];
        System.out.print(df.format(Q3));
    }
    
}
