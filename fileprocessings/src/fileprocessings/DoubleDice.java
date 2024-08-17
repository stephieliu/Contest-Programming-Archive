/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileprocessings;

/**
 *
 * @author Stephie
 */
import java.io.*;
public class DoubleDice {
    public static void main(String [] args){
        try{
            int count = 0;
            for(int j = 1; j<=5; j++){
                FileReader fr = new FileReader("j3."+j+".in");
                BufferedReader br = new BufferedReader(fr);
                FileReader fr1 = new FileReader("j3."+j+".out");
                BufferedReader br1 = new BufferedReader(fr1);
                int A = 100;
                int D = 100;
                String line1 = br.readLine();
                int nRound = Integer.parseInt(line1);
                for(int i =0; i<nRound; i++){
                    String line = br.readLine();
                    String[]scores = line.split(" ");
                    int ap = Integer.parseInt(scores[0]);
                    int dp = Integer.parseInt(scores[1]);
                    //if reading double: Double.parseDouble();
                }
            }
        }
        catch(IOException e){
            
        }
    }
}
