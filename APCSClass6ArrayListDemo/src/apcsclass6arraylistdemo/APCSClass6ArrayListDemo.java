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
public class APCSClass6ArrayListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //declaring an arraylist to store integers
        ArrayList<Integer> intList1 = new ArrayList<Integer>();
        //Declaring an arraylist to store double
        ArrayList<Double> dblList1 = new ArrayList<Double>();
        //declaring and arraylist to store strings
        ArrayList<String> strList1 = new ArrayList<String>();
        //methods associated with arraylist
        //adding an element into the arrayList
        intList1.add(23);
        intList1.add(45);
        //printing the arraylist
        System.out.println(intList1);
        //this will print [23, 45] --> unlike the normal array
        //Arraylist is an object type data structure
        //this had a built-in toString method
        //adding an element in a specified location
        intList1.add(0,100);//add 100 at the start (0th index)
        System.out.println(intList1);
        //we can add one in between as well
        intList1.add(1,1000);
        System.out.println(intList1);
        //in the last index (end of the list)
        intList1.add(4, 100000);
        System.out.println(intList1);
        //intList1.add(6,-100);
        //System.out.println(intList1);
        //accessing an element in a specified index
        System.out.println(intList1.get(2));
        //returns 23
        //accessing the index of a specified element
        System.out.println(intList1.indexOf(1000));
        //retursn the first index
        //if not present, it will retirn -1
        //removing an element inn a specified index
        intList1.remove(2);
        System.out.println(intList1);
        //the number of elelments in an array list
        System.out.println(intList1.size());
        System.out.println(intList1.isEmpty());
        //using a for loop to initialize an arau list
        for(int i = 0; i<5; i++){
            int intX = input.nextInt();
            intList1.add(intX);
        }
        System.out.println(intList1);
    }
    
}
