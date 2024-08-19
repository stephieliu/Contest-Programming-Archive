/*
 * Stephie Liu
 * Mar. 1, 2022
 * Strings and Arrays Assessment:
 * Program that asks user for a username and a password and prints "accepted" or
 * "rejected" according to requirements.
 */
package stringsandarrays;
import java.util.*;
/**
 *
 * @author steph
 */
public class StringsAndArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declare scanner
        Scanner sc = new Scanner(System.in);
        
        //ask the user to input a username and a password
        System.out.println("Enter username: ");
        String user = sc.nextLine();
        System.out.println("Enter password:");
        String password = sc.nextLine().trim(); //trims trailing whitespaces
        //a char array of the password
        char[] pass = password.toCharArray();
        
        //boolean variables to track whether the password is acceptable
        boolean hasCapital = false, hasLower = false;
        
        //if the password is less than 8 characters long or contains the username
        //then it is immediately rejected
        if(password.length() < 8 || password.indexOf(user) != -1)
        {
            System.out.println("\nRejected.");
        }
        else//check if it passes the other conditions
        {
            for(char c: pass)//iterate through the char array
            {
                if(Character.isUpperCase(c))//if it has an uppercase letter, mark it
                {
                    hasCapital = true;
                }
                else if(Character.isLowerCase(c))//if it has a lowercase letter, mark it
                {
                    hasLower = true;
                }
            }
            if(hasCapital && hasLower)//it has at least one capital and one lowercase, it is accepted
            {
                System.out.println("\nAccepted.");
            }
            else//otherwise it is rejected
            {
                System.out.println("\nRejected.");
            }
        }
        
        //close the scanner
        sc.close();
    }
    
}
