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
public class WritingFiles {
    public static void main(String [] args){
        try{
            String filename = "e";
            for(int j = 0; j<1000000000; j++){
            filename = filename+j+".doc";
            FileWriter fr = new FileWriter(filename);
            PrintWriter pw = new PrintWriter(fr);
            for(int i = 0; i<10; i++){
                pw.println("Hello");
                pw.println("World");
            }
            pw.close();
            }
        }
        catch(IOException e){
            
        }
    }
}
