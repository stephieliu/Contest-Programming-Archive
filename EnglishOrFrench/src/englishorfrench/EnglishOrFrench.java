/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package englishorfrench;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class EnglishOrFrench {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int N = input.nextInt();
        String[] words = new String[N];
        String a = input.nextLine();
        //Skip line to counter .nextLine, which will skip first line of input
        int countS=0;
        int countT=0;
        for(int i = 0; i < N; i++){
            words[i] = input.nextLine();
        }
        for(int j = 0; j < N; j++){
            for(int i = 0; i < words[j].length(); i++){
                if(words[j].charAt(i)=='S'||  words[j].charAt(i) == 's'){
                    countS++;
                }
                else if(words[j].charAt(i)=='T'||  words[j].charAt(i) == 't'){
                    countT++;
                }
            }
        }
        if(countT>countS){
            System.out.println("English");
        }
        else{
            System.out.println("French");
        }
    }
    
}
