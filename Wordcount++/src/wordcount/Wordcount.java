/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordcount;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Wordcount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i = 1; i <=5; i++){
            String n = input.nextLine().replaceAll("[^a-zA-Z]", " ");
            //the replaceAll means that all the characters that are not
            //a-z or A-Z will be replaced by spaces
            String words[] = n.split(" ");
            //gives you an arrays of words split by spaces
            int c = 0;
            for(int j = 0; j < words.length; j++){
                if(words[j].length() >= 4){
                    c++;
                }
            }
            System.out.println(c);
        }
    }
    
}
