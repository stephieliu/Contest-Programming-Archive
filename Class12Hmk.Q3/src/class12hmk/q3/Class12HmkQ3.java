/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class12hmk.q3;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
public class Class12HmkQ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        prime();
    }
    public static void prime(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        
        if(number == 1){
            System.out.println("1 is neither prime nor composite.\n");
        }
        else{
            int factorCheck = 2;
            boolean isPrime = true;
            while (factorCheck<number/2){
                if(number% factorCheck == 0){
                    isPrime = false;
                    break;
                }
                factorCheck++;
            }
            if(isPrime){
                System.out.print(number+" is a prime number.\n");
            }
            else{
                System.out.print(number+" is a composite number.\n");
            }
        }
        System.out.print("Enter a maximum number: ");
        int div = input.nextInt();
        int i = 1;
        while(i <= div){
            if(div <= 1){
                System.out.print("There are no prime numbers.");
                break;
            }
            else{
                int factorCheck = 2;
                boolean isPrime = true;
                while (factorCheck < i){
                    if(i % factorCheck == 0){
                        isPrime = false;
                    }
                    factorCheck++;
                }
                if (isPrime&&i!=1){
                    System.out.println(i);
                }
                else{
                    System.out.print("");
                }
                i++;
            }
        }        
    }
}
