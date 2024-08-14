/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpet;

/**
 *
 * @author Stephie
 */
public class Carpet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int w = 6;
        double l = 8.5;
        double c = 19.95;
        double t = (w * l) * c;
        String result = String.format("%.2f", t);
        System.out.println("The cost is $" + result + ".");
    }
}
