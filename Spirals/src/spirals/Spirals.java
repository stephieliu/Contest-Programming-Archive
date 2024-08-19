/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spirals;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Spirals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        int end = input.nextInt();
        int diff = end-start, rows = 1, col = 1, count = 0;
        for(int i = 1;; i++){
            count+=i;
            if(diff>=count){
                rows++;
            }
            else{
                break;
            }
            count+=i;
            if(diff>=count){
                col++;
            }
            else{
                break;
            }
        }
        int [][] spiral = new int [rows][col];
        int x = (int)Math.ceil((double)rows/2.0)-1, y = (int)Math.ceil((double)col/2.0)-1;
        spiral[x][y] = start;
        count = 0;
        for(int i = start; i<end;){
            count++;
            for(int i1 = 1; i1<=count && i<end; i1++){
                x++;
                i++;
                spiral[x][y] = i;
            }
            for(int i1 =1; i1<=count && i<end; i1++){
                y++;
                i++;
                spiral[x][y] = i;
            }
            count++;
            for(int i1 = 1; i1<=count && i<end; i1++){
                x--;
                i++;
                spiral[x][y] = i;
            }
            for(int i1 = 1; i1<=count && i<end; i1++){
                y--;
                i++;
                spiral[x][y] = i;
            }
        }
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<col; j++){
                if(spiral[i][j] == 0){
                    System.out.print("   ");
                }
                else if(spiral[i][j] <10){
                    System.out.print(" "+spiral[i][j]+" ");
                }
                else{
                    System.out.print(spiral[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
    
}
