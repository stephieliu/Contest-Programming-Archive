/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listnode;

/**
 *
 * @author Stephie
 */
class ListNode {

    private ListNode next;

    /**
     * @param args the command line arguments
     */
    static class Node{
        int data;
        Node next;
    }
    private ListNode front=null;
        
    public void add(int value) {
        if(front == null){
        }
   }
    
    // Returns value in list at given index.
    // Precondition: 0 <= index < size()
    public int get(int index) {
        return 1;
    }
    // Inserts the given value at the given index.
    // Precondition: 0 <= index <= size()
    public void add(int index, int value) {
//        ListNode node = new ListNode(value);
//        ListNode n1 = front;
//        for(int i = 0; i<index-1; i++){
//            n1 = n1.next;
//        }
        
    }

    // Removes and returns the first value.
    // Throws a NoSuchElementException on empty list.
    public int remove() {
        return 1;
    }
    // Removes value at given index from list.
    // Precondition: 0 <= index < size()
    public int remove(int index) {
        if(index==0){
            front = front.next;
        }
        else{
            ListNode temp = front;
            for(int i  =0; i<index-1; i++){
                temp = temp.next;
            }
            
        }
        return 1;
    }
    // Adds given value to list in sorted order.
    // Precondition: Existing elements are sorted
    public void addSorted(int value) {
        ListNode node = new ListNode(value);
        if(value<front.data){
            ListNode temp = front;
            front = node;
            front.next = temp;
        }
        else{
            ListNode n1 = front;
            while(front.next!=null && (n1.data>value)){
                n1 = n1.next;
            }
            ListNode t = n1.next;
            n1.next = node;
            n1.next.next =t;
        }
    }
    public int size(){
        int size = 0;
        ListNode node = n1.front;
        while(front.next!=null){
            size++;
        }
        ListNode t =n1.next;
        System.out.println(size);
    }
    public boolean isEmpty(){
        return front==null;
    }
    public void clear(){
        front == null;
    }
    public int indexOf(int value){
       int count = -1;
       ListNode node = front;
       while(node.data!=value){
           count++;
           node = node.next;
       }
       return count;
    }
    public boolean contains(){
        
    }
}


