/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcsclass11hmkquestion14;

/**
 *
 * @author steph
 */
public class APCSClass11HMKQuestion14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        System.out.println(removeStrings("Hellobellomellow","ello"));
    }
    public static String removeStrings(String a, String b){
        if(a.indexOf(b)==-1){
            return b;
        }
        else{
            int x = b.indexOf(a);
            String a1 = "";
            a1 = a.substring(x+b.length());
            return removeStrings(a1, b);
        }
    }
}
