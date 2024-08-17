/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dressingup;

/**
 *
 * @author Stephie
 */
import java.io.*;
import java.util.*;

public class DressingUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int h = input.nextInt();
        a = 2*h - 2;
        b = 1;
        for(int i = 1; i <= h; i++){
            for(int j = 1; j <= b; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= a; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= b; j++){
                System.out.print("*");
            }
            if(i <= h/2){
                a -= 4;
                b += 2;
            }
            else{
                a += 4;
                b -= 2;
            }
            System.out.println("");
        }
    }
}
