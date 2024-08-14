/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allisbalanced;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class AllIsBalanced {

    /**
     * @param args the command line arguments
     */
    public static boolean balancedParenthesies(String s) {
        Stack<Character> stack  = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '[' || c == '(' || c == '{' ) {     
                stack.push(c);
            } else if(c == ']') {
                if(stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            } else if(c == ')') {
                if(stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }           
            } else if(c == '}') {
                if(stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i<5; i++){
            String test = input.nextLine().toLowerCase();
            String temp = test.replaceAll("[a-z0-9]", "");
            if(temp.length()==0){
                System.out.println("balanced");
            }
            else if(balancedParenthesies(temp)==true){
                System.out.println("balanced");
            }
            else{
                System.out.println("not balanced");
            }
        }
    }
}
