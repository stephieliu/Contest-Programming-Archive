/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadraticformula;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class QuadraticFormula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
        double x1 = 0, x2 = 0;
        x1 = (-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
        x2 = (-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
        System.out.println(x1+"\n"+x2);
    }
    
}
