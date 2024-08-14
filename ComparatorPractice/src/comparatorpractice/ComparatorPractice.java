/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparatorpractice;

/**
 *
 * @author Stephie
 * 
 * 
 * JAVA PROGRAM PRACTICE:
 * GIVEN AN INT ARRAY WITH N NUMBERS, SORT THE ARRAY BY 
 * THE ABSOLUTE VALUE IN DESCENDING ORDER. IF IT's THE SAME ABSOLUTE
 * VALUE, LESSER NUMBER FIRST (SMALLER ONE)
 */
import java.util.*;
public class ComparatorPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Integer [] arr = new Integer [n];
        for(int i = 0; i<n; i++){
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr, new cmp());
        System.out.println(Arrays.toString(arr));
    }
    static class cmp implements Comparator<Integer>{
        public int compare(Integer a, Integer b){
            int va = Math.abs(a), vb = Math.abs(b);
            if(va!=vb) return -Integer.compare(va, vb);
            else return Integer.compare(a, b);
        }
    }
    
}
