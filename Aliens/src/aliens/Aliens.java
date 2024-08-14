/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aliens;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Aliens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int antenna = input.nextInt();
        int eyes = input.nextInt();
        
        if(antenna >= 3 && eyes <= 4){
            if(antenna<=6){
            System.out.println("TroyMartian or VladSaturnian");
            }
            else{
                System.out.println("TroyMartian");
            }
        }
        else if(antenna<=6 && eyes>=2){
            if(antenna<=2 && eyes<=3){
            System.out.println("VladSaturnian or GraemeMercurian");
            }
            else{
                System.out.println("VladSaturnian");
            }
        }
        else if(antenna<=2 && eyes<=3){
            System.out.println("GraemeMercurian");
        }
        else{
            System.out.println("Not a classified alien");
        }
    }
    
}
