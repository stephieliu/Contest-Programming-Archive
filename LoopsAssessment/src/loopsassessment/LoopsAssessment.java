/*
 * Stephie Liu
 * Feb. 14, 2022
 * Loops Assessment:
 * Program that asks user for a 3 digit integer with exactly one zero in it
 */
package loopsassessment;
import java.util.*;

/**
 *
 * @author steph
 */
public class LoopsAssessment
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Declare scannner
        Scanner sc = new Scanner(System.in);
        
        //boolean variable to keep track of whether there is only one zero
        boolean HasOneZero = false;
        
        while (!HasOneZero) //break out of loop if HasOneZero is true
        {
            //Prompt user for the number
            System.out.println("Enter num:");

            //Assume that the user will input a 3-digit integer.
            //Read as a string so you can use Char
            String num = sc.nextLine();
            
            //Counter for the number of 0's
            int count = 0;

            //for loop to cycle through each char in num
            for(int i = 0; i<3; i++)
            {
                //Take the char at index i in num (index starts at 0 and goes to 2)
                char c = num.charAt(i);
                
                //Check if char is equal to 0
                if(c == '0')
                {
                    count++; //Add to the counter for the number of 0's
                }
            }

            //if else statements to check the value of count for output
            if(count == 1)//Has one zero
            {
                HasOneZero = true;//declare to be true because there is only one 0
                System.out.println("Accepted.");
            }
            else if (count < 1)//too little 0's
            {
                System.out.println("Invalid. No 0's.\n");
            }
            else //too many 0's
            {
                System.out.println("Invalid. Too many 0's.\n");
            }
        }
        
        //Close the scanner
        sc.close();
    }
}
