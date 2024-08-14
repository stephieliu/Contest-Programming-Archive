/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averagetemperature;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class AverageTemperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter midnight temp: ");
        int mid = input.nextInt();
        System.out.print("Enter the number of temperatures: ");
        int N = input.nextInt();
        int[] temp = new int[N];
        for(int i = 0; i<N; i++){
            System.out.print("Enter a temp: ");
            temp[i] = input.nextInt();
            
        }
        int[] hour = new int[N];
        for(int i = 0; i<N; i++){
            System.out.print("Enter the hour of the temp: ");
            hour[i] = input.nextInt();
            
        }
        System.out.print("Enter the hour of the temp: ");
            System.out.print("Enter the minute of the temp: ");
            System.out.print("Enter the last midnight temp: ");
        
    }
    
}
