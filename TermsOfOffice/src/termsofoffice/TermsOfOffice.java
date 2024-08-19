/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package termsofoffice;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class TermsOfOffice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        int Y = input.nextInt();
        while(X<=Y){
            System.out.println("All positions change in year "+X);
            X+=60;
        }
   }
    
}
