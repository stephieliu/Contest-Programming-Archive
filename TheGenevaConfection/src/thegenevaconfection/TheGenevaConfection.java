/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thegenevaconfection;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class TheGenevaConfection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Stack MntTop = new Stack();
        Stack Branch = new Stack();
        int T = input.nextInt();
        int N = 0;
        char[] Lake = new char[T];
        int cars = 0;
        boolean y = true;
        for(int i = 0; i < T; i++){
            N = input.nextInt();
            cars = 1;
            y = true;
            for(int j = 0; j < N; j++){
                MntTop.push(input.nextInt());
            }
            while(y && cars <= N){
                if(MntTop.size() > 0 && cars == (int)(MntTop.peek())){
                    MntTop.pop();
                    cars++;
                }
                else if(Branch.size() > 0 && cars == (int)(Branch.peek())){
                    Branch.pop();
                    cars++;
                }
                else if(MntTop.size() > 0){
                    Branch.push(MntTop.pop());
                }
                else{
                    y = false;
                }
            }
            if(y){
                Lake[i] = 'Y';
            }
            else{
                Lake[i] = 'N';
            }
        }
        System.out.println(Arrays.toString(Lake).replace("]", "").
                replace("[", "").replace(", ", "\n"));
//        int T = input.nextInt();//number of different tests
//        for(int i =0; i<T; i++){
//            int count = 1;
//            int N = input.nextInt();
//            Stack <Integer> MntTop = new Stack<>();
//            Stack <Integer> Branch = new Stack<>();
//            Stack <Integer> Lake = new Stack<>();
//            for(int j =0; j<N; j++){
//                MntTop.push(input.nextInt());//store all the original
//                //carts
//            }
//            while(!MntTop.isEmpty()){
//                if(MntTop.peek()==count){
//                   Lake.push(count);
//                   MntTop.pop();
//                   count++;
//                }
//                else{
//                   Branch.push(MntTop.pop());
//                } 
//            }
//            if(Lake.size()==N){
//                System.out.println("Y");
//            }
//            else{
//                while(!Branch.isEmpty()){
//                    if(Branch.peek()==count){
//                        Branch.pop();
//                        Lake.push(count);
//                        count++;
//                    }
//                    else{
//                       System.out.println("N"); 
//                       break;
//                    }
//                }
//                if(Lake.size()==N){
//                    System.out.println("Y");
//                }                
//            }
//        }
    }
    
}
