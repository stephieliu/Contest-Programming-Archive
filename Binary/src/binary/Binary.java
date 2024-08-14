/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Binary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for(int i = 0; i<N; i++){
            String binary = Integer.toBinaryString(input.nextInt());
            if(binary.length()==4){
                System.out.println(binary);
            }
            else if(binary.length()<4){
                for(int j = 0; j<4-binary.length(); j++){
                    System.out.print("0");
                }
                System.out.print(binary+"\n");
            }
            else{
                int count = 0;
                for(int j = binary.length()-1; j>=0; j--){
                    if(count%4!=0){
                        
                        count++;
                    }
                    else{
                        if(j!=0){
                        System.out.print(" "+binary.charAt(j));
                        count++;
                        }
                        else{
                            System.out.print(binary.charAt(j));
                        }
                    }
                }
            }
        }
    }
    
}
