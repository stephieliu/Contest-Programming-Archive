/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krushalmst;

/**
 *
 * @author Stephie
 */
import java.util.PriorityQueue;
public class PriorityQueueDemo {
    public static void main(String [] args){
        PriorityQueue<Integer> myQueue = new PriorityQueue<Integer>();
        myQueue.add(10);
        myQueue.add(5);
        myQueue.add(2);
        while(myQueue.isEmpty()){
            System.out.println(myQueue.poll());
        }
    }
}
