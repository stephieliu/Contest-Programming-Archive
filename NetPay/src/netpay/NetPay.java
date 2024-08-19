/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netpay;

/**
 *
 * @author Stephie
 */
public class NetPay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int h = 40;
        int w = 5;
        int i = 2;
        double t = 0.22;
        double n = (h * w - i) - t*(h * w - i);
        System.out.println("The net pay is " + n + ".");
    }
    
}
