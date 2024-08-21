/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangletimes;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
public class TriangleTimes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angles1 = input.nextInt();
        int angles2 = input.nextInt();
        int angles3 = input.nextInt();
        int Sum = angles1+angles2+angles3;
        if(Sum == 180 && angles1!=0 && angles2!=0 && angles3!=0){
            if(angles1==60 && angles2 == 60 && angles3 == 60){                
                System.out.println("Equilateral");
            }
            else if(angles1 == angles2 || angles1 == angles3){
                System.out.println("Isosceles");                                
            }
            else{
                System.out.println("Scalene");
            }
        }
        else{
            System.out.println("Error");
        }
    }
    
}
