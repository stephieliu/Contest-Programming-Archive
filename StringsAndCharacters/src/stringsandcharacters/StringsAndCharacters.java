/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsandcharacters;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class StringsAndCharacters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ORACLE HELP CENTER
        //how to find ASCII value of any character:
        char a = input.next().charAt(0);
        System.out.println((int)a);
        //convert ASCII to char:
        char b = input.next().charAt(0);
        System.out.println((char)b);
        //You can do subtraction of characters (or addition or other stuff):
        char w = input.next().charAt(0);
        char y = input.next().charAt(0);
        System.out.println(w-y);
        //how to check if a char x is digit, lowercase, uppercase, or other:
        //DIGIT
        char x = input.next().charAt(0);
        if(x>='0' && x<='9'){
            System.out.println("digit");
        }
        //LOWERCASE
        else if(x>='a'&&x<='z'){
            System.out.println("lowercase");
        }
        //UPPERCASE
        else if(x>='A' && x<='Z'){
            System.out.println("uppercase");
        }
        //OTHER
        else{
            System.out.println("other");
        }
    }
    
}
