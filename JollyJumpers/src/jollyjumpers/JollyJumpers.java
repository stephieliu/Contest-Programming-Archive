package jollyjumpers;
import java.util.*;
public class JollyJumpers {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int n = input.nextInt();
        int [] collect = new int [n];
        int [] sums = new int [n-1];
        for(int i = 0; i<n; i++){
            collect[i] = 0;
            sums[i] = 0;
        }
        for(int i = 0; i<n; i++){
            collect[i] =input.nextInt();
            sums[i] = collect[i]+collect[i+1];
        }
        for(int i= 0; i<n; i++){
            String x = "1";
            if(Arrays.toString(sums).contains(x)&& i==n-1){
                System.out.println("Jolly");
            }
            else if(!Arrays.toString(sums).contains(x) && i==n-1){
                System.out.println("Not Jolly");
            }
        }
    }
}
