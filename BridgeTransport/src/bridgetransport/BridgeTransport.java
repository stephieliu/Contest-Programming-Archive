/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgetransport;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class BridgeTransport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int W = input.nextInt();
        int N = input.nextInt();
        int [] cars = new int [N];
        //bruce's method
        int sum = 0;
        for(int i = 0; i<N; i++){
            cars[i] = input.nextInt();
            if(i<4){
                sum+=cars[i];
            }
            else {
                sum+=cars[i] - cars[i-4];
            }
            if(sum>W){
                System.out.println(i);
                return;
            }
        }
        System.out.println(N);
        
        //my method
//        int count = Integer.MIN_VALUE;
//        for(int i = 0; i<N; i++){
//            cars[i] = input.nextInt();
//        }
//        int i = 0;
//        for(i = 0; i<N; i++){
//            int sum = 0;
//            boolean greater = false;
//            for(int j = 0; j<4; j++){
//                if(count<i+j){
//                    count = i+j;
//                }
//                if(i+j<N){
//                    sum+=cars[i+j];
//                    if(sum>W){
//                        greater = true;
//                        break;
//                    }
//                }
//                else{
//                    greater = true;
//                    break;
//                }
//            }
//            if(greater == true){
//                break;
//            }
//        }
//        if(i+1 == N){
//            System.out.println(N);
//        }
//        else{
//            System.out.println(count);
//        }
    }
    
}
