/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coldcompress;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class ColdCompress {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        String temp = input.nextLine();
        for(int i= 0; i<N; i++){
            String line = input.nextLine();
            char compare = line.charAt(0);
            int count = 1;
            for(int j = 1; j<line.length(); j++){
                if(line.charAt(j)==compare){
                    count++;
                    if(line.length()-1==j){
                        System.out.print(count+" "+compare+" ");
                    }
                }
                else if(line.charAt(j)!=compare || line.length()-1==j){
                    if(line.length()-1==j){
                        System.out.print(count+" "+compare+" ");
                        System.out.print(1+" "+line.charAt(j)+" ");
                    }
                    else{
                        System.out.print(count+" "+compare+" ");
                        compare = line.charAt(j);
                        count = 1;
                    }
                }
            }
            System.out.println();
        }
    }
    
}
