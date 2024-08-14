/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commissions;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
public class Commissions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gross = 0.0;//total gross sales
        double earnings;//earnings made from sales
        int product = 0;//the product number
        int numberSold;//number sold of a given product
        
        while(product < 4){
            product++;//prompt and read number of the product sold from user
            System.out.printf("Enter number sold of product: ", product);
            numberSold = sc.nextInt();
            //determine gross of each individual product and add to total
            if(product == 1)
                gross += numberSold *134.99;
            else if(product == 2)
                gross += numberSold *112.75;
            else if(product == 3)
                gross += numberSold * 85.95;
            else if(product == 4)
                gross +=numberSold *240.89;
        }//end while loop
        earnings = 0.075 * gross + 500; //calculate earnings
        System.out.printf("Earnings this week: /n", earnings);
    }//end method  
}//end class
