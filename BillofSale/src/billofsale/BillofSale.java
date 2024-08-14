/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billofsale;
/**
 *
 * @author Stephie
 */
public class BillofSale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double s = 12.49;
        int p = 20;
        double t = 0.13;
        double m = s * t;
        double a = m + s;
        double c = p - a;
        String result = String.format("%.2f", m);
        String total = String.format("%.2f", a);
        String change = String.format("%.2f", c);
        System.out.println("Bill of Sale");
        System.out.println("Purchased Price: $" + s);
        System.out.println("Given Amount: $" + p);
        System.out.println("Tax: $" + result);
        System.out.println("Total: $" + total);
        System.out.println("Change: $" + change);

    }
    
}
