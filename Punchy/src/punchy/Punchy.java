/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punchy;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Punchy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(;;){
            int instruction = input.nextInt();
            String var = input.next();
            String name = input.next();
            int A = 0;
            int B =0;
            if(instruction == 7){
                break;
            }
            else if(instruction == 1){
                if ("A".equals(var)){
                    A = Integer.parseInt(name);
                }
                else{
                    B = Integer.parseInt(name);
                }
            }
            else if(instruction == 2){
                if("A".equals(var)){
                    System.out.println(A);
                }
                else{
                    System.out.println(B);
                }
            }
            else if(instruction == 3){
                if("A".equals(var)){
                    if("A".equals(name)){
                        A = A+A;
                    }
                    else if("B".equals(name)){
                        A = A+B;
                    }
                }
                if("B".equals(var)){
                    if("B".equals(name)){
                        B = B+B;
                    }
                    else if("A".equals(name)){
                        B = B+A;
                    }
                }
            }
            else if(instruction == 4){
                if("A".equals(var)){
                    if("A".equals(name)){
                        A = A*A;
                    }
                    else if("B".equals(name)){
                        A = A*B;
                    }
                }
                if("B".equals(var)){
                    if("B".equals(name)){
                        B = B*B;
                    }
                    else if("A".equals(name)){
                        B = B*A;
                    }
                }
            }
            else if(instruction == 5){
                if("A".equals(var)){
                    if("A".equals(name)){
                        A = A-A;
                    }
                    else if("B".equals(name)){
                        A = A-B;
                    }
                }
                if("B".equals(var)){
                    if("B".equals(name)){
                        B = B-B;
                    }
                    else if("A".equals(name)){
                        B = B-A;
                    }
                }
            }
            else if(instruction == 5){
                if("A".equals(var)){
                    if("A".equals(name)){
                        A = A/A;
                    }
                    else if("B".equals(name)){
                        A = A/B;
                    }
                }
                if("B".equals(var)){
                    if("B".equals(name)){
                        B = B/B;
                    }
                    else if("A".equals(name)){
                        B = B/A;
                    }
                }
            }
        }
    }
    
}
