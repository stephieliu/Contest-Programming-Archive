/*
 * Stephie Liu
 * 2022-04-07
 * Program that sorts heights of students in order from highest to lowest using
 * Bubble Sort algorithm (because user input can vary, selection and insertion
 * sort may not be as effective all the time)
 */
package sorting;

/**
 *
 * @author steph
 */
import java.util.*;
public class Sorting {

    /**
     * @param args the command line arguments
     */
    
    //bubble sort algorithm
    public static String[] BubbleSort(String[] list) {
        boolean flag = false;//flags whether the array has been fully sorted
        String temp;
        //loop from the top of the array
        //i-- because the largest element in each pass will always get to the
        //right spot
        for (int i = list.length - 1; i > 0 && !flag; i--) {
            flag = true;//if it doesn't go through the if statement then flag
            //will stay as TRUE and will break out of the loop

            //compares adjacent elements and swaps if they are smaller
            for (int j = 1; j < i; j++) {
                //splits list[j] by ": " and takes the second element in the row,
                //which is the age, then turns it from a string into an integer
                if (Integer.parseInt(list[j].split(":")[1].trim()) < Integer.parseInt(list[j-1].split(":")[1].trim())) {
                    //if the second element is smaller than the first, then 
                    //you swap them
                    temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
                    flag = false;//mark flag as false
                }
            }
        }
        return list;//returns the sorted array
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//declare the scanner
        
        //ask the user for input
        System.out.println("Number of students:");
        int students = sc.nextInt();
        
        String[] nameAndHeight = new String[students];//stores the names and
        //heights of students as strings
        
        //ask user for input
        System.out.println("Enter names and heights:");
        sc.nextLine();
        for(int i = 0; i<students; i++){
            nameAndHeight[i] = sc.nextLine();
        }
                                
        //bubblesort the heights of the students
        nameAndHeight = BubbleSort(nameAndHeight);
        
        //print out the heights in reverse order + format the code
        System.out.println("\nThe ordered list of students:");
        for(int i = students-1; i>-1; i--){
            System.out.println(nameAndHeight[i]+"cm");
        }
        
        sc.close();//close the scanner
    }
}
