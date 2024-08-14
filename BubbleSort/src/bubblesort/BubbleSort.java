/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

/**
 *
 * @author Stephie
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int temp=0;
        boolean sorted = false;
        int [] sort = {45,7,84,28,68,37,45,31,83,11};        
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
                System.out.println("Pass #"+ pass +" :");
                    for(int j = 0; j<10; j++){
                        System.out.println(sort[j]+" ");
                    }
            }
        }
    }
    
}
