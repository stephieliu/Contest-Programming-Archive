/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lastindexofone;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class LastIndexOfOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        int index = 0;
        for(int i = 0; i<T; i++){
            String str = input.next();
            index = str.lastIndexOf("1");
            if(index!=0){
                System.out.println(index);
            }
            else{
                System.out.println("-1");
            }
        }
    }   
}
