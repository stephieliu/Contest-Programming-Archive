/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgboolean;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Boolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String value = input.nextLine();
        String word = "not";
        String a[] = value.split(" ");
        
        int count = 0;
        for(int i = 0; i<a.length; i++){
            if(word.equals(a[i])){
                count++;
            }
        }
        if(count%2==0 && value.contains("True")){
            System.out.println("True");
        }
        else if(count%2==0 && value.contains("False")){
            System.out.println("False");
        }
        else if(count%2!=0 && value.contains("True")){
            System.out.println("False");
        }
        else if(count%2!=0 && value.contains("False")){
            System.out.println("True");
        }
    }
    
}
