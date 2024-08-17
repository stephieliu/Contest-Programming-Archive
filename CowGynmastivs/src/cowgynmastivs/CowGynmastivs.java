/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cowgynmastivs;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class CowGynmastivs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int K = input.nextInt();
        int N = input.nextInt();
        int [] arr = new int [N];
        int [] arr1 = new int [N];
        int sum = 0;
        int s = 0;
        for(int i = 1; i<=N ;i++){
            sum+=i;
        }
        for(int i = 0; i<K; i++){
            for(int j = 0; j<N; j++){
                if(i==0){
                    arr[j] = input.nextInt();
                }
                else if(i==2){
                    int x = input.nextInt();
                    if(x!=arr[j]){
                        sum-=(4-j);
                    }
                }
                else{
                    int y = input.nextInt();
                }
            }
        }
        System.out.println(sum);
    }
    
}
