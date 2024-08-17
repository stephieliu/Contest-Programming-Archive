/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

import java.io.*;
import java.util.*;

/**
 *
 * @author Stephie
 */
public class GuessingGame {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int binarySearch(int arr[], int l, int r, int x, int count) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            // If the element is present at the 
            // middle itself 
            if (arr[mid] == x){ 
                return count;
            }
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid] > x) {
                count++;
                return binarySearch(arr, l, mid - 1, x, count);
            }
  
            // Else the element can only be present 
            // in right subarray 
            else{
                count++;
                return binarySearch(arr, mid + 1, r, x, count);
            }
        } 
  
        // We reach here when element is not present 
        // in array 
        return -1; 
    } 
    public static void main(String[] args) throws IOException {
        int N = readInt(), X = readInt(), Y = readInt();
        int[] arr = new int [Y-X+1];
        for(int i = 0, j = X; i<arr.length; i++, j++){
            arr[i] = j;
        }
        int count = 0;
        System.out.println(binarySearch(arr, X, Y, N, count));
   }
    static String next () throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static long readLong () throws IOException {
        return Long.parseLong(next());
    }
    static int readInt () throws IOException {
        return Integer.parseInt(next());
    }
    static double readDouble () throws IOException {
        return Double.parseDouble(next());
    }
    static char readCharacter () throws IOException {
        return next().charAt(0);
    }
    static String readLine () throws IOException {
        return br.readLine().trim();
    }
    
}
