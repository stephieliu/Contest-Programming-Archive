/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchandsortdemo;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class SearchAndSortDemo {

    /**
     * @param intArr is an integer array
     * @param intTarget is value to be searched in intArr
     * @return the index of inTarget in intArr if found else
     */
    public static int LinearSearch (int [] intArr, int intTarget){
        for(int i = 0; i<intArr.length; i++){
            if(intArr[i]==intTarget){
                return i;
            }
        }
        return -1;
    }
    
    /**
     * 
     * @param intArr is an integer array which is sorted
     * @param intTarget is the value to be searched in intArr
     * @return the index of intTarget in intArr
     */
    public static int BinarySearch (int [] intArr, int intTarget){
        Arrays.sort(intArr);
        int min = 0;
        int max = intArr.length-1;
        while(min<=max){
            int middle = (max+min)/2;
            if(intArr[middle]==intTarget){
                return middle;
            }
            else if(intArr[middle]<intTarget){
                min = middle+1;
            }
            else{
                max = middle-1;
            }
        }
        return -1;
    }
    /**
     * 
     * @param intArr is an integer array
     * sort the elements in the array intArr in increasing order
     */
    public static void bubbleSort(int [] intArr){
        int temp = 0;
        for(int top = intArr.length-1;top>0;top--){
            for(int i = 0; i<top; i++){
                if(intArr[i]>intArr[i+1]){
                    temp = intArr[i];
                    intArr[i] = intArr[i+1];
                    intArr[i+1] = temp;
                }
            }
        }
    }
    public static void selectionSort(int [] intArr){
        int temp = 0;
        for(int top = intArr.length-1;top>=0;top--){
            int index = 0;
            int max = intArr[index];
            for(int i = 0; i<= top; i++){
                if(intArr[i]>=max){
                    index = i;
                    max =intArr[i];
                }
            }
            temp = intArr[top];
            intArr[top] = max;
            intArr[index] = temp;
        }
    }
    //the merging algorithm
    public static void merge(int[] result, int[] left, int[] right) {
        int i1 = 0; // index into left array
        int i2 = 0; // index into right array
        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length ||(i1 < left.length && left[i1] <= right[i2])) {
                result[i] = left[i1]; // take from left
                i1++;
            }
            else {
                result[i] = right[i2]; // take from right
                i2++;
            }
        }
    }
    public static void mergeSort(int [] a){
        if(a.length>=2){
            int[] left = Arrays.copyOfRange(a,0,a.length/2);
            int[] right = Arrays.copyOfRange(a,a.length/2, a.length);
            mergeSort(left);
            mergeSort(right);
            merge(a, left, right);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] intArr = {7,8,10,1,-5,6};
        if(LinearSearch(intArr, 6)== 5){
            System.out.println("Linear search Test 1 pass");
        }
        if(LinearSearch(intArr, 100)== -1){
            System.out.println("Linear search Test 2 pass");
        }
        int [] intArr1 = {1,2,3,4,5,6,7,8,9,10};
        if(BinarySearch(intArr1, 7)==6){
            System.out.println("Binary search Test 1 pass");
        }
        if(BinarySearch(intArr1, 100)==-1){
            System.out.println("Binary search Test 2 pass");
        }
        int [] intArr2 = {-7,8,100,34,54,78};
        bubbleSort(intArr2);
        for(int i = 0; i<intArr2.length; i++){
            System.out.println(intArr2[i]+" ");
        }
        System.out.println(" ");
        int [] intArr4 = {-10, 100, 12, 34, 1000, -100};
        selectionSort(intArr4);
        for(int i = 0; i<intArr4.length; i++){
            System.out.println(intArr4[i]+"\t");
        }
        System.out.println(" ");
        int [] intArr12 = {1,2,5};
        int [] intArr22 = {4,7};
        int [] result = new int [5];
        merge(result, intArr12, intArr22);
        for(int i = 0; i<result.length; i++){
            System.out.print(result[i]+"\t");
        }
        System.out.println("");
        int [] intArr3 = {-10,11,12,13,-100,56};
        mergeSort(intArr3);
        for(int i = 0; i<intArr3.length; i++){
            System.out.print(intArr3[i]+" ");
        }
        System.out.println("");
    }
    
}
