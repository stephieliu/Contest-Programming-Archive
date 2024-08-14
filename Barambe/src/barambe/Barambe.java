/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barambe;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Barambe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        Queue<Integer> periodplace = new LinkedList<>();
        for(int i = 1; i<text.length(); i++){
            if(Character.isUpperCase(text.charAt(i))&&i!=0 && text.charAt(i-1)==' '){
                periodplace.add(i);
            }
        }
        System.out.println(periodplace.toString());
        for(int i = 0; i<text.length(); i++){
            if(periodplace.isEmpty()){
                if(i==text.length()-1){
                    System.out.print(text.charAt(i));
                }
                else System.out.print(text.charAt(i));
                
            }
            else if(i==periodplace.peek()){
                System.out.print(". "+text.charAt(i));
                periodplace.poll();
            }
//            else if(i==periodplace.peek()-1){
//                
//            }
//            else if(i==text.length()-1){
//                System.out.print(text.charAt(i)+".");
//            }
            else{
                System.out.print(text.charAt(i));
            }
        }
        System.out.println(".");
    }
    
}
