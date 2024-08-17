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
public class ReadingFiles {
    public static void main(String[] args){
        try{
           FileReader fr = new FileReader("example.txt");
           BufferedReader br = new BufferedReader (fr);
           String line = br.readLine();
           while(line!=null){
                System.out.println("line "+line);
                String [] numbers = line.split(" ");
                System.out.println(Integer.parseInt(numbers[0])*2);//for
                //two or more rows
                System.out.println(Integer.parseInt(numbers[1])*2);//for 
                //two or more rows
//               int x = Integer.parseInt(line);//for single line
//               System.out.println(x*2);//for single line

                line = br.readLine();
           }
        }
        catch(IOException e){
            
        }
    }
}
