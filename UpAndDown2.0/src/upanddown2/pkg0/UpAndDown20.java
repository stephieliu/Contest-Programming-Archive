/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upanddown2.pkg0;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class UpAndDown20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();
        int S = input.nextInt();
        int Nikky = 0, Byron =0, count =0, count1= 0;
        for(int i =0;i<S;i++){
            if(i%A==0&&i>=A){
                count1 += B;
            }
            else{
                count += 1;
            }
            if(count+count1>=S){
                break;
            }
        }
        Nikky = count - count1;
        count =0;
        count1 =0;
        for(int i =0;i<S;i++){
            if(i%C==0&&i>=C){
                count1 += D;
            }
            else{
                count += 1;
            }
            if(count+count1>=S){
                break;
            }
        }
        Byron = count - count1;
        if(Byron>Nikky){
            System.out.println("Byron");
        }
        else if(Nikky>Byron){
            System.out.println("Nikky");
        }
        else{
            System.out.println("Tied");
        }
    }
    
}
