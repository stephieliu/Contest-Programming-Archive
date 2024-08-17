/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integerpartitions;

/**
 *
 * @author steph
 */
public class IntegerPartitions {

    /**
     * @param args the command line arguments
     */
    static void printArray(int p[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(p[i] + " ");
        }
        System.out.println();
    }

    // Function to generate all unique partitions of an integer 
    static void printAllUniqueParts(int n) {
        int[] p = new int[n]; // An array to store a partition 
        int k = 0;  // Index of last element in a partition 
        p[k] = n;  // Initialize first partition as number itself 

        // This loop first prints current partition then generates next 
        // partition. The loop stops when the current partition has all 1s 
        while (true) {
            // print current partition 
            printArray(p, k + 1);

            // Generate next partition 
            // Find the rightmost non-one value in p[]. Also, update the 
            // rem_val so that we know how much value can be accommodated 
            int rem_val = 0;
            while (k >= 0 && p[k] == 1) {
                rem_val += p[k];
                k--;
            }

            // if k < 0, all the values are 1 so there are no more partitions 
            if (k < 0) {
                return;
            }

            // Decrease the p[k] found above and adjust the rem_val 
            p[k]--;
            rem_val++;

            // If rem_val is more, then the sorted order is violated.  Divide 
            // rem_val in different values of size p[k] and copy these values at 
            // different positions after p[k] 
            while (rem_val > p[k]) {
                p[k + 1] = p[k];
                rem_val = rem_val - p[k];
                k++;
            }

            // Copy rem_val to next position and increment position 
            p[k + 1] = rem_val;
            k++;
        }
    }

    // Driver program 
    public static void main(String[] args) {
        printAllUniqueParts(10);
    }
}
