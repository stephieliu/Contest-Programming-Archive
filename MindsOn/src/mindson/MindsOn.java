/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mindson;

/**
 *
 * @author steph
 */
import java.util.*;
public class MindsOn
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Declare scanner
        Scanner sc = new Scanner(System.in);
        
        //Ask user for input
        System.out.println("Password: ");
        
        //Variables to store the password and flag to mark whether the conditions
        //for the capital have been met
        String password = sc.nextLine();
        boolean hasUpperCase = false;
        
        //Create for loop that iterates through each character of password
        for(char c: password.toCharArray())
        {
            //Checks whether the character is uppercase
            if(Character.isUpperCase(c))
            {
                hasUpperCase = true;// mark that there is at least one uppercase
                break;
            }
        }
        
        //Output based on whether there is a capital
        if(hasUpperCase)
        {
            System.out.println("There is at least one capital letter.");
        }
        else
        {
            System.out.println("There are no capital letters.");
        }
        
        //Close the scanner
        sc.close();
    }
}