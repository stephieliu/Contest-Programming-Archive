/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waittime;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class WaitTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        int found = 0;
        int count = 0;
        int[] friends = new int[M];
        int[] friends1 = new int[M];
        String[] status = new String[M];
        String[] status1 = new String[M];
        int[] wt = new int[M];
        int wt1 = 0;
        for(int i = 0; i < M; i++){
            status[i] = input.next();
            friends[i] = input.nextInt();
            wt[i] = 0;
        }
        for(int i = 0; i < M; i++){
            if("W".equals(status[i])){
                wt1 = friends[i];
            }
            else{
                found = -1;
                for(int j = 0; j < count; j++){
                    if(friends[i] == friends1[j]){
                        found = j;
                        break;
                    }
                }
                if(found < 0){
                    friends1[count] = friends[i];
                    wt[count] = -1;
                    status1[count] = "R";
                    found = count;
                    count++;
                }
                for(int j = 0; j < count; j++){
                    if(wt[j] >= 0){
                        if("R".equals(status1[j])){
                            wt[j] += wt1;
                        }
                    }
                    else{
                        wt[j] = 0;
                    }
                }
                status1[found] = status[i];
                wt1 = 1;
            }
        }
        String[] ans = new String[count];
        for(int i = 0; i < count; i++){
            ans[i] = friends1[i] + " ";
            if("S".equals(status1[i])){
                ans[i] += wt[i];
            }
            else{
                ans[i] += "-1";
            }
        }
        Arrays.sort(ans);
        for(int i = 0; i < count; i++){
            System.out.println(ans[i]);
        }
    }
    
}
