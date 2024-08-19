/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s1class6inclassassignments;

/**
 *
 * @author Stephie
 */
import java.util.*;
import java.math.*;
public class S1Class6InClassAssignments {

    public static boolean isPrime(int [] intArr, int s, int e){
        //return true if sum of numbers between index s and e is prime
        int sum = 0;
        for(int i = s; i<=e; i++){
            sum+=intArr[i];
        }
        int nFactors = 0;
        for(int i = 1; i<=(int)(Math.sqrt(sum)); i++){
            if(sum%i==0) nFactors++;
        }
        return nFactors == 1;
    }
    public static void homework(String[] args){
        //the homework question solution for week 5, primed sequences
        Scanner input = new Scanner(System.in);
        int nTest = input.nextInt();//number of test cases
        
        for(int i = 0; i<nTest; i++){
        int size = input.nextInt();//the size of the sequence
        int [] intArr = new int[size];
        for(int j = 0; j<size; j++){
            intArr[j] = input.nextInt();
        }
        int shortest = Integer.MAX_VALUE;//the lngth of the sequence
        int sIndex = 0;
        int eIndex = 0;
        //check all the possible subsequences
        for(int a = 0; a<size; a++){
            for(int b = a+1; b<size; b++){
                if(isPrime(intArr,a,b)){
                    //check for the length
                    if(shortest>(b-a+1)){
                        shortest = b-a+1;
                        sIndex = a;
                        eIndex = b;
                    }
                }
            }
        }
            if(shortest!=Integer.MAX_VALUE){
                System.out.println("Shortest primed subsequence is length "+shortest+": ");
                for(int c = sIndex; c<=eIndex; c++){
                    System.out.print(intArr[c]+"\t");
                }
                System.out.println("");
            }
            else{
                System.out.println("This sequence is anti-primed.");
            }
        }
    }
    public static void BigIntegers(String[] args){
        Scanner input = new Scanner(System.in);
        //declaring a big integer
        BigInteger b1 = new BigInteger("2");
        BigInteger b2 = new BigInteger("4");
        //adding two big integers
        BigInteger b3 = b1.add(b2);
        System.out.println(b3);
        //subtraction
        BigInteger b4 = b1.subtract(b2);
        System.out.println(b4);
        //Multiplication
        System.out.println(b1.multiply(b2));
        //Modulus
        System.out.println(b2.mod(b1));
        //remainders = returns a big integer array where the first 
        //element is quotient and next in remainder
        System.out.println(b2.divideAndRemainder(b1)[0]);
        System.out.println(b2.divideAndRemainder(b1)[1]);
        //Reading a string from the user and converting back into big integer
        String str1 = input.next();
        BigInteger b5 = new BigInteger(str1.toString());
        //string.tostring will turn the string into a string object
        //printing the number of digits in a bigInteger
        System.out.println(b5.toString().length());
        //printing each digit in b5
        int num = 123456;
        /**
         * Write a small program that will print the digits
         * from num in separate lines
         */
        while(num!=0){
            System.out.println(num%10);
            num = num/10;
        }
        BigInteger numb = new BigInteger("123456789");
        BigInteger div = new BigInteger("10");
        while(! numb.toString().equals("0")){
            System.out.println(numb.mod(div));
            numb = numb.divideAndRemainder(div)[0];
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Divisibility by 11 PEG problem
        BigInteger r = new BigInteger("11");
        BigInteger num;
            String str1 = input.next();
            num = new BigInteger(str1.toString());
            while(num!=r){
                BigInteger div1 = new BigInteger("10");
                BigInteger udig = num.mod(div1);
                num = num.divideAndRemainder(div1)[0];
                num = num.subtract(udig);
                System.out.println(num);
            }
        if(num.mod(r).toString()=="0"){
            System.out.println("The number "+str1+" is divisible by 11");
        }
        else{
            System.out.println("The number "+str1+"is not divisible by 11");
        }
    }
    
}
