/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dealornodealcalculator;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class DealOrNoDealCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 100+500+1000+5000+10000+25000+50000+100000+500000+1000000;
        for(int i  = 0; i<n; i++){
            int cases = input.nextInt();
            switch (cases) {
                case 1:
                    sum-=100;
                    break;
                case 2:
                    sum-=500;
                    break;
                case 3:
                    sum-=1000;
                    break;
                case 4:
                    sum-=5000;
                    break;
                case 5:
                    sum-=10000;
                    break;
                case 6:
                    sum-=25000;
                    break;
                case 7:
                    sum-=50000;
                    break;
                case 8:
                    sum-=100000;
                    break;
                case 9:
                    sum-=500000;
                    break;
                default:
                    sum-=1000000;
                    break;
            }
        }
        int banker = input.nextInt();
        int avg = sum/(10-n);
        if(banker>=avg){
            System.out.println("deal");
        }
        else{
            System.out.println("no deal");
        }
    }
    
}
