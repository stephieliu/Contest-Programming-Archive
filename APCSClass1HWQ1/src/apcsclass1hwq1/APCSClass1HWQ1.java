/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcsclass1hwq1;

/**
 *
 * @author Stephie
 * FIBONACCI NUMBER
 */
import java.text.DecimalFormat;
import java.util.*;
public class APCSClass1HWQ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        DecimalFormat df = new DecimalFormat("###.#");
        double FN = (1/Math.sqrt(5))*(Math.pow(((1+Math.sqrt(5))/2), N) - 
                Math.pow(((1-Math.sqrt(5))/2), N));
        System.out.println(df.format(FN));
    }
    
}
