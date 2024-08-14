/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccontestlvl1_hmk.pkg1;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class CContestLvl1_Hmk1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
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
            System.out.println("Not a classified alien.");
            if(antenna>=3 && eyes>4){
                System.out.println("Subtract "+(eyes-4)+" eyes to get a "+
                        "categorizable alien.");
            }
            else if(antenna<3 && eyes<=4){
                System.out.println("Add "+(3-antenna)+" antennas to get a"+
                        "categorizable alien.");
            }
            else if(antenna<=6 && eyes<2){
                System.out.println("Add "+(2-eyes)+" eyes to get a categorizable alien.");
            }
            else if(antenna>6 && eyes>=2){
                System.out.println("Subtract "+(antenna-6)+" antennas to get a "+
                        "categorizable alien.");
            }
            else if(antenna>2 && eyes<=3){
                System.out.println("Subtract "+(antenna-2)+" antennas to get a "+
                        "categorizable alien.");
            }
            else if(antenna<=2 && eyes>3){
                System.out.println("Subtract "+(eyes-3)+" eyes to get a categorizable alien.");
            }
        }
    }    
}