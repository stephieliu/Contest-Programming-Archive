/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mostpopularnumber;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class MostPopularNumber {

    /**
     * @param args the command line arguments
     */
    static int mostFrequent(int arr[], int n){ 
        Arrays.sort(arr); 
        int max_count = 1, res = arr[0]; 
        int curr_count = 1;
        for (int i = 1; i < n; i++){ 
            if (arr[i] == arr[i - 1]){
                curr_count++; 
            }
            else{ 
                if (curr_count > max_count){ 
                    max_count = curr_count; 
                    res = arr[i - 1]; 
                } 
                curr_count = 1; 
            } 
        } 
        if (curr_count > max_count){ 
            max_count = curr_count; 
            res = arr[n - 1]; 
        }
        return res; 
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int [] numbs = new int [N];
        for(int i = 0; i<N; i++){
            numbs[i] = input.nextInt();
        }
        System.out.println(mostFrequent(numbs, N));
    }
    
}
