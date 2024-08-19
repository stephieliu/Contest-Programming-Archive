/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchingandsorting;

/**
 *
 * @author Stephie
 */
import java.util.*;        
public class SearchingAndSorting {

    
    public static int LinearSearch(int [] intArr, int intTarget){
        for(int i = 0; i<6; i++){
            if(intArr[i] == intTarget){
                return i;
            }
        }
        return -1;
    }
    public static void SelectionSort(int [] intArr){
        for(int i = intArr.length-1; i>=0; i--){
            int intMax = intArr[0];
            int maxIndex = 0;
            for(int j = 0; j<=i; j++){
                if(intArr[j]>=intMax){
                    intMax = intArr[j];
                    maxIndex = j;
                }
                int intTemp = intArr[i];
                intArr[i] = intMax;
                intArr[maxIndex] = intTemp;
            }
        }
    }
    public static void printArray (int [] intArr){
        for(int i = 0; i<intArr.length; i++){
            
        }
    }
    public static int BinarySearch(int [] intArr, int intTarget){
        int min=0, max = intArr.length-1, middle;
        boolean found = false;
        int location = -1;
        for(int i = 0; i<10; i++){
            System.out.print(intArr[i]+" ");
        }
        while(!found && max>=min){
            middle = (min+max)/2;
            if(intArr[middle]==intTarget){
                location = middle;
                found=true;
            }
            else if(intArr[middle]<intTarget){
                min=middle+1;
            }
            else{
                max = middle-1;
            }
        }
        if(location>=0){
            return location;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] intArr = {-2, 4, 3, 12, 9, 34};
        int [] intArr2 = {1,2,3,4,5,6,7,8,9,10};
        if(BinarySearch(intArr2, 10)==9){
            System.out.println("Binary Search Test 1 pass");
        }
        if(BinarySearch(intArr2, 100)==-1){
            System.out.println("Binary Search Test 2 pass");
        }
        if(LinearSearch(intArr, 7)==6){
            System.out.println("Linear Search Test 1 pass");
        }
        if(LinearSearch(intArr, 100)==-1){
            System.out.println("Linear Search Test 2 pass");
        }
    }
    
}
