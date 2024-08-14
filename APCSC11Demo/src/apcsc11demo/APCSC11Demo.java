/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcsc11demo;

/**
 *
 * @author Stephie
 */
public class APCSC11Demo {

    /**
     * @param args the command line arguments
     */
    public static int intNSum(int n){
        if(n == 1) return 1;
        return n + intNSum(n - 1);
//        int intTotal = 0;
//        for(int i = 1; i<=n; i++){
//            intTotal += i;
//        }
//        return intTotal;
    }
    
    public static int intNProduct(int n){
        if(n == 1) return 1;
        return n * intNProduct(n - 1);
    }
    /**
     * 
     * @param n is an integer >=1
     * @return all the numbers less from 1 to n using recursion
     * in the same line, tab separated
     */
    public static int count = 0;
    public static void printNum(int n){
        if(n == 1){
            System.out.print("1"+"\t");
        }
        else{
            printNum(n-1);
            System.out.print(n+"\t");
        }        
    }
    /**
     * fibonacci numbers
     * @param args 
     */
    public static int nthFibonacci(int n){
        if(n==1 || n==2){
            return 1;
        }
        return nthFibonacci(n-1)+nthFibonacci(n-2);
    }
    public static void main(String[] args) {
        if(intNSum(10) == 55){
            System.out.println("inrNum Test 1 pass");
        }
        if(intNProduct(5) == 120){
            System.out.println("intNProduct Test 1 pass");
        }
        printNum(10);
        //1 2 3 4 5 6 7 8 9 10
        System.out.println();
        if(nthFibonacci(12)==144){
            System.out.println("nthFibonacci test 1 pass");
        }
    }
    
}
