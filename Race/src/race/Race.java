/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package race;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Race {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int X = input.nextInt();
        int Y = input.nextInt();
        int Z = input.nextInt();
        //Chebyshev the creeper
        int a = A;
        int b = B;
        int c = C;
        int cc = 0;
        while(1==1){
            if(a!=X){
                a++;
                cc++;
            }
            if(b!=Y){
                b++;
                cc++;
            }
            if(c!=Z){
                c++;
                cc++;
            }
            if(a==X&&b==Y&&c==Z){
                break;
            }
        }
        System.out.println(cc);
        //Euclidean the Enderman
        a = A;
        b = B;
        c = C;
        
    }
    
}
