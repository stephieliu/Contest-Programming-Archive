/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heapintpriorityqueue;
import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 *
 * @author Stephie
 */
public class HeapIntPriorityQueue {

    private int[] elementData;
    private int size;
    
    // Constructs an empty queue.
    public HeapIntPriorityQueue() {
        elementData = new int[10];
        size = 0;
    }
    
    // Adds the given element to this queue.
    public void add(int value) {
        int [] intArr1 = new int[10];
        elementData[size]=value;
        int index = size;
        while(hasParent(index)&& (elementData[parent(index)]>value)){
            swap(elementData, index, parent(index));
        }
        size++;
    }
    
    // Returns true if there are no elements in this queue.
    public boolean isEmpty() {
        if(size==0){
            return true;
        }
        else{
            return false;
        }
    }
    
    // Returns the minimum value in the queue without modifying the queue.
    // If the queue is empty, throws a NoSuchElementException.
    public int peek() {
       return 1;
    }
    
    // Removes and returns the minimum value in the queue.
    // If the queue is empty, throws a NoSuchElementException.
    public int remove() {
       
        return 1;
    }
    
    // Returns the number of elements in the queue.
    public int size() {
        return 1;
    }
    
    // Returns a string representation of this queue, such as "[10, 20, 30]";
    // The elements are not guaranteed to be listed in sorted order.
    public String toString() {
        String result = "[";
        if (!isEmpty()) {
            result += elementData[1];
            for (int i = 2; i <= size; i++) {
                result += ", " + elementData[i];
            }
        }
        return result + "]";
    }
    
    
    // helpers for navigating indexes up/down the tree
    private int parent(int index) {
        
        return (index-1)/2;
    }
    
    // returns index of left child of given index
    private int leftChild(int index) {
        
        return 2*index+1;
    }
    
    // returns index of right child of given index
    private int rightChild(int index) {
        return 2*index+2;
    }
    
    // returns true if the node at the given index has a parent (is not the root)
    public boolean hasParent(int index) {
        if(parent(index)!=0){
            return true;
        }
        return false;
    }
    
    // returns true if the node at the given index has a non-empty left child
    private boolean hasLeftChild(int index) {
        if(leftChild(index)!=0){
            return true;
        }
        else{
            return false;
        }
    }
    
    // returns true if the node at the given index has a non-empty right child
    private boolean hasRightChild(int index) {
        if(rightChild(index)!=0){
            return true;
        }
        else{
            return false;
        }
    }
    
    // switches the values at the two given indexes of the given array
    private void swap(int[] a, int index1, int index2) {
        
    }

}
