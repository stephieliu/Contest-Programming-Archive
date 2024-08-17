/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmksolutions;

/**
 *
 * @author Stephie
 */
import java.util.*;
//maximum distance
public class HmkSolutions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nTest = input.nextInt();
        for(int i = 0; i<nTest; i++){
            int nSize = input.nextInt();
            int [] intArr1 = new int [nSize];
            int [] intArr2= new int [nSize];
            for(int j = 0; j<nSize; j++){
                intArr1[j] = input.nextInt();
            }
            for(int j = 0; j<nSize; j++){
                intArr2[j] = input.nextInt();
            }
            int MaxValue = 0;
            for(int a = 0; a<nSize; a++){
                for(int b= 0; b<nSize; b++){
                    if(b>=a && (intArr2[b]>=intArr1[a])){
                        if(b-a>MaxValue)MaxValue = b-a;
                    }
                }
            }
            System.out.println(MaxValue);
        }
    }
    
}
