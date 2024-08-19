/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maximumelement;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class MaximumElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        Stack<Integer> query = new Stack<>();
        Stack<Integer> track = new Stack<>();
        for(int i = 0; i<N; i++){  
            int type = input.nextInt();
            switch (type) {
                case 1:
                    int x = input.nextInt();
                    query.push(x);
                    if(i == 0){
                        track.push(x);
                    }
                    else{
                        if(!query.empty() && !track.empty()){
                            if(query.peek() >= track.peek()){
                                track.push(x);
                            }
                            else if(query.peek() < track.peek()){
                                track.push(track.peek());
                            }
                        }
                        else{
                            query.push(x);
                            track.push(x);
                        }
                    }
                    break;
                case 2:
                    query.pop();
                    track.pop();
                    break;
                default:
                    System.out.print(track.peek());
                    break;
            }
        }
    }
    
}
