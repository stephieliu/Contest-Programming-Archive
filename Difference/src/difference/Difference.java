/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package difference;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Difference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        if((N+1)%4==0||N%4==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    
}
