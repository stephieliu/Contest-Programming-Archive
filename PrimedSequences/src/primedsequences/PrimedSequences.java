/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primedsequences;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class PrimedSequences {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0; i<n; i++){
            Queue <Integer> sequence = new LinkedList<>();
            Queue<Integer> store =new LinkedList<>();
            sequence.add(input.nextInt());
            int l = sequence.size();
            int x = 0;
            store.add(sequence.poll());
            int one = store.peek();
            if(one==sequence.peek()){
                System.out.println("Shotest primed subsequence is length 2:"+one+" "
                        +sequence.peek());
            }
            else{
                for(int j=0; j<l; j++){
                    for(int k = 3; k<l; k++){
                        if(one==sequence.peek()){
                            System.out.println("Shotest primed subsequence is length "+k+":"+one+" "
                            +sequence.peek());
                        }
                        else{
                            k++;
                        }
                    }
                }
            }
        }
        
    }
    
}
