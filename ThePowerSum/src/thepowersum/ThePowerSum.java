/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thepowersum;

/**
 *
 * @author Stephie
 */
import java.util.*;

class Numb {
    public int acc;
    public int last;
    public Numb(int z, int x){
        acc=z;
        last=1;
    }
}
public class ThePowerSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        Stack <Numb> stack = new Stack<Numb>();
        stack.push(new Numb(0,1));
        int count = 0;
        while(!stack.empty()){
            Numb temp = stack.pop();
            int c = temp.last;
            while(Math.pow(c,b)+temp.acc <= a){
                if(Math.pow(c,b)+temp.acc==a){
                    count++;
                    break;
                }
                else{
                    stack.push(new Numb((int)Math.pow(c,b)+temp.acc, c+1));
                }
                c++;
            }
        }
        System.out.println(count);
    }
    
}
