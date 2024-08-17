/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclasspracticeccc2c2;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class InClassPracticeCCC2C2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        Stack<String>strDir = new Stack<String>();
        strDir.push("/");
        int nCommand = input.nextInt();//Number of Commands
        String strCommand = input.nextLine();
        for(int i = 0; i<nCommand; i++){
            strCommand = input.nextLine();
            if(!strDir.empty()&&strCommand.equals("pwd")){
                System.out.println(strDir.pop());
                
            }
            else if(strCommand.indexOf("cd")>=0){
                strDir.push(strCommand.substring(3));
                
            }
        }
    }
    
}
