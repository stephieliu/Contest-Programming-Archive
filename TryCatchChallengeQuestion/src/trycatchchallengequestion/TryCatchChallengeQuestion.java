/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatchchallengequestion;

/**
 *
 * @author steph
 */
import java.util.*;
public class TryCatchChallengeQuestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test1, test2, test3, name;
        int n;
        double d;
        while(true)
        {
//            System.out.println("Name: ");
//            name = sc.nextLine();
//            System.out.println("Int: ");
//            test2 = sc.nextLine();
//            System.out.println("Fraction: ");
//            test3 = sc.nextLine();
            while(true){
                System.out.println("Name: ");
                name = sc.nextLine();
                System.out.println("Int: ");
                test2 = sc.nextLine();
                System.out.println("Fraction: ");
                test3 = sc.nextLine();
                try
                {
                    n = Integer.parseInt(test2);
                    d = Double.parseDouble(test3);
                    break;
                }
                catch(Exception e){
                    System.out.println("Not a valid input >:(");
                }
            }
            System.out.println("Your name is "+name+" and your numbers are "+n+ " and "+d);
            System.out.println("Would you like to change your name or numbers?");
            test1 = sc.nextLine();
            if(!test1.equals("Yes"))
            {
                
            }
            while(true){
                try{
                    if(test1.equals("Yes") || test1.equals("No"))
                        break;
                }
                catch(Exception e){
                    System.out.println("Please enter Yes or No.");
                }
            }
            if(test1.equals("No")) break;
        }
        
        //sc.close();
    }
    
}
