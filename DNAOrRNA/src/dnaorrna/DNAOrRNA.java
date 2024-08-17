/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnaorrna;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class DNAOrRNA {

    /**
     * @param args the command line arguments
     */
    static boolean Acceptable(char x){
        return x=='A'||x=='G'||x=='C'||x=='U'||x=='T';
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N =input.nextInt();
        String bases = input.next();
        for(int i = 0; i<N; i++){
            if(!Acceptable(bases.charAt(i))){
                System.out.println("neither");
                return;
            }
        }
        int intT = 0;//number of T
        int intU = 0;//number of U
        for(int i = 0; i<N; i++){
            if(bases.charAt(i)=='T'){
                intT++;
            }
            else if(bases.charAt(i)=='U'){
                intU++;
            }
        }
        if(intT==0 && intT==intU){
            System.out.println("both");
        }
        else if(intT==0 && intU>0){
            System.out.println("RNA");
        }
        else if(intU==0 && intT>0){
            System.out.println("DNA");
        }
        else if(intU>0 && intT>0){
            System.out.println("neither");
        }
    }
    
}
