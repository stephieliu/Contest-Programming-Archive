/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passorfail;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class PassOrFail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        for(int i = 0; i<10; i++){
            double Wt = input.nextInt();//weights
            double Wa = input.nextInt();//weights
            double Wp = input.nextInt();//weights
            double Wq = input.nextInt();//weights
            int N = input.nextInt();//number of students
            int count = 0;
            for(int j = 0; j<N; j++){
                double Ti = input.nextInt();
                double T = Ti*(Wt/100);
                double Ai = input.nextInt();
                double A = Ai*(Wa/100);
                double Pi = input.nextInt();
                double P = Pi*(Wp/100);
                double Qi = input.nextInt();
                double Q = Qi*(Wq/100);
                double sum = 0;
                sum = T+A+P+Q;
                if(sum>50){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    
}
