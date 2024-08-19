/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jerseys;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Jerseys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int J = input.nextInt();
        int A = input.nextInt();
        int [] size = new int[1000001];
        for(int i = 1; i<=J; i++){
            String j = input.next();
            if(null != j)switch (j) {
                case "S":
                    size[i]=0;
                    break;
                case "M":
                    size[i]=1;
                    break;
                case "L":
                    size[i]=2;
                    break;
                default:
                    break;
            }
        }        
        int count = 0;
        for(int i = 1; i<=A; i++){
            String si = input.next();
            int a = input.nextInt();
            int x = 0;
            if(null != si)switch (si) {
                case "S":
                    x = 0;
                    break;
                case "M":
                    x = 1;
                    break;
                case "L":
                    x = 2;
                    break;
                default:
                    break;
            }
            if(1<=a && a<=J && size[a]>=x){
                count++; size[a]=-1;
            }
        }
        System.out.println(count);
    }
    
}
