/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attaccoftheciphertexts;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class AttaccOfTheCipherTexts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String plaintext = input.nextLine();
        String correspond = input.nextLine();
        String ciphertext = input.nextLine();
        char [] map = new char[128];
        for(int i = 0; i<correspond.length(); i++){
            map[correspond.charAt(i)] = plaintext.charAt(i);
        }
        for(int i = 0; i<ciphertext.length(); i++){
            if(map[ciphertext.charAt(i)]==0){
                System.out.print(".");
            }
            else{
                System.out.print(map[ciphertext.charAt(i)]);
            }      
        }
    }
    
}
