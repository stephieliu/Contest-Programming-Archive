/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modinverse;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class ModInverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int x = input.nextInt();
        int m = input.nextInt();
        boolean found = false;
        int n = 0;
        for(int i= 1; i<m; i++){
            if((x*i)%m==1){
                found=true;
                n = i;
                break;
            }
        }
        if(found==true){
            System.out.println(n);
        }
        else{
            System.out.println("No such integer exists.");
        }
    }
    
}
