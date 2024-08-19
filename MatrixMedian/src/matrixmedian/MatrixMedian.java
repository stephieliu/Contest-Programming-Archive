/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixmedian;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class MatrixMedian {

    /**
     * @param rand
     * @return
     */
    public static double median(int [] rand){
        int middle = rand.length /2;
        if(1 == rand.length %2){
            return rand[middle];
        }
        else{
            return (rand[middle - 1]+rand[middle])/2.0;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        int counter = 0;
        
        while(T>counter){
            int N = input.nextInt();
            int [][] matrix = new int [N][N];
            int [] list1 = new int [N];        
            int [] list = new int [N];        
            for(int i = 0; i<N; i++){
                for(int j = 0; j<N; j++){
                    matrix[i][j] = input.nextInt();
                }
            }
            
            Arrays.sort(list1);
            double numb1 = median(list1);
            double numb2 = median(list);
            
            
            System.out.println(median(list));
            counter++;
        }
    }
    
}
