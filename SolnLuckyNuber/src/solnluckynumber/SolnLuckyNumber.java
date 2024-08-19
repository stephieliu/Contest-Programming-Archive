package solnluckynumber;
import java.util.*;
public class SolnLuckyNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0; i<n; i++){
            String num = input.next();
            int sum = 0;
            for(int j=0; j<num.length(); j++){
                sum = sum+num.charAt(j) -'0';
                if(sum>=10) sum = sum/10 + sum%10;
            }
            System.out.println(sum);
        }
    }
}
