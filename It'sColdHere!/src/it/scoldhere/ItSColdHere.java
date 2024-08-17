/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.scoldhere;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class ItSColdHere {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int coldest = Integer.MAX_VALUE;
        String Cold = "";
        while(true){
            String city = input.next();
            int temperature = input.nextInt();
            if(temperature<coldest){
                coldest = temperature;
                Cold = city;
            }
            if("Waterloo".equals(city)){
                break;
            }
        }
        System.out.println(Cold);
    }
    
}
