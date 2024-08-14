/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseballstats;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class BaseballStats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String SeasonName = input.nextLine();
        String dividers = "====================";
        String [][] data = new String [8][10];
        for(int i = 0; i<8; i++){
            for(int j = 0; j<10; j++){
                data[i][j] = input.nextLine();
            }
        }
        String [] baavg = new String [10];
        String [] sa =  new String [10];
        String names = "";
        for(int i = 0; i<1; i++){
            for(int j = 0; j<10; j++){
                names = data[i][j];
            }
        }
        for(int i = 1; i<8; i++){
            for(int j = 0; j<10; j++){
                baavg[j] = data[i][0];
            }
        }
        for(int i = 1; i<8; i++){
            for(int j = 0; j<10; j++){
                sa[j] = data[0][j];
            }
        }
        
        System.out.println(SeasonName);
        System.out.println(dividers);
        System.out.println(names +": "+ baavg+" "+ sa+"\n"+dividers+"\n"
                +"Big 10 Av: "+baavg[9]);
    }
    
}
