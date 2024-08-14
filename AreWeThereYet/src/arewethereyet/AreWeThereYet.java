/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arewethereyet;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class AreWeThereYet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dis1 = input.nextInt();
        int dis2 = input.nextInt();
        int dis3 = input.nextInt();
        int dis4 = input.nextInt();
        int[][] Dtable = new int[5][5];
        int[] distance = new int[4];
        distance[0] = dis1;
        distance[1] = dis2;
        distance[2] = dis3;
        distance[3] = dis4;
        int counter = 0;
        int position = 0;
        for(int i = 0; i <= 4; i++){
            position = 0;
            for(int i1 = 0; i1 <= i; i1++){
                if(i1 == i){
                    Dtable[i][i1] = 0;
                }
                else{
                    counter = 0;
                    for(int i2 = i - 1; i2 >= i1; i2--){
                        counter += distance[i2];
                    }
                    Dtable[i][i1] = counter;
                    position++;
                }
            }
            counter = -1;
            for(int i2 = i + 1; i2 <= 4; i2++){
                if(counter < 0){
                    counter = distance[position];
                }
                else{
                    counter += distance[position];
                }
                Dtable[i][i2] = counter;
                position++;
            }
        }
        System.out.println();
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(Dtable[i][j] + " "); 
            }
            System.out.println();
        }
    }
    
}
