/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fromprefixtopostfix;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class FromPrefixToPostfix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(1==1){
            String Prefix = input.nextLine().replaceAll("\\s", ""); 
            if(!Prefix.equals("0")){
                Stack<String> Operation = new Stack();
                for(int j = Prefix.length() - 1; j >= 0; j--){
                    String Postfix = "";
                    if(Prefix.charAt(j) != '*' && Prefix.charAt(j) != '/' &&
                            Prefix.charAt(j) != '+' && Prefix.charAt(j) != '-')
                        Operation.push(Character.toString(Prefix.charAt(j)));
                    else{
                        String op1 = Operation.pop();
                        String op2 = Operation.pop();
                        Postfix += op1 + " ";
                        Postfix += op2 + " ";
                        Postfix += Character.toString(Prefix.charAt(j));
                        Operation.push(Postfix);
                    }
                }
                System.out.println(Operation.pop());
            }
            else break;
        }
    }
    
}
