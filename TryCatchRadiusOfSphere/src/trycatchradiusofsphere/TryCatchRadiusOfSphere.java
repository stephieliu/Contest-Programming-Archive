/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatchradiusofsphere;

/**
 *
 * @author steph
 */
import java.util.*;
public class TryCatchRadiusOfSphere {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int r = 0;
        String firstRead;
        double v;
        boolean flag = false;
        
        while(true && !flag)
        {
            System.out.println("Radius: ");
            firstRead = sc.nextLine();
            try{
                r = Integer.parseInt(firstRead);
                if(r > 0) flag = true;
            }
            catch (Exception e){
                System.out.println("Not a valid radius u dum dum >:(");
            }
        }
        
        v = (4.0/3)*Math.PI*(Math.pow(r, 3));
        System.out.println(v);
        
        sc.close();
    }
    
}
