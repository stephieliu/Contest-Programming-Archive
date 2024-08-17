/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heapintpriorityqueue;

/**
 *
 * @author Stephie
 */
public class HeapMain {
    public static void main(String[] args) {
        HeapIntPriorityQueue pq = new HeapIntPriorityQueue();
        int[] elements = {65, 50, 20, 90, 44, 60, 80, 70, 99, 10};
        for (int n : elements) {
            pq.add(n);
            System.out.println(pq);
        }
        
        // System.out.println(pq);
        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
            System.out.println(pq + ", size "+ pq.size());
        }
        for(int i = 0; i< elements.length; i++){
            System.out.println(pq.remove()+" ");
        }
        System.out.println("");
    }

}
