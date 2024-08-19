/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotatingletters;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class RotatingLetters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.next();
        for(int i = 0; i<n.length(); i++){
            if(n.charAt(i)=='I'||n.charAt(i)=='O'||n.charAt(i)=='S'
                    ||n.charAt(i)=='H'||n.charAt(i)=='Z'
                    ||n.charAt(i)=='X' ||n.charAt(i)=='N'){
                if(i==n.length()-1){
                    System.out.println("YES");
                }
            }
            else{
                System.out.println("NO");
                break;
            }
        }
    }
    
}
