/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bebiliths;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Bebiliths {

    /**
     * @param args the command line arguments
     */
    
    static class Object{
        int s;
        int d;
        int c;
        int i;
        public Object(int speed, int distance, int claw, int id){
            this.s = speed;
            this.d = distance;
            this.c = claw;
            this.i = id;
        }
    }
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int S = input.nextInt();
        int N = input.nextInt();
        Object characteristics[] = new Object[N];
        for(int i = 0; i < N; i++){
            characteristics[i] = new Object(input.nextInt(), input.nextInt(), input.nextInt(), i+1);
        }
        Arrays.sort(characteristics, new Comparator<Object>(){
            @Override
            public int compare(Object x, Object y){
                if(x.s >= S && y.s >= S && x.s == y.s){
                    return y.c - x.c;
                }
                else if(x.s < S && y.s < S && x.s == y.s){
                    return y.d - x.d;
                }
                else if(x.s != y.s){
                    return y.s - x.s;
                }
                return y.i - x.i;
            }
        });
        int Q = input.nextInt();
        for(int i = 0; i < Q; i++){
            int I = input.nextInt()-1;
            System.out.println(characteristics[I].i);
        }
    }   
}
