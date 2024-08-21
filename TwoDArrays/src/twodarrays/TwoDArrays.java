/*
 * Stephie Liu
 * 2022-03-29
 * Program to flip the randomly generated pixels in the rows of an image
 */
package twodarrays;

import java.util.*;
public class TwoDArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//declare scanner
        
        //ask user for input
        System.out.println("Enter side length for image:");
        int length = sc.nextInt();//read user input for the side length
        int [][] image = new int[length][length];//array to store the image pixels
        int [][] flipped = new int[length][length];//array to store flipped image
        System.out.println("\nPixel Data for Image:");
        
        //run random values for the image pixels
        for(int i = 0; i<length; i++){
            for(int j = 0; j<length; j++){
                image[i][j] = (int)(Math.random()*256);//random number btwn 0 and 255
                flipped[length-i-1][j] = image[i][j];
                //formatting based on the number of digits
                if (image[i][j] > -1 && image[i][j] < 10){//one digit
                    System.out.print(image[i][j] + "   ");
                }
                else if (image[i][j] > 9 && image[i][j] < 100) {//two digits
                    System.out.print(image[i][j] + "  ");
                }
                else {//three digits (pixels are between 0 and 255)
                    System.out.print(image[i][j] + " ");
                }
            }
            System.out.println();
        }
                
        //print the flipped array
        System.out.println("\nImage flipped: ");
        for(int i = 0; i<length; i++){
            for(int j = 0; j<length; j++){
                //formatting based on the number of digits
                if(flipped[i][j]>-1 && flipped[i][j]<10)//one digit
                    System.out.print(flipped[i][j]+"   ");
                else if (flipped[i][j]>9 && flipped[i][j]<100) {//two digits
                    System.out.print(flipped[i][j] + "  ");
                }
                else {//three digits (pixels are between 0 and 255)
                    System.out.print(flipped[i][j] + " ");
                }
            }
            System.out.println();
        }
        
        sc.close();//close the scanner
    }
    
}
