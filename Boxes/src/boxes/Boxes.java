/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Boxes {

    /**
     * @param args the command line arguments
     */
    int l,w,h,v;
    public Boxes(int a,int b,int c){
        l = a;
        w = b;
        h = c;
        //check to see whther we need to swap the l,w,h
        if(l>w){
            int t ;
            t = l;
            l = w;
            w = t;
        }
        if(w>h){
            int t ;
            t = h;
            h = w;
            w = t;
        }
        if(l>w){
            int t;
            t = l;
            l = w;
            w = t;
        }
        v = l*w*h;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int nBox = input.nextInt();
        Boxes[] b = new Boxes[nBox];
        for(int i = 0; i<nBox; i++){
            int l = input.nextInt();
            int w = input.nextInt();
            int h = input.nextInt();
            b[i] = new Boxes(l,w,h);
        }
        //using bubblesort to sort boxes by volume
        for(int i = 0; i<nBox; i++){
            for(int j = 0; j<nBox-1; j++){
                if(b[j].v>b[j+1].v){
                    Boxes temp = b[j];
                    b[j] = b[j+1];
                    b[j+1] = temp;
                }
            }
        }
        int mBox = input.nextInt();
        for(int j = 0; j<mBox; j++){
            int l = input.nextInt();
            int w = input.nextInt();
            int h = input.nextInt();
            Boxes b1 = new Boxes(l,w,h);
            int k = 0;
            while(k<nBox && (b1.l>b[k].l|| b1.w>b[k].w||
                    b1.h>b[k].h)){
                k++;
            }
            if(k<nBox){
                System.out.println(b[k].v);
            }
            else{
                System.out.println("Item does not fit.");
            }
        }
    }
    
}
