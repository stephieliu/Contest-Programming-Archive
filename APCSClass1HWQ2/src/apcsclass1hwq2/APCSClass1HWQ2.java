/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcsclass1hwq2;

/**
 *
 * @author Stephie
 * FunWithPackaging
 */
import java.util.*;
public class APCSClass1HWQ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bags = input.nextInt();
        int x = bags;
        double cost = bags*5.5;
        int large = 0, medium = 0, small = 0;
        while(bags>0){
            if(bags>=20){
                large++;
                bags-=20;
            }
            else if(bags>=10){
                medium++;
                bags-=10;
            }
            else{
                small++;
                bags-=5;
            }
        }
        double largeC = large*1.80;
        double medC = medium*1.00;
        double smallC = small*0.60;
        System.out.println("Number of Bags Ordered: "+x+" - $ "+String.format("%.2f",cost));
        System.out.println("Boxes Used:\n\t"+large+" Large - $"+String.format("%.2f",largeC));
        System.out.println("\t"+medium+" Medium - $"+String.format("%.2f",medC));
        System.out.println("\t"+smallC+" Small - $"+String.format("%.2f",smallC));
        System.out.println("Your total cost is: $ "+String.format("%.2f",(cost+largeC+medC+smallC)));
    }
    
}
