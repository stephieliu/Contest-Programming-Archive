/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darcy_liu;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Darcy_Liu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S = input.next().toLowerCase();
        if("darcy_liu".equals(S)){
            System.out.println("real");
        }
        else{
            boolean t = true;
            int count = 0;
            for(int i = 5; i<S.length()-3; i++){
                if(S.charAt(i)!='_'){
                    System.out.println("other user");
                    t = false;
                    break;
                }
                else{
                    count++;
                }
            }
            if(t == true&&count>0&&S.indexOf("darcy")==0&&S.indexOf("liu")==S.length()-3){
                System.out.println("fake");
            }
        }
    }
    
}
