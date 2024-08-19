/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mjehuric;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Mjehuric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] pieces = new int [5];
        int [] desired = {1, 2, 3, 4, 5};
        for(int i = 0; i<5; i++){
            pieces[i] = input.nextInt();
        }
        for(int i = 1;;i++){
            int temp=0;
            if(pieces[0]>pieces[1] && pieces != desired && i%4 ==1){
                temp = pieces[0];
                pieces[0] = pieces[1];
                pieces[1] = temp;
                System.out.println(Arrays.toString(pieces).
                        replaceAll("\\[","").replaceAll("\\]","")
                        .replaceAll(",", " "));
            }
            else if(pieces[1]>pieces[2] && pieces != desired && i%4 == 2){
                temp = pieces[1];
                pieces[1] = pieces[2];
                pieces[2] = temp;
                System.out.println(Arrays.toString(pieces).
                        replaceAll("\\[","").replaceAll("\\]","")
                        .replaceAll(",", " "));
            }
            else if(pieces[2]>pieces[3] && pieces != desired && i% 4 == 3){
                temp = pieces[2];
                pieces[2] = pieces[3];
                pieces[3] = temp;
                System.out.println(Arrays.toString(pieces).
                        replaceAll("\\[","").replaceAll("\\]","")
                        .replaceAll(",", " "));
            }
            else if(pieces[3]>pieces[4] && pieces != desired && i%4 == 0){
                temp = pieces[3];
                pieces[3] = pieces[4];
                pieces[4] = temp;
                System.out.println(Arrays.toString(pieces).
                        replaceAll("\\[","").replaceAll("\\]","")
                        .replaceAll(",", " "));
            }
            if(Arrays.equals(pieces, desired)){
                break;
            }
        }
    }
    
}
