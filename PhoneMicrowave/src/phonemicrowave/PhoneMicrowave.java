/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonemicrowave;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class PhoneMicrowave {

    public String ad (String x){
        x = (Integer.parseInt("0")*(2-x.length()))+ x;
        return x;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int jump = input.nextInt();
        String []big = input.next().split("/");
        String []small = input.next().split(":");
        int year = Integer.valueOf(big[0]);
        int month = Integer.valueOf(big[1]);
        int day = Integer.valueOf(big[2]);
        int hour = Integer.valueOf(small[0]);
        int minu = Integer.valueOf(small[1]);
        int sec = Integer.valueOf(small[2]);
        day +=((hour-jump)-(hour-jump)%24)/24;
        hour = (hour-jump)%24;
        int counter = month - 2;
        while(true){
            if(day<=0){
                day=months[counter+1];
                if(month==1){
                    year -=1;
                    month = 12;
                }
                else{
                    month-=1;
                }
                counter-=1;
            }
            else{
                break;
            }
        }
//        int S = input.nextInt();
//        String date = input.next();
//        String [] dates = date.split("/");
//        int year = Integer.valueOf(dates[0]);
//        int month = Integer.valueOf(dates[1]);
//        int day = Integer.valueOf(dates[2]);
//        String time = input.next();
//        String [] times = time.split(":");
//        int hour = Integer.valueOf(times[0]);
//        int minutes = Integer.valueOf(times[1]);
//        int seconds = Integer.valueOf(times[2]);
//        for(int i = 0; i<S; i++){
//            if(hour==1){
//                hour=24;
//                if(day!=1){
//                    day--;
//                }
//                else{
//                    month--;
//                    switch (month) {
//                        case 1:
//                        case 3:
//                        case 5:
//                        case 7:
//                        case 8:
//                        case 10:
//                        case 0:
//                            if(month==0){
//                                month=12;
//                                day=31;
//                                year--;
//                            }
//                            else{
//                                day=31;
//                                month--;
//                            }   break;
//                        case 2:
//                            day=28;
//                            break;
//                        default:
//                            day=30;
//                            break;
//                    }
//                }
//            }
//            else{
//                hour--;
//            }
//        }
        if(year<10){
            System.out.print("0"+year+"/");
        }
        else{
            System.out.print(year+"/");
        }
        if(month<10){
            System.out.print("0"+month+"/");
        }
        else{
            System.out.print(month+"/");
        }
        if(day<10){
            System.out.print("0"+day);
        }
        else{
            System.out.print(day);
        }
        System.out.print(" ");
        if(hour<10){
            System.out.print("0"+hour+":");
        }
        else if(hour==24){
            System.out.print("00:");
        }
        else{
            System.out.print(hour+":");
        }
        if(minu<10){
            System.out.print("0"+minu+":");
        }
        else{
            System.out.print(minu+":");
        }
        if(sec<10){
            System.out.print("0"+sec);
        }
        else{
            System.out.print(sec);
        }
        System.out.println();
    }
    
}
