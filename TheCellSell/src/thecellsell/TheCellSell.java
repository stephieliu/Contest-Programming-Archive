/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thecellsell;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class TheCellSell {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dayMin = input.nextInt();
        int eveMin = input.nextInt();
        int weekMin = input.nextInt();
        double PlanA = 0;
        double PlanB = 0;
        if(dayMin<=100){
            PlanA = Math.round(((eveMin*0.15)+(weekMin*0.20)))/100;
            PlanB = Math.round(((eveMin*0.35)+(weekMin*0.25)))/100;
            
        }
        else if(dayMin<=250){
            PlanA = Math.round((((dayMin-100)*0.25)+(eveMin*0.15)+(weekMin*0.20))*100)/100;
            PlanB = Math.round(((eveMin*0.35)+(weekMin*0.25))*100)/100;
        }
        else{
            PlanA = Math.round((((dayMin-100)*0.25)+(eveMin*0.15)+(weekMin*0.20))*100)/100;
            PlanB = Math.round((((dayMin-250)*0.45)+(eveMin*0.35)+(weekMin*0.25))*100)/100; 
        }
        System.out.println("Plan A costs "+PlanA);
        System.out.println("Plan B costs "+PlanB);
        if(PlanA>PlanB){
            System.out.println("Plan B is cheapest.");
        }
        else if(PlanA<PlanB){
            System.out.println("Plan A is cheapest.");
        }
        else{
            System.out.println("Plan A and B are the same price.");
        }
    }
    
}
