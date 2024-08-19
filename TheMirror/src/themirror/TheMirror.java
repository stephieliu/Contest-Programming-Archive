/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themirror;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class TheMirror {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        boolean flag = false;
        int prime = 0;
        Integer [][] mirror = new Integer [2][N];
        for(int i = 0; i<2; i++){
            for(int j = 0; j<N; j++){
                mirror[i][j] = input.nextInt();
            }
        }
        for(int i = 0; i<2; i++){
            for(int j = 0; j<N; j++){
                while(mirror[i][0]<mirror[i][1]){
                    flag = false;
                    for(int x = 2; x<=mirror[i][0]/2; i++){
                        if(mirror[i][0]%x==0){
                            flag = true;
                            break;
                        }
                    }
                    if(!flag){
                        prime++;
                    }
                }
                System.out.println(prime);
            }
        }
    }
    
}
