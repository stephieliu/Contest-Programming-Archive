/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package email;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Stephie
 */
public class ReadingFiles {
    public static void main(String[] args){
        try{
           FileReader fr = new FileReader("example.txt");
           BufferedReader br = new BufferedReader (fr);
           String line = br.readLine();
           while(line!=null){
                System.out.println("line "+line);
                String [] numbers = line.split(" ");
                
               int x = Integer.parseInt(line);//for single line
               System.out.println(x*2);//for single line

                line = br.readLine();
           }
        }
        catch(IOException e){
            
        }
    }
}
