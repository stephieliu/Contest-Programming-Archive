/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastpower;

/**
 *
 * @author steph
 */
public class FastPower {

    /**
     * @param args the command line arguments
     */
    //Version 1:
    public static int pow1(int in, int power, int mod) {
        if (power == 1) {
            return in % mod;
        }
        if (power == 2) {
            return (in * in) % mod;
        }
        if (power % 2 == 1) {
            return (pow1(pow1(in, power / 2, mod), 2, mod) * in) % mod;
        } else {
            return pow1(pow1(in, power / 2, mod), 2, mod) % mod;
        }
    }
    //Version 2:
    static int pow2(int base, int exp, int mod){
        if(exp == 0) return 1;
        int temp = pow2(base, exp/2, mod);
        temp = temp * temp % mod;
        if(exp%2 == 0) return temp;
        return temp*base%mod;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
