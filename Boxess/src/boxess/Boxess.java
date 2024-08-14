/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxess;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Boxess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [][] boxes = new int[n][3];
        for(int i = 0; i < n; i++){
            int [] boxDimension = {input.nextInt(), input.nextInt(), input.nextInt()};
            Arrays.sort(boxDimension);
            boxes[i] = boxDimension;
        }
        int m = input.nextInt();
        for(int i = 0; i < m; i++){
            boolean Fit = false;
            int min = Integer.MAX_VALUE;
            int [] itemDimension = {input.nextInt(), input.nextInt(), input.nextInt()};
            Arrays.sort(itemDimension);
            for(int j = 0; j < boxes.length; j++){
                if(itemDimension[0] <= boxes[j][0] && itemDimension[1] <= boxes[j][1] && itemDimension[2] <= boxes[j][2]){
                    Fit = true;
                    if(boxes[j][0] * boxes[j][1] * boxes[j][2] < min){
                        min = boxes[j][0] * boxes[j][1] * boxes[j][2];
                    }
                }
            }
            if(!Fit)
                System.out.println("Item does not fit.");
            else
                System.out.println(min);
        }
    }
    
}
