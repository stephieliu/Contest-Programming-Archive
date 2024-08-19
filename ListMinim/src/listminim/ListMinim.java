/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listminim;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class ListMinim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        Stack<Integer> elements =new Stack<Integer>();
        Stack<Integer> temp =new Stack<Integer>();
        Stack<Integer> temp1 = new Stack<Integer>();
        for(int i=0; i<size; i++){
            elements.push(input.nextInt());
        }
        for(int i = 0; i<size; i++){
            while(!elements.isEmpty()){
                int tmp = elements.pop();
                while(!temp.isEmpty() && temp.peek()>tmp){
                    elements.push(temp.pop());
                }
                temp.push(tmp);
            }
            while(!temp.isEmpty()){
                temp1.push(temp.pop());
            }
            while(!temp1.isEmpty()){
                
                int output = temp1.pop();
                System.out.println(output);
            }
        }
    }
    
}
