/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package returninghome;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class ReturningHome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack <String> dir = new Stack();
        Stack <String> str = new Stack();
        while(true){
            String s = input.next();
            dir.push(s);
            s = input.next();
            if(!"SCHOOL".equals(s)){
                str.push(s);
            }
            else{
                break;
            }
        }
        for(;;){
            String d = dir.pop();
            if(d.equals("R")){
                System.out.print("Turn LEFT ");
            }
            else{
                System.out.print("Turn RIGHT ");
            }
            if(!str.isEmpty()){
                String s = str.pop();
                System.out.print("onto "+s+" street.\n");
            }
            else{
                System.out.print("into your HOME.");
                break;
            }
        }
    }
}
