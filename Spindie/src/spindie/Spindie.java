 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spindie;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Spindie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        for(int counter = 0; counter<10; counter++){
            Random rand = new Random();
            int N = input.nextInt();
            int [] S = new int [N];
            for(int i = 0; i<N; i++){
                S[i] = input.nextInt();
            }
            int [] T = new int [5];
            for(int i = 0; i<5; i++){
                T[i] = input.nextInt();
            }
            String [] Result = new String [5];
            for(int i=0; i<5; i++){
                Result[i] = "F";
            }
            
            for(int i = 0; i<N-1; i++){
                int n = rand.nextInt(6)+1;
                int ans;
                if(n<6){
                    ans = S[i]+S[i+1];
                }
                else{
                    ans = S[i]*S[i+1];
                }
                for(int j = 0; j<5; j++){
                    if(ans == T[j]){
                        Result[j] = "T";
                        break;
                    }
                }
            }
            for(int i=0; i<5; i++){
                System.out.print(Result[i]);
                
            }
            System.out.println();
        }
   }
    
}
