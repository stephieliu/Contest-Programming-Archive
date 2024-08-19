/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opensource;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class OpenSource {

    /**
     * @param args the command line arguments
     */
    //use a map
    //I wasn't sure how I should implement my code because I am
    //unfamiliar with maps, so I wrote all of my thinking and declared
    //all of my variables instead.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //map to store each project with the number of signups
        Map<String, Integer> myMap = new HashMap<>();
        Map<String, Integer> RecurringCheck = new HashMap<>();
        //map to store names and number of times signed up, this way
        //I can check if there are any students that entered more than once 
        //or if they entered for more than one project.
        String [] projects, signups;
        //create a for loop to check if each input is capital, 
        //if yes, put in projects string
        //else, put in signups string
        //if a 0 is detected, break from the input for loop
        //print the map
   }
    
}
