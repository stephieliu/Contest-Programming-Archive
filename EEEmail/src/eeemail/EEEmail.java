/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eeemail;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class EEEmail {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int j, i;
        for( i = 0; i<10; i++){
            HashSet<String> emails = new HashSet<>();
            int N = input.nextInt();
            String email, actual;
            String [] beforeandafter;
            String [] additionsign;
            for( j  = 0; j<N; j++){
                email = input.next().toLowerCase();
                actual = "";
                beforeandafter = email.split("@");
                beforeandafter[0] = beforeandafter[0].replaceAll("\\.", "");
                if(beforeandafter[0].contains("+")){
                    additionsign = beforeandafter[0].split("\\+");
                    actual = additionsign[0]+"@"+beforeandafter[1];
                    emails.add(actual);
                }
                else{
                    actual = beforeandafter[0]+"@"+beforeandafter[1];
                    emails.add(actual);
                }
            }
            System.out.println(emails.size());   
        }
    }
}