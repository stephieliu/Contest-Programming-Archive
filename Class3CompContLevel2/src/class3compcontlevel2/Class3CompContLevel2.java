/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class3compcontlevel2;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Class3CompContLevel2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //using if(==) with strings returns whether or not they point to the same object
        //using if(.equals) with strings returns whether the value is the same
        
        //String methods:
        
        //compareTo : compares two strings
        String str1 = "abcdef", str2 = "bcd";
        str1.compareTo(str2);
        //if it returns - numbers; string 1 is less than string 2
        //if positive, string 2 is less than string 1
        //if zero, string 1 is equal to string 2
        //ASCII values are compared
        //EXAMPLE USING COMPARETO:
        String s[] = {"aab", "aaaa", "c", "ad", "AAB", "aac", "D"};
        Arrays.sort(s);//you can also just loop through and compareTo but
        //arrays.sort is faster
        System.out.println(Arrays.toString(s));
        
        //substring : extracts the substring of a string
        //Check practicewithstrings
        
        //Trim : removes the leading and trailing spaces
        str1.trim();
        
        //valueOf : converts a given primitive data value to a string
        String.valueOf(123.4565);
        
        //Integer.toString: converts an integer into a String
        int a = 10;
        String x = Integer.toString(a);
        //integer.parseInt: comverts a string to an integer
        Integer.parseInt(str1);
        
        //startsWith: returns true if a string starts with a specified prefix string
        str1.startsWith(str2);
        
        //endsWith: returns true if a stirng ends with a specified suffix string
        str1.endsWith(str2);
        
        //PATTERN EXAMPLE
        //first digit must be five; second should be 1, 2 or 3; third digit is
        //any digit between 1 and seven inclusive
        //This would be 5[1 2 3][1-7]
        //It is a regular expression
        //brakets [] represnt choices
        //asterisk * means zero or more occurrences
        //plus + means one or more occurrences
        //har ^ means negation - exclusive; don't choose
        //hyphen - means a range
        //parenthesis () ans veritical bar | mean you can choose multiple digits
        //to complete the pattern
        
        //replaceAll - replaces all the occurrences of a substring that matches a given regular expression with a 
        //given string
        //It doesn't affect the original string
        //Therefore you must store it in another string
        String str = "i love java and java hates me!";
        String t = str.replaceAll("[aeiou]", "@");
        System.out.println(t);
        //this program means that all the aeiou in the sentence is replaced by
        //@ sign
        
        //string object is immutable
        //you can't change the original string, you need to store the character
        //and other changes in different strings
        //you can change the string using stringbuffer and stringbuuilder
        StringBuffer word = new StringBuffer("Java");
        word.setCharAt(0, 'D');//you change the first index to D ("Dava")
        word.setCharAt(1, 'i');//you change the second index to i ("Diva")
        //append method adds a string or strinbuffer object to the end of a stringbuffer object
        //it can take an argument of a primitive data type
        //you can use the insert method as well
        String st = "Hello, world!";
        StringBuilder to = new StringBuilder(st);
        to.setCharAt(1, 'i');   
    }   
}