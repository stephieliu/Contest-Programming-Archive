/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuttinglogs;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class CuttingLogs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int L = input.nextInt();//original length of the log
        String Log = input.next().replaceAll("X"," ");//represents the original log
        String [] nondefect = Log.split("");
        String log = new String();
        int count = 0;
        for(int i = 0; i<nondefect.length;i++){
            if("O".equals(nondefect[i])){
                log = log+"O";
            }
            else if(" ".equals(nondefect[i])&&i!=0){
                count = count+2;
                log = log+"\n";
            }
        }
        System.out.println(count);
        System.out.println(log);
    }
    
}
