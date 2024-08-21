/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whoisinthemiddle;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class WhoIsInTheMiddle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(a<b && a>c || a<c && a>b){
            System.out.println(a);
        }
        else if(b<a && b>c || b>a && b<c){
            System.out.println(b);
        }
        else if(c<a && c>b || c<b && c>a){
            System.out.println(c);
        }
        else if(c==a && a==b){
            System.out.println(c);
        }
    }
    
}
