/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplechoice;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class MultipleChoice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int C = 0;
        String[] StudentResponse = new String[N];
        for(int i = 0; i<N; i++){
            StudentResponse[i] = input.next();
        }
        String[] Correct = new String[N];
        for(int i = 0 ; i<N; i++){
            Correct[i] = input.next();
            if(Correct[i].equals(StudentResponse[i])){
                C++;
            }
        }
        System.out.println(C);
    }
    
}
