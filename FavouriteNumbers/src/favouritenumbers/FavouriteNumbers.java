/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package favouritenumbers;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class FavouriteNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] favNumb = new int [N];
        for(int i = 0; i<N; i++){
            favNumb[i] = input.nextInt();
        }
        Arrays.sort(favNumb);

        int a = 0; 
        int x = 0;
        int Q = input.nextInt();
        int [] listNumb = new int [Q];
        for(int i = 0; i<Q; i++){
            listNumb[i] = input.nextInt();
            for(int j = 0; j<N; j++){
                if(favNumb[j]>=listNumb[i]){
                    a = favNumb[j];
                    x = i;
                    int count = 0;
                    for(int k = 0; k<N; k++){
                        if(favNumb[k]==a){
                            count++;
                        }
                    } 
                    System.out.println(a+" "+count);
                    break;
                }
            }
        } 
    }
}
