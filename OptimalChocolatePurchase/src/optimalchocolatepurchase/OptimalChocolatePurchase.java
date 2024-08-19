/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optimalchocolatepurchase;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class OptimalChocolatePurchase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //take input and assign variables
        System.out.print("Enter the amount of money (in cents): ");
        int money = input.nextInt();
        System.out.print("Enter the cost of the first candy bar (in cents): ");
        int cfcb = input.nextInt();
        System.out.print("Enter the size of the first candy bar (in ounces): ");
        int sfcb = input.nextInt();
        System.out.print("Enter the cost of the second candy bar (in cents): ");
        int cscb = input.nextInt();
        System.out.print("Enter the size of the second candy bar (in ounces): ");
        int sscb = input.nextInt();
        System.out.print("Enter the cost of the third candy bar (in cents): ");
        int ctcb = input.nextInt();
        System.out.print("Enter the size of the third candy bar (in ounces): ");
        int stcb = input.nextInt();
        
        //determine best candy bars
        int cheapest = 0;
        int second=0;
        int third = 0;
        if(cfcb<cscb && cfcb<ctcb){
            cheapest = cfcb;
            second = cscb;
            third = ctcb;
        }
        else if(cscb<cfcb && cscb<ctcb){
            cheapest = cscb;
            second = ctcb;
            third = cfcb;
        }
        else if(ctcb<cscb && ctcb<cfcb){
            cheapest = ctcb;
            second = ctcb;
            third = cfcb;
        }
        else if(ctcb==cscb && cscb == cfcb){
            cheapest = ctcb;
            second = cfcb;
            third = cscb;
        }
        int greatest = money/cheapest;
        int leftover = money%cheapest;
        int secondbar = leftover/second;
        int left = secondbar%second;
        int thirdbar = left/third;
        System.out.println("Buy "+greatest + " of the"+cfcb+ secondbar+"of the"+cscb+ thirdbar+ "of the "+ctcb);
        int totalcost = greatest+secondbar+thirdbar;
        System.out.println(totalcost);
        int totalsize = (greatest*sfcb)+(secondbar*sscb)+(thirdbar*stcb);
        System.out.println(totalsize);
    }
    
}
