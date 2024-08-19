/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentences;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Sentences {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int x = 0; x<n; x++){
            int subjects = input.nextInt();
            int verbs = input.nextInt();
            int objects = input.nextInt();
            String temp = input.nextLine();
            String [] subj =  new String [subjects];
            String [] verb = new String [verbs];
            String [] obj = new String [objects];
            for(int i = 0; i<subjects; i++){
                subj[i] = input.nextLine();
            }
            for(int i = 0; i<verbs; i++){
                verb[i] = input.nextLine();
            }
            for(int i = 0; i<objects; i++){
                obj[i] = input.nextLine();
            }
            for(int i = 0; i<subjects; i++){
                for(int j = 0; j<verbs; j++){
                    for(int k = 0; k<objects; k++){
                        System.out.println(subj[i]+" "+verb[j]+" "+
                                obj[k]+".");
                    }
                }
            }
        }
    }
    
}
