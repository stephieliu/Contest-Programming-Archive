/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tudordrinkssomemoretea;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class TudorDrinksSomeMoreTea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        Stack<String> straw = new Stack();
        int count = 0;
        for(int i = 0; i<7; i++){
            String part = input.next();
            if(straw.isEmpty()){
                straw.push(part);
            }
            else if(!straw.peek().equals(part)){
                straw.push(part);
            }
        }
        int size = straw.size();
        for(int i = 0; i<size; i++){
            if("T".equals(straw.peek())){
                straw.pop();
            }
            else{
                straw.pop();
                count++;
            }
        }
        System.out.println(count);
    }
    
}
