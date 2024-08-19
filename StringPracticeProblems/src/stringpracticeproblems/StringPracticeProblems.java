/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringpracticeproblems;

/**
 *
 * @author steph
 */
import java.util.*;
public class StringPracticeProblems {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //BEGINNER
        //1.
//        System.out.println("Enter a password: ");
//        String password = sc.nextLine();
//        if(password.length()>=8) System.out.println("Password accepted.");
//        else System.out.println("Password not accepted.");
        
        //2.
//        while(true){
//            System.out.println("Enter a password: ");
//            String password = sc.nextLine();
//            if(password.length()>=8){
//                System.out.println("Password accepted.");
//                break;
//            }
//            else System.out.println("Password not accepted.\n");
//        }
        
        //3.
//        System.out.println("Enter a string:");
//        String s1 = sc.nextLine();
//        String s2 = sc.nextLine();
//        if(s1.equals(s2)) System.out.println("equal");
//        else System.out.println("not equal");
        
        //4.
//        System.out.println("Enter a string:");
//        String str = sc.nextLine();
//        System.out.println("Enter a letter:");
//        String letter = sc.nextLine();
//        if(str.contains(letter)) System.out.println("Appears.");
//        else System.out.println("Does not appear.");
        
        //INTERMEDIATE
        //5.
//        String text = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem";
//        System.out.println("Please type the following: " + text+ "\n");
//        String user = sc.nextLine();
//        if(text.equals(user)) System.out.println("YOU WIN!");
//        else System.out.println("GAME OVER.");
        
        //6.
//        System.out.println("Enter your first and last name:");
//        String name = sc.nextLine();
//        String [] space = name.split(" ");
//        String capitals = "";
//        
//        for(String str: space){
//            String first = str.substring(0, 1);
//            String left = str.substring(1);
//            capitals += first.toUpperCase() + left + " ";
//        }
//        System.out.println(capitals);
        
        //7.
//        System.out.println("Enter password:");
//        String password = sc.nextLine();
//        System.out.println("Enter your name:");
//        String name = sc.nextLine().replaceAll(" ", "");
//        String specialChars = "/*!@#$%^&*()\"{}_[]|\\?/<>,.";
//        
//        if(password.length()>=8){
//            if(specialChars.contains(password.substring(2,3))){
//                if(!password.contains(name)){
//                    System.out.println("Good");
//                }
//                else
//                    System.out.println("Bad");
//            }
//            else
//                System.out.println("Bad");
//        }
//        else
//            System.out.println("Bad");
        
        //7. Challenge
//        System.out.println("Enter password:");
//        String password = sc.nextLine();
//        System.out.println("Enter your name:");
//        String name = sc.nextLine().replaceAll(" ", "");
//        String specialChars = "/*!@#$%^&*()\"{}_[]|\\?/<>,.";
//
//        if (password.length() >= 8) {
//            if (specialChars.contains(password.substring(2, 3))) {
//                if (!password.contains(name)) {
//                    if(Character.isUpperCase(password.charAt(0)) && Character.isLowerCase(password.charAt(1)))
//                        System.out.println("Good");
//                    else{
//                        System.out.println("Bad");
//                    }
//                } else {
//                    System.out.println("Bad");
//                }
//            } else {
//                System.out.println("Bad");
//            }
//        } else {
//            System.out.println("Bad");
//        }
        
        //8.
//        String str = sc.nextLine();
//        int length = str.length();
//        String firstHalf = "", secondHalf = "";
//        if(length%2 != 0){
//            firstHalf = str.substring(0, length/2+1);
//            secondHalf = str.substring(length/2+1);
//        }
//        else{
//            firstHalf = str.substring(0, length/2);
//            secondHalf = str.substring(length/2);
//        }
//        System.out.println(secondHalf + firstHalf);
        
        //CHALLENGING
        //9.
//        String str = sc.nextLine();
//        int firstIndex = str.indexOf("h");
//        int lastIndex = str.lastIndexOf("h");
//        String first = str.substring(0, firstIndex), last = str.substring(lastIndex);
//        str = first + str.substring(firstIndex+1, lastIndex).replaceAll("h", "H") + last;
//        System.out.println(str);
        
        //10.
//        System.out.println("Enter a string:");
//        String user = sc.nextLine();
//        String vowels = "aeiouy";
//        int count = 0;
//        for(int i = 1; i<=user.length(); i++){
//            String str = user.substring(i-1, i);
//            if(vowels.contains(str))
//                count++;
//        }
//        System.out.println(count);
        
        //11.
//        int points = 0;
//        String text = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem";
//        System.out.println("Please type the following: " + text + "\n");
//        String user = sc.nextLine();
//        for(int i = 1; i<=user.length(); i++){
//            String text1 = text.substring(i-1, i);
//            String text2 = user.substring(i-1, i);
//            if(text1.equals(text2)){
//                points+=1;
//            }
//            else if(text1.equals(text2.toUpperCase())||text1.equals(text2.toLowerCase())){
//                points-=1;
//            }
//            else points-=2;
//        }
//        System.out.println(points);
        
        //SUPER-CHALLENGING
        //12.
//        int points = 0;
//        Random r = new Random();
//        char c = (char) (r.nextInt(26) + 'a');
//        String text = "";
//        for(int i = 0; i<50; i++){
//            text+=c;
//            c = (char) (r.nextInt(26) + 'a');
//        }
//        System.out.println("Please type the following: " + text + "\n");
//        String user = sc.nextLine();
//        for (int i = 1; i <= user.length(); i++) {
//            String text1 = text.substring(i - 1, i);
//            String text2 = user.substring(i - 1, i);
//            if (text1.equals(text2)) {
//                points += 1;
//            } else if (text1.equals(text2.toUpperCase()) || text1.equals(text2.toLowerCase())) {
//                points -= 1;
//            } else {
//                points -= 2;
//            }
//        }
//        System.out.println(points);

        //13.
        

        sc.close();
    }
    
}
