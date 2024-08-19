/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo2.pkg0;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Modulo20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        int Y = input.nextInt();
        int Z = input.nextInt();
        boolean exists = false;
//        if(X%2==0){
//            if(Y==X-1){
//                if(Z == Y-1){
//                    System.out.println("YES");
//                }
//                else{
//            System.out.println("NO");
//        }
//            }
//            else{
//            System.out.println("NO");
//        }
//        }
//        else{
//            System.out.println("NO");
//        }
        for(int i = 0; i<Y; i++){
            if((X*i)%Y==Z){
                exists = true;
            }
        }
        if(exists == true){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
}
