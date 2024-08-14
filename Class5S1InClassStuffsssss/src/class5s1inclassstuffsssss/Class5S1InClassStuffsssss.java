/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class5s1inclassstuffsssss;

/**
 *
 * @author Stephie
 */
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
public class Class5S1InClassStuffsssss {
    
//    public static void ErdosNum(String[] args){
//        Scanner input = new Scanner(System.in);
//        Map<String, ArrayList> myMap = new HashMap<String, ArrayList>();
//        int Papers = input.nextInt();
//        int Authors = input.nextInt();
//        String str1 = input.nextLine();
//        for(int i = 0; i<Papers; i++){
//            str1 = input.nextLine();
//            String strBook = str1.substring(str1.indexOf(":")+1);
//            String [] strAuthors = str1.substring(0 , str1.indexOf(":")).split("\\.,");
//            ArrayList<String>listAuthors = new ArrayList<>();
//            for(int j = 0; j<strAuthors.length; j++){
//                if(!strAuthors[j].endsWith(".")){
//                    System.out.println(strAuthors[j]+".");
//                }
//                else{
//                    System.out.println(strAuthors[j]);
//                }
//            }
//            myMap.put(strBook, listAuthors);
//        }
//        ArrayList<String>[] authorList = new ArrayList[myMap.keySet().size()];
//        int index = 0;
//        for(String K : myMap.keySet()){
//            authorList[index] = myMap.get(K);
//            index++;
//        }
//        for(int a = 0; a<Authors; a++){
//            String strA = input.nextLine();
//            for(int b = 0; b<authorList.length; b++){
//                ArrayList<String> list1 = authorList[b];
//                if(list1.indexOf(strA)>=0 && list1.indexOf("Erdos, P.")>=0){
//                    System.out.println(strA+"\t"+1);
//                }
//                else{
//                    
//                }
//            }
//            
//        }
//    }
//    public static void QueuesDemo(String[] args) {
//        //Declaring an Integer queue
//        Queue <Integer> intQ1 = new LinkedList<Integer>();
//        //adding an element
//        intQ1.add(10);
//        intQ1.add(20);
//        //the size of the queue
//        System.out.println(intQ1.size());
//        //peek = see element on the front of the queue (first in)
//        System.out.println(intQ1.peek());
//        //removing an element
//        System.out.println(intQ1.poll());
//        System.out.println(intQ1.peek());
//        //is the queue empty?
//        System.out.println(intQ1.isEmpty());
//        intQ1.poll();
//        System.out.println(intQ1.isEmpty());
//        //read 10 integers from the user and store in the queue
//        //when they are stored, go through the queue and find sum of elements
//        //print total
//        Scanner input = new Scanner(System.in);
//        Queue<Integer> rand = new LinkedList<Integer>();
//        rand.add(input.nextInt());
//        int sum = 0;
//        int size = rand.size();
////        for(int i = 1; i<size; i++){
////            sum += rand.poll();
////        }
//        while(!rand.isEmpty()){
//            sum+=rand.poll();
//        }
//        System.out.println(sum);
//    }
    //q1 is an integer queue
    //return true if the integers form a palindrome
    public static boolean isPalindrome(Queue<Integer> q1){
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        if(q1.size()%2 == 0){
            stack1.clear();
            stack2.clear();
            for(int i = 0; i<q1.size()/2; i++){
                stack1.push(q1.poll());
            }
            for(int i = 0; i<q1.size()/2; i++){
                stack2.push(q1.poll());
                Stack<Integer> temp = new Stack<>();
                temp.push(stack2.pop());
                stack2.push(temp.pop());
            }
            while(!stack1.isEmpty() && !stack2.isEmpty()){
                if(!Objects.equals(stack1.pop(), stack2.pop())){
                    return false;
                }
                else{
                    return true;
                }
            }
        }
        else{
            stack1.clear();
            stack2.clear();
            for(int i = 0; i<q1.size()/2; i++){
                stack1.push(q1.poll());
            }
            q1.poll();
            for(int i = 0; i<q1.size()/2; i++){
                stack2.push(q1.poll());
                Stack<Integer> temp = new Stack<>();
                temp.push(stack2.pop());
                stack2.push(temp.pop());
            }
            while(!stack1.isEmpty() && !stack2.isEmpty()){
                if(!Objects.equals(stack1.pop(), stack2.pop())){
                    return false;
                }
                else{
                    return true;
                }
            }
        }
        return true;
    }
    //find the minimum value in the queue
    public static int minQueue(Queue<Integer> q1){
        Stack<Integer> stack1 = new Stack<>();
        Queue<Integer> q3 = new LinkedList<>();
        int size = q1.size();
        for(int i = 0; i<size; i++){    
            stack1.push(q1.poll());
            if(stack1.peek()<=q1.peek()){
                stack1.pop();
            }
            else{
                q1.poll();
            }
        }
//        int minimum = Integer.MAX_VALUE;
//        while(!q1.isEmpty()){
//            if(q1.peek()< minimum){
//                
//            }
//        }
        return(stack1.peek());

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue <Integer> q2 = new LinkedList<>();
        q2.add(input.nextInt());
        System.out.println(minQueue(q2));
        System.out.println(q2.isEmpty());
//        if(isPalindrome(q2) == true){
//            System.out.println("isPalindrome Test1 pass");
//        }
//        else{
//            System.out.println("isPalindrome Test1 fail");
//        }
    }
    
}