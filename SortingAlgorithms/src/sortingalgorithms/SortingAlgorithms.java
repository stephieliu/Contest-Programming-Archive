/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

import java.util.Arrays;

/**
 *
 * @author steph
 */
public class SortingAlgorithms {

    /**
     * @param args the command line arguments
     */
    
    //works well when the array is almost sorted
    //performs a lot of tasks within a single pass of the array and is not very
    //efficient if data is not almost sorted
    public static int[] BubbleSort(int[] list){
        boolean flag = false;//flags whether the array has been fully sorted
        int temp;
        //loop from the top of the array
        //i-- because the largest element in each pass will always get to the
        //right spot
        for(int i = list.length-1; i>0 && !flag; i--){
            flag = true;//if it doesn't go through the if statement then flag
            //will stay as TRUE and will break out of the loop
            
            //compares adjacent elements and swaps if they are smaller
            for(int j = 1; j<i; j++){
                if(list[j]<list[j-1]){
                    //if the second element is smaller than the first, then 
                    //you swap them
                    temp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = temp;
                    flag = false;//mark flag as false
                }
            }    
        }        
        return list;
    }
    
    //best when data is not sorted at all (not even close to being in order)
    //not a lot of movement of data!
    //not rly good when data is close to sorted already because it only moves
    //one element at a time
    public static int[] SelectionSort(int[] list){
        int minLoc, temp;
        for(int i = 0; i<list.length; i++){
            //index of the smallest element
            minLoc = i;
            for(int j = i+1; j<list.length; j++){
                if(list[j]<list[minLoc]){
                    //if list[j] is less than list[minLoc] then the new smallest
                    //element is list[minLoc]
                    minLoc = j;
                }
            }
            //swap the minimum element with the first element
            temp = list[minLoc];
            list[minLoc] = list[i];
            list[i] = temp;
        }
        return list;
    }
    
    //very efficient at sorting nearly sorted data
    //very slow for lists that aren't sorted at all
    public static int[] InsertionSort(int[] list){
        int i, temp;
        for(int j = 1; j<list.length; j++){
            temp = list[j];
            i = j;
            //move all the other values up by one
            while(i>0 && temp<list[i-1]){//
                list[i] = list[i-1];
                i--;
            }
            //inserts list[i] into the correct position (smallest)
            list[i] = temp;
        }
        return list;
    }
    
    public static void main(String[] args) {
        int [] list = {4, 6, 8, 3, 1};
        System.out.println(Arrays.toString(SelectionSort(list)));
        System.out.println(Arrays.toString(BubbleSort(list)));
        System.out.println(Arrays.toString(InsertionSort(list)));
    }
    
}
