/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package troubletimes;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class TroubleTimes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int D = input.nextInt();
        int [] options = new int [N];
        Stack<Integer> possible =new Stack<Integer>();
        int temp = 0;
        for(int i = 0; i<N; i++){
            options[i] = input.nextInt();
            if(D%options[i]==0){
                possible.push(options[i]);
            }
        }
        //sort the stack
        Stack<Integer> tempStack = new Stack<Integer>();
        while(!possible.isEmpty()){
            int tmp = possible.pop();
            while(!tempStack.isEmpty()&& tempStack.peek()>tmp){
                possible.push(tempStack.pop());
                
            }
            tempStack.push(tmp);
        }
        if(!tempStack.isEmpty()){
            System.out.println(tempStack.peek());
        }
        else{
            System.out.println("This is not the best time for a trip.");
        }
    }
    
}
