/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copycatsms;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class CopycatSMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i<5; i++){
            String S = input.nextLine();
            String str = S;
            int length = S.length();
            if(S.length()==1){
                System.out.println(S+str);
            }
            else{
                for(int j = 0, k = length-1; j<length; j++, k--){
                    if(S.charAt(k)==str.charAt(j)){
                        str = str.substring(j+1, length);
                    }
                }
                System.out.println(S+str);
            }
        }
    }
    
}
