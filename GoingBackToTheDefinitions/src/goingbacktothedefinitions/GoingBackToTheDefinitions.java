/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goingbacktothedefinitions;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class GoingBackToTheDefinitions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        String integers[] = new String[N];
        for(int i = 0; i<N; i++){
            integers[i] = input.next();
        }
        Arrays.sort(integers, new Comparator<String>(){
            @Override
            public int compare(String x, String y){
                return (y+x).compareTo(x+y);
            }
        });
        for(int i = 0; i<N; i++){
            System.out.print(integers[i]);
        }
    }
}
