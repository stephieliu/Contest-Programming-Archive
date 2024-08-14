/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class ABC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = new int [3];
        for(int i = 0; i<3; i++){
            array[i] = input.nextInt();
        }
        String desired = input.next();
        Arrays.sort(array);
        int A = array[0];
        int B = array[1];
        int C = array[2];
        for(int i = 0; i<desired.length(); i++){
            if(desired.charAt(i)=='A'){
                System.out.print(A+" ");
            }
            else if(desired.charAt(i)=='B'){
                System.out.print(B+" ");
            }
            else{
                System.out.print(C+" ");
            }
        }
    }
    
}
