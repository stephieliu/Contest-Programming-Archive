/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ispeaktxtmsg;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class ISpeakTXTMSG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String txt = "";
        Rand:
        while(true) {
            txt = input.nextLine();
            if (null == txt) {
                System.out.println(txt);
            } else {
                switch (txt) {
                    case "CU":
                        System.out.println("see you");
                        break;
                    case ":-)":
                        System.out.println("I'm happy");
                        break;
                    case ":-(":
                        System.out.println("I'm unhappy");
                        break;
                    case ";-)":
                        System.out.println("wink");
                        break;
                    case ":-p":
                        System.out.println("stick out my tongue");
                        break;
                    case "(~.~)":
                        System.out.println("sleepy");
                        break;
                    case "TA":
                        System.out.println("totally awesome");
                        break;
                    case "CCC":
                        System.out.println("Canadian Computing Competition                 ");
                        break;
                    case "CUZ":
                        System.out.println("because");
                        break;
                    case "TY":
                        System.out.println("thank-you");
                        break;
                    case "YW":
                        System.out.println("you're welcome");
                        break;
                    case "TTYL":
                        System.out.println("talk to you later");
                        break Rand;
                    default:
                        System.out.println(txt);
                        break;
                }
            }
        }
    }
    
}
