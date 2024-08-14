/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesortpractice;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class BubbleSortPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int temp=0;
        boolean sorted = false;
        int [] sort = new int [N];
        for(int i = 0; i<N; i++){
            sort[i] = in.nextInt();
        }
        for(int top = sort.length-1;top>0;top--){
            sorted = true;
            for(int i = 0; i<top; i++){
                if(sort[i]>sort[i+1]){
                    sorted = false;
                    temp = sort[i];
                    sort[i] = sort[i+1];
                    sort[i+1] = temp;
                }
                int pass = sort.length-top;
                System.out.println(pass+" ");
                    for(int j = 0; j<sort.length; j++){
                        System.out.print(sort[j]+" ");
                    }
            }
        }
    }
    
}
