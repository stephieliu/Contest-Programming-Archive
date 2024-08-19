/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mountainview1;

/**
 *
 * @author Stephie
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
public class MountainView1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //second attempt at mountainview question
        //bufferedreader is faster so it's better to use it
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        //use try and catch to find best view 
        try {
            //storing all of the values
            for(int o = 0 ; o < 10 ; o ++) {
                int n = Integer.parseInt(input.readLine());
                String [] t = input.readLine().split(" ");
                int [] a = new int[n];
                int [][] store = new int[n][2];
                for(int i = 0 ; i < n ; i ++) {
                    a[i] = Integer.parseInt(t[i]);
                    store[i][0] = i;
                }
                //storing more values
                for(int i = 0; i < n; i ++) {
                    double highest = (double)Integer.MIN_VALUE;
                    for(int p = i+1; p<n; p++) {
                            if((double)(a[p]-a[i])/(p-i)>highest) {
                                highest = (double)(a[p]-a[i])/(p-i);
                                store[i][1]++;
                                store[p][1]++;
                            }
                    }
                }
                //compare arrays to see if heights interrupt each other
                Arrays.sort(store,new Comparator<int[]>() {
                    @Override
                    public int compare(int[] o1, int[] o2) {
                        if(o2[1]!=o1[1])
                            return o2[1]-o1[1];
                        return o1[0]-o2[0];
                    }
                });
                System.out.println(store[0][0] +1);
            }
        //catch exception
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
}
