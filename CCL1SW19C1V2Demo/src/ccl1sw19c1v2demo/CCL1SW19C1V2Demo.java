/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccl1sw19c1v2demo;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class CCL1SW19C1V2Demo {

    /**
     * @param str1 is the original string
     * @param str2 is the string to be removed in str1
     * @return every str1 that is not str2
     */
    public static String removeAll(String str1, String str2){
        //find the index of str2 in str1
        //if the index >=0
        //create a substring of str1 by removing the str2
        //assign that substring to str1
        //continue this rocess as long as the index>=0
        //(need a while loop)
        int index = str1.indexOf(str2);
        while(index >=0){
            str1 = str1.substring(0,index)+str1.substring(index+str2.length());
            index = str1.indexOf(str2);
        }
        return str1;
    }
    //in str1 replace every occurence of str2 by str3
    public static String replaceAll(String str1, String str2, String str3){
        int index = str1.indexOf(str2);
        while(index >=0){
            str1 = str1.substring(0,index)+str3+str1.substring(index+str2.length());
            index = str1.indexOf(str2);
        }
        return str1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = "The red cat sat on the mat";
        System.out.println(removeAll(str1,"the"));
        //red cat sat on mat
        System.out.println(replaceAll(str1, "the", "tiger"));
        //tiger red cat sat on tiger mat
    }
    
}
