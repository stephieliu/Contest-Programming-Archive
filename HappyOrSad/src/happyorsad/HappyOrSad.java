/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package happyorsad;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class HappyOrSad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        int Hcount = 0, start=0, start1 = 0, Scount=0;
        while(true){
            int p = n.indexOf(":-)", start);
            if(p==-1)break;
            Hcount++; start = p+1;
        }
        
        while(true){
            int p = n.indexOf(":-(", start1);
            if(p==-1)break;
            Scount++; start1 = p+1;
        }
        if(Scount>Hcount){
            System.out.println("sad");
        }
        else if(Hcount>Scount){
            System.out.println("happy");
        }
        else if(Hcount==Scount && Hcount>0){
            System.out.println("unsure");
        }
        else{
            System.out.println("none");
        }
    }
    
}
