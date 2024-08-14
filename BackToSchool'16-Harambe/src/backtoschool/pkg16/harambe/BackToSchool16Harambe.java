/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backtoschool.pkg16.harambe;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class BackToSchool16Harambe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String essay = input.nextLine();
        int count = 0;
        int count1 = 0;
        for(int i = 0; i<essay.length(); i++){
            if(Character.isUpperCase(essay.charAt(i))){
                count++;
            }
            else if(Character.isLowerCase(essay.charAt(i))){
                count1++;
            }
        }
        if(count>count1){
            System.out.println(essay.toUpperCase());
        }
        else if(count1>count){
            System.out.println(essay.toLowerCase());
        }
        else{
            System.out.println(essay);
        }
    }
    
}
