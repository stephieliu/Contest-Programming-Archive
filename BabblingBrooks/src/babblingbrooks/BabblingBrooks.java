/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babblingbrooks;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class BabblingBrooks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Double> flows = new LinkedList<>();
        int n = input.nextInt();
        for(int i = 0; i < n; i++){
            double temp = input.nextDouble();
            flows.add(temp);
        }
        while(true){
            int op = input.nextInt();
            if(op == 77) break;
            if(op == 99){
                int x = input.nextInt() - 1;
                double percent = input.nextDouble();
                double flow = flows.get(x);
                double newflow = flow * percent/100.0;
                flows.set(x, newflow);
                flows.add(x+1, flow - newflow);
            }
            else{
                int x = input.nextInt() - 1;
                double f1 = flows.get(x);
                double f2 = flows.get(x+1);
                flows.set(x, f1 + f2);
                flows.remove(x+1);
            }
        }
        for(double x : flows){
            System.out.print(Math.round(x) + " ");
        }
    }
    
}
