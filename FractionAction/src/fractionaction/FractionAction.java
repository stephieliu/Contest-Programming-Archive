/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractionaction;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class FractionAction {

    public static int GCF(int a, int b) {
        if(b == 0){
            return a;
        } 
        else{
            return (GCF(b, a % b));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = GCF(a,b);
        if(a/b <= 0){
            System.out.print(a/c + "/" + b/c);
        }
        else if(a == 0){
            System.out.print(0);
        }
        else if(b == 0){
            System.out.print("ERROR");
        }
        else{
            if(a/c <= 0 || b/c <= 0){
                System.out.print(a + "/" + b);
            }        
            else{
                long d = a/b;
                if(a % b == 0){//Whole Numbers
                    if(b % ((a-b)/c) == 0){
                        System.out.print(a/b + (a-b)/c + b/c);
                    }
                    else{
                        System.out.print(a/b);
                    }
                }
                else{//Mixed
                    if(a-b / c == (int)(a-b)/c && b/c == (int)b-c){
                        System.out.print(a/b + " " + (a-((a/b)*b)) + "/" + b/c);
                    }
                    if(a-((a/b)*b) != 0){
                        System.out.print(a/b + " " + (a-((a/b)*b))/c + "/" + b/c); 
                    }
                    else if((a-((a/b)*b)) == (int)(a-((a/b)*b))){
                        System.out.print(a/b + " " + (a-((a/b)*b))/c + "/" + b/c);
                    }
                    if(a-((a/b)*b) == 0){
                        System.out.print(a/b);
                    }
                    
                }
            }
        }
        System.out.println();
    }
}
