/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c5s1inclassproblems;

/**
 *
 * @author Stephie
 */
//mouseMove
import java.util.*;
public class C5S1InClassProblems {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int intX = input.nextInt();
        int intY = input.nextInt(), x = input.nextInt(), y = input.nextInt();
        int iX = 0, iY = 0;
        while(x != 0 && y != 0){
            iX = iX+ x;
            iY = iY +y;
            if(iX<0) iX = 0;
            else if(iX>intX) iX = intX;
            if(iY<0) iY = 0;
            else if(iY> intY) iY = intY;
            System.out.println(iX +"\t"+iY);
            x = input.nextInt();
            y = input.nextInt();
        }
    }
    
}