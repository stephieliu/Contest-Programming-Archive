/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sunflowers;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Sunflowers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[][] table1 = new int[N][N]; 
        int[][] table2 = new int[N][N];
        int rotation = 1;
        boolean found = false;
        int minNum = 0;
        for(int x = 0; x < N; x++){
            for(int y = 0; y < N; y++){
                table1[x][y] = input.nextInt();
                if(table1[x][y] < minNum || minNum == 0){
                    minNum = table1[x][y];
                }
            }
        }
                
        while(!found){
            for(int x = 0; x < N; x++){
                for(int y = 0; y < N; y++){
                    switch (rotation) {
                        case 1:
                            //0 turn
                            table2[x][y] = table1[x][y];
                            break;
                        case 2:
                            //90 turn cw
                            table2[y][N - 1 - x] = table1[x][y];
                            break;
                        case 3:
                            //180 turn cw
                            table2[N - 1 - x][N - 1 - y] = table1[x][y];
                            break;
                        case 4:
                            //270 turn cw
                            table2[N - 1 - y][x] = table1[x][y];
                            break;
                        default:
                            break;
                    }
                }
            }
            if(table2[0][0] == minNum){
                boolean ng = false;
                for(int i = 1; i < N; i++){
                    if(table2[i][0] < table2[i-1][0]){
                        ng = true;
                        break;
                    }
                }
                if(ng){
                    rotation++;
                }
                else{
                    found = true;
                }
            }
            else{
                rotation++;
            }
            if(rotation > 4){
                break;
            }
        }
        System.out.println();
        if(found){
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    System.out.print(table2[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
