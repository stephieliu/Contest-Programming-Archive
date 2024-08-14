/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class13hmk.q2;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Class13HmkQ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(;;){
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            int k=1;
            int size = k;
            ArrayList<Integer> array = new ArrayList<Integer>();
            for(int i = 0; i < size; i++) {
                array.add(number); // from 0 to 9
            }
            for(int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
            }
            System.out.println();
            
            for(int i = 0;array.get(i)<array.size();i++){
                if(array.get(i)<array.get(i+1)){
                    System.out.println(array.get(i)+array.get(i+1));
                }
            }
            k++;
        }
    }
    
}
