/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slotmachiines;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class SlotMachiines {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nQ = input.nextInt();
        int a = input.nextInt();//number of times machine 1 is played
        int b = input.nextInt();//# of times machine 2 is played
        int c= input.nextInt();//number of times machine 3 is played
        int brokeCount = 0;
        while(nQ>0){
            //Machine 1
            if(nQ>0 && (a+1)%35 ==0){
                nQ--;
                a++;
                nQ+=30;
                brokeCount++;
            }
            else if(nQ>0){
                nQ--;
                a++;
                brokeCount++;
            }
            //Machine 2
            if(nQ>0 && (b+1)%100 ==0){
                nQ--;
                b++;
                nQ+=60;
                brokeCount++;
            }
            else if(nQ>0){
                nQ--;
                b++;
                brokeCount++;
            }
            //Machine 3
            if(nQ>0 && (c+1)%10 ==0){
                nQ--;
                c++;
                nQ+=9;
                brokeCount++;
            }
            else if(nQ>0){
                nQ--;
                c++;
                brokeCount++;
            }
        }
        System.out.println("Martha plays "+brokeCount+" times before going broke.");
    }
    
}
