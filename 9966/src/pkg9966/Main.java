/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9966;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static boolean Rotatable(String n) {
    if (n == null || n.length() == 0) {
    return true;
    }
    HashMap < Character, Character > map = new HashMap < Character, Character > ();
    map.put('0', '0');
    map.put('1', '1');
    map.put('8', '8');
    map.put('6', '9');
    map.put('9', '6');
    int left = 0;
    int right = n.length() - 1;
    while (left <= right) {
     if (!map.containsKey(n.charAt(right)) || n.charAt(left) != map.get(n.charAt(right))) {
      return false;
     }
     left++;
     right--;
    }
    return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //take in the interval
        long m = input.nextLong();
        long n = input.nextLong();
        long counter = 0;
        for(long i = m; i>=m && i<=n; i++){
            String length = String.valueOf(i);
            if(Rotatable(length)){
                counter++;
            }
        }
        System.out.println(counter);
    }
    
}
