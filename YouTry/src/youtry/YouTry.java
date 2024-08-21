/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youtry;

/**
 *
 * @author steph
 */
import java.util.*;
public class YouTry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Sentence:");
        char[] array = sc.nextLine().trim().toCharArray();
        int words = 1;
        
        for(int i = 0; i<array.length; i++)
        {
            if(array[i] == ' ' && array[i+1] != ' ')
            {
                words++;
            }
        }
        System.out.println(words);
        
        sc.close();
    }
    
}
