package fileprocessings;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stephie
 */
import java.io.*;
public class TriTimes {
    public static void main(String [] args){
        try{
            int count = 0;
            for(int j = 1; j<=6; j++){
                FileReader fr = new FileReader("j1."+j+".in");
                BufferedReader br = new BufferedReader(fr);
                FileReader fr1 = new FileReader("j1."+j+".out");
                BufferedReader br1 = new BufferedReader(fr1);
                String triangleTime = "";
                String line = br.readLine();
                int intA1 = Integer.parseInt(line);
                line = br.readLine();
                int intA2 = Integer.parseInt(line);
                line = br.readLine();
                int intA3 = Integer.parseInt(line);
                if(intA1+intA2+intA3 == 180){
                    if(intA1 == intA2&&intA2==intA3){
                        triangleTime = "equilateral";
                    }
                    else if(intA1==intA2 || intA2==intA3||intA3==intA1){
                        triangleTime="isoceles";
                    }
                    else{
                        triangleTime = "Scalene";
                    }
                }
                else{
                    triangleTime = "ERROR";
                }
                String line2 = br1.readLine();
                if(line2.equals(triangleTime))count++;
                
            }
            System.out.println("Your score is "+count);
        }
        catch(IOException e){
            
        }
    }
}
