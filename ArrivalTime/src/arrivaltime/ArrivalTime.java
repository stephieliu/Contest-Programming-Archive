/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrivaltime;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class ArrivalTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String [] time = s.split(":");
        int h = Integer.parseInt(time[0]);
        int m = Integer.parseInt(time[1]);
        int t = h*60 + m;
        for(int i = 240; i > 0; t++){
            if(t >= 420 && t < 600){
                i--;
            }
            else if(t >= 900 && t < 1140){
                i--;
            }
            else{
                i-=2;
            }
        }
        System.out.printf("%02d:%02d\n", t/60%24, t%60);
    }
    
}
