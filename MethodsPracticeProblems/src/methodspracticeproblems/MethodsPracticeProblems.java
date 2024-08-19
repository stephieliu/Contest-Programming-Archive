/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodspracticeproblems;

/**
 *
 * @author steph
 */
import java.util.*;
public class MethodsPracticeProblems {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    
    //1.
    public static double distance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
    }
    
    //2.
    public static double power(double a, int n){
        double result = 1;
        for(int i = 0; i<n; i++){
            result *= a;
        }
        return result;
    }
    
    //3.
    public static String capitalize(String lower_case_word) {
        return lower_case_word.substring(0, 1).toUpperCase() + lower_case_word.substring(1);
    }
    
    //4.
    public static double getDollarAmount(int p, int n, int d, int q){
        return p*0.01 + n*0.05 + d*0.1 + q*0.25;
    }
    
    public static boolean PerfectSquare(int a, int b, int c){
        return (Math.pow(a, 2)+Math.pow(b, 2) == c) ? true: false;
    }
    
    public static boolean isPerfect(int n, int sum){
        return n == sum ? true: false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //1.
//        System.out.println("Enter four numbers: x1, y1, x2, and y2.");
//        System.out.println(distance(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
        
        //2.
//        System.out.println("Enter two numbers: the base and the power.");
//        System.out.println(power(sc.nextDouble(), sc.nextInt()));
        
        //3.
//        System.out.println("Enter a lowercase word.");
//        System.out.println(capitalize(sc.nextLine()));
        
        //4.
//        System.out.println("Enter your total coins:");
//        System.out.print("\nQuarters: ");
//        int q = sc.nextInt();
//        System.out.print("Dimes: ");
//        int d = sc.nextInt();
//        System.out.print("Nickels: ");
//        int n = sc.nextInt();
//        System.out.print("Pennies: ");
//        int p = sc.nextInt();
//        System.out.println("\nTotal: $"+getDollarAmount(p, n, d, q));
        
        //5. pythagorean triple
//        for(int a = 1; a <100; a++){
//            for(int b = 1; b < 100; b++){
//                int c = (int)Math.pow(a, 2)+ (int)Math.pow(b, 2);
//                if(PerfectSquare(a, b, c)){
//                    System.out.println(a + " " + b + " " + c);
//                }
//            }
//        }
        
        //6.
        for(int i = 1; i< 100; i++){
            //calculate factors of i
            int sum = 0;
            for(int j = 1; j<i; j++){
                if(i%j == 0){
                    sum+=j;
                }
            }
            if(isPerfect(i, sum)) System.out.println(sum);
        }
        
        sc.close();
    }
    
}
