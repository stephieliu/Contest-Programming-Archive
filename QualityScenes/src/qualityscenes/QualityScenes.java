/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qualityscenes;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class QualityScenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        if(b<=c){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }        
    }
    
}
