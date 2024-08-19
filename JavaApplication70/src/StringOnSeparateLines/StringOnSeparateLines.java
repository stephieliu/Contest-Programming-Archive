/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringOnSeparateLines;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
public class StringOnSeparateLines {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        int i=0;
        while(i<s.length()){
            System.out.println(s.charAt(i));
            i++;
        }
    }
    
}
