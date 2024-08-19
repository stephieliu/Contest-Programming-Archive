/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bearings;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
public class Bearings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double bearing;
        System.out.print("Please enter a bearing from 0 to 359: ");
        Scanner input = new Scanner(System.in);
        bearing = input.nextDouble();
        if(bearing >=0 && bearing <90){
            System.out.println("Your bearing is North.");
        }
        else if(bearing >=90 && bearing <180){
            System.out.println("Your bearing is East.");
        }
        else if(bearing >=180 && bearing <270){
            System.out.println("Your bearing is South.");
        }
        else if(bearing >=270 && bearing <360){
            System.out.println("Your bearing is West.");
        }
        else{
            System.out.println("Please enter a number between 0 and 360 degrees.");
        }   
    }
    
}
