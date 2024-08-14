/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0123456789;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit = input.nextInt();
        switch (digit) {
            case 1:
                System.out.println("*\n*\n*\n\n*\n*\n*");
                break;
            case 2:
                System.out.println(" * * *\n      *\n      *\n      *\n * * *\n*\n"
                        + "*\n*\n * * *");
                break;
            case 3:
                System.out.println("* * *\n      *\n      *\n      *\n* * *\n"
                        + "      *\n      *\n      *\n* * *");
                break;
            case 4:
                System.out.println("*     *\n*     *\n*     *\n * * *\n"
                        + "      *\n      *\n      *");
                break;
            case 5:
                System.out.println(" * * *\n*\n*\n*\n * * *\n"
                        + "      *\n      *\n      *\n * * *");
                break;
            case 6:
                System.out.println(" * * *\n*\n*\n*\n * * *\n*     *\n"
                        + "*     *\n*     *\n * * *");
                break;
            case 7:
                System.out.println("* * *\n     *\n     *\n     *\n\n"
                        + "     *\n     *\n     *");
                break;
            case 8:
                System.out.println(" * * *\n*     *\n*     *\n*     *\n"
                        + " * * *\n*     *\n*     *\n*     *\n * * *");
                break;
            case 9:
                System.out.println(" * * *\n*     *\n*     *\n*     *\n"
                        + " * * *\n      *\n      *\n      *\n * * *");
                break;
            case 0:
                System.out.println(" * * *\n*     *\n*     *\n*     *\n"
                        + "\n*     *\n*     *\n*     *\n * * *");
            default:
                break;
        }
    }
    
}
