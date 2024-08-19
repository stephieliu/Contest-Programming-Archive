/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luckynumber;

/**
 *
 * @author Stephie
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class LuckyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new 
            InputStreamReader(System.in));
        int N = Integer.parseInt(input.readLine());
        for(int i = 0; i < N; i++) {
            String x = input.readLine();
            Long y = Long.parseLong(x.substring(0, 1));
            while(x.length() > 1) {
                y = Long.parseLong(x.substring(0, 1));
                for(int j = 1; j < x.length(); j++) {
                    y += Integer.parseInt(x.substring(j, j+1));
                }
                x = y.toString();
            }
            System.out.println(y);
        }
    }
}
