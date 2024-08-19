/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nukit;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Nukit {

    /**
     * @param args the command line arguments
     */
    static char[] used;
    public static boolean AABDDyes(int a, int b, int c, int d){
        return a>=2 && b>=1 && d>=2;
    }
    public static boolean ABCDyes(int a, int b, int c, int d){
        return a>=1 && b>=1 && c>=1 && d>=1;
    }
    public static boolean CCDyes(int a, int b, int c, int d){
        return c>=2 && d>=1;
    }
    public static boolean BBByes(int a, int b, int c, int d){
        return b>=3;
    }
    public static boolean ADyes(int a, int b, int c, int d){
        return a>=1 && b>=1;
    }
    public static boolean Moveyes(int a, int b, int c, int d){
        return AABDDyes(a, b, c, d) || ABCDyes(a,b,c,d)||CCDyes(a,b,c,d)||
                BBByes(a,b,c,d)||ADyes(a,b,c,d);
    }
    public static boolean youLose(int a, int b, int c, int d){
        int x = a*27000+b*900+c*30+d;
        if(used[x] != '?'){
            return used[x] =='l';
        }
        if(!Moveyes(a,b,c,d)){
            used[x] = 'l';
            return true;
        }
        else{
            boolean temp = true;
            if(AABDDyes(a,b,c,d)){
                temp = temp&&youWin(a-2, b-1, c, d-2);
            }
            if(ABCDyes(a,b,c,d)){
                temp = temp&&youWin(a-1, b-1, c-1, d-1);
            }
            if(CCDyes(a,b,c,d)){
                temp = temp&&youWin(a,b,c-2,d-1);
            }
            if(BBByes(a,b,c,d)){
                temp = temp&&youWin(a,b-3,c,d);
            }
            if(ADyes(a-1,b,c,d-1)){
                temp = temp&&youWin(a-1,b,c,d-1);
            }
            if(temp){
                used[x] = 'l';
                return true;
            }
            else{
                used[x] = 'w';
                return false;
            }
        }
    }
    public static boolean youWin(int a, int b, int c, int d){
        int x = a*27000+b*900+c*30+d;
        if(used[x]!='?'){
            return used[x]=='w';
        }
        if(AABDDyes(a,b,c,d)&& youLose(a-2, b-1, c, d-2)){
            used[x] = 'w';
            return true;
        }
        else if(ABCDyes(a,b,c,d)&&youLose(a-1, b-1, c-1, d-1)){
            used[x] = 'w';
            return true;
        }
        else if(CCDyes(a,b,c,d)&&youLose(a, b, c-2, d-1)){
            used[x] = 'w';
            return true;
        }
        else if(BBByes(a,b,c,d)&&youLose(a, b-3, c, d)){
            used[x] = 'w';
            return true;
        }
        else if(ADyes(a,b,c,d)&&youLose(a-1, b, c, d-1)){
            used[x] = 'w';
            return true;
        }
        else{
            used[x] = 'l';
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        used = new char[100000];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<100000; j++){
                int Ai = input.nextInt();
                int Bi = input.nextInt();
                int Ci = input.nextInt();
                int Di = input.nextInt();
                used[j] = '?';
                if(youWin(Ai, Bi,Ci,Di)){
                    System.out.println("Patrick");
                }
                else{
                    System.out.println("Roland");
                }
            }     
        }
    }
    
}
