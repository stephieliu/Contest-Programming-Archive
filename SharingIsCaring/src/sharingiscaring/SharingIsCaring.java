/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharingiscaring;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class SharingIsCaring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int [] share = new int [M];
        String [] titles =  new String [M];
        for(int i = 0; i<M; i++){
            int temp = input.nextInt();
            share[i] = input.nextInt();
            String t = input.nextLine();
            titles[i] = input.nextLine();
        }
        int me = input.nextInt();
        for(int i = 0; i<M; i++){
            if(share[i]==me){
                System.out.println(titles[i]);
            }
        }
    }
    
}
