/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asciibargraphs;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class ASCIIBarGraphs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i<5; i++){
            int in = input.nextInt();
            switch (in) {
                case -5:
                    System.out.println("*****|-----");
                    break;
                case -4:
                    System.out.println("-****|-----");
                    break;
                case -3:
                    System.out.println("--***|-----");
                    break;
                case -2:
                    System.out.println("---**|-----");
                    break;
                case -1:
                    System.out.println("----*|-----");
                    break;
                case 0:
                    System.out.println("-----|-----");
                    break;
                case 1:
                    System.out.println("-----|*----");
                    break;
                case 2:
                    System.out.println("-----|**---");
                    break;
                case 3:
                    System.out.println("-----|***--");
                    break;
                case 4:
                    System.out.println("-----|****-");
                    break;
                default:
                    System.out.println("-----|*****");
                    break;
            }
        }
    }
    
}
