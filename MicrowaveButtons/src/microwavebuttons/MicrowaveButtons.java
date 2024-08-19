/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package microwavebuttons;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class MicrowaveButtons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] time = input.next().split(":");
        int hour = Integer.valueOf(time[0]);
        int minute = Integer.valueOf(time[1]);
        int second = Integer.valueOf(time[2]);
        String buttons = input.next();
        
    }
    
}
