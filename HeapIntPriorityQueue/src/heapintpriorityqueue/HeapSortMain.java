/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heapintpriorityqueue;
import java.util.*;
/**
 *
 * @author Stephie
 */
public class HeapSortMain {
    public static void main(String[] args) {
        int[] a = {0, 65, 50, 20, 90, 44, 60, 80, 70, 99, 10};
        heapSort(a);
        System.out.println(Arrays.toString(a));
    }
    
    public static void heapSort(int[] a) {
        Queue<Integer> pq = new PriorityQueue<Integer>();
        for (int n : a) {
            pq.add(n);
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = pq.remove();
        }
    }

}