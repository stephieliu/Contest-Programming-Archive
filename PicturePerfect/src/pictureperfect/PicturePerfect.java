/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pictureperfect;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class PicturePerfect {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(1==1){
            int C = input.nextInt();
            if(C==0){
                break;
            }
            else{
                int l = (int) Math.sqrt(C);
                int sq = l * l;
                long perimeter = 0;
                if (sq == C){  
                    perimeter = l * 4;
                    System.out.println("Minimum perimeter is "+perimeter
                            +" with dimensions "+l+" x "+l);
                }
                else{
                    long row = C / l;   
                    perimeter = 2 * (l + row);  
                    if (C % l != 0){ 
                        perimeter += 2; 
                    }
                    System.out.println("Minimum perimeter is "+perimeter
                        +" with dimensions "+l+" x "+row);
                } 
                
            }
        }
    }
    
}
