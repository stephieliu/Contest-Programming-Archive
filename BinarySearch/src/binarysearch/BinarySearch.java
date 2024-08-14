/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = {1,1,1,2,3,3,6,9};
        int key = 2;
        int pos = Arrays.binarySearch(a, key);
        System.out.println(pos);
    }
    
}
