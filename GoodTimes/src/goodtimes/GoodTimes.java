/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goodtimes;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class GoodTimes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int o = input.nextInt();
        int v, e, w, t, h, sj;
        while(o<2400 && o>=0000){
            v = o-300;
            if(v>2400){
                v = 2400-v;
            }
            else if(v<0000){
                v = 2400+v;
            }
            e = o-200;
            if(e>2400){
                e = 2400-e;
            }
            else if(e<0000){
                e = 2400+e;
            }
            w = o-100;
            if(w>2400){
                w = 2400-w;
            }
            else if(w<0000){
                w = 2400+w;
            }
            t = o;
            if(t>2400){
                t = 2400-t;
            }
            else if(t<0000){
                t = 2400+t;
            }
            h = o+100;
            if(h>2400){
                h = 2400-h;
            }
            else if(h<0000){
                h = 2400+h;
            }
            sj = o+130;
            if(sj>2400){
                sj = 2400-sj;
            }
            else if(sj<0000){
                sj = 2400+sj;
            }
            System.out.println(o+" in Ottawa\n"+v+" in Victoria\n"+e
                    +" in Edmonton\n"+w+" in Winnipeg\n"+t+" in Toronto\n"+h
                    +" in Halifax\n"+sj+" in St. John's");
            break;
        }
    }
    
}
