/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonemicrowaveinclasssoln;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class PhoneMicrowaveInClassSoln {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int s = input.nextInt();
        String []big = input.next().split("/");
        String []small = input.next().split(":");
        int year = Integer.valueOf(big[0]);
        int month = Integer.valueOf(big[1]);
        int day = Integer.valueOf(big[2]);
        int hour = Integer.valueOf(small[0]);
        int minute = Integer.valueOf(small[1]);
        int second = Integer.valueOf(small[2]);
        hour -=s;
        while(hour<0){
            hour+=24;
            day--;
            if(day==0){
                month--;
                if(month==0){
                    month=12; 
                    year--;
                }
                day += days[month];
            }
        }
        System.out.printf("%d/%02d/%02d %02d:%02d:%02d",year, month, day, hour, minute, second);
        //rounding digits: 
        //(3 digits behind decimal place; rounded)
        double pi=3.14159265358979323846;
        System.out.printf("%.3f", pi);
    }
    
}
