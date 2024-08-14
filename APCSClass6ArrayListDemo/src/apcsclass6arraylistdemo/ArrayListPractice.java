/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcsclass6arraylistdemo;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class ArrayListPractice {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> strList1 = new ArrayList<String>();
        /**
         * Read 10 string input from the user and add into the list
         * remove each stirng that has length greater than 4 in strList1
         */
        
        for(int i = 0; i<10; i++){
            strList1.add(input.next());
        }
        System.out.println(strList1);
        for(int i = strList1.size()-1; i>=0; i--){
            if(strList1.get(i).length()>=4){
                strList1.remove(i);
                i++;
            }
        }
        System.out.println(strList1);
//the
//tiger
//tiger
//banana
//elephant
//rat
//mango
//pineapple
//cow
//rat
    }
}
