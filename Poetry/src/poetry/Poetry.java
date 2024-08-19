/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poetry;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Poetry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        String [] poem = new String [4*N];
        String t = input.nextLine();
        for(int i = 0; i<4*N; i++){
            String n = input.nextLine().toLowerCase();
            int [] arr = new int [5];
            arr[0] = n.lastIndexOf("a");
            arr[1] = n.lastIndexOf("e");
            arr[2] = n.lastIndexOf("i");
            arr[3] = n.lastIndexOf("o");
            arr[4] = n.lastIndexOf("u");
            Arrays.sort(arr);
            poem[i] = n.substring(arr[4]);
        }
    }
    
}
