/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balance;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Balance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.nextLine();       
        int count = 0;
        int counter = S.length() - 1;
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == '('){
                count++;
            }
            else{
                count--;
            }
            counter = Math.min(count, counter);
        }
        if(counter >= 0 && count == 0 || counter == 2 && count >= -2){
            System.out.println("YES");
        }
        else{
            if(counter >= 0 && count == 2 || counter >= -2 && count == -2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }    
        }
    }
//    public static boolean balancedParenthesies(String s) {
//        Stack<Character> stack  = new Stack<>();
//        for(int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            switch (c) {
//                case '[':
//                case '(':
//                case '{':
//                    stack.push(c);
//                    break;
//                case ']':
//                    if(stack.isEmpty() || stack.pop() != '[') {
//                        return false;
//                    }   break;
//                case ')':
//                    if(stack.isEmpty() || stack.pop() != '(') {
//                        return false;
//                    }   break;
//                case '}':
//                    if(stack.isEmpty() || stack.pop() != '{') {
//                        return false;
//                    }   break;
//                default:
//                    break;
//            }
//
//        }
//        return stack.isEmpty();
//    } 
}
