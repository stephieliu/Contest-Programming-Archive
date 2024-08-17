/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crossspiral1;

/**
 *
 * @author Stephie
 */
import java.util.*;
import java.io.*;
public class CrossSpiral1 {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int width = readInt(), height = readInt(), cutw = readInt();
        int cuth = readInt();
        int steps = readInt();
        int [][] arr = new int [height][width];
        for(int i = 0; i<height; i++){
            for(int j = 0;j<width; j++){
                arr[i][j] = 0;
            }
        }
        //rectangle cut-outs
        for(int i = 0; i<cuth; i++){
            for(int j = 0; j<cutw; j++){
                arr[i][j] = -1;//upper left
                arr[i][width-j-1] = -1;//upper right
                arr[height-i-1][j] = -1;//lower left
                arr[height-i-1][width-j-1] = -1;//lower right
            }
        }
//        for(int i = 0; i<height; i++){
//            for(int j = 0;j<width; j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
        int i = 0, j = cutw;
        int count = 0;
        boolean rightfirst = true;
        //Right, Down, Left, Up
        while(count<steps){
            if(rightfirst == true){
                if(j+1<width && arr[i][j+1]==0){
                    arr[i][j] = -1;
                    j++;
                }
                else if(i+1<height && arr[i+1][j]==0){
                    arr[i][j] = -1;
                    i++;
                }
                else if(j-1>-1 && arr[i][j-1]==0){
                    arr[i][j] = -1;
                    j--;
                }
                else if(i-1>-1 && arr[i-1][j]==0){
                    arr[i][j] = -1;
                    i--;
                    rightfirst = false;
                }
            }
            else{
                if(j-1>-1 && arr[i][j-1]==0){//left
                    arr[i][j] = -1;
                    j--;
                }
                else if(i-1>-1 && arr[i-1][j]==0){//up
                    arr[i][j] = -1;
                    i--;
                }
                else if(j+1<width && arr[i][j+1]==0){//right
                    arr[i][j] = -1;
                    j++;
                }
                else if(i+1<height && arr[i+1][j]==0){//down
                    arr[i][j] = -1;
                    i++;
                    rightfirst = true;
                }
            }
            count++;
        }
        //print checking
//        for(int x = 0; x<height; x++){
//            for(int y = 0;y<width; y++){
//                System.out.print(arr[x][y]+"\t");
//            }
//            System.out.println();
//        }
        //print answer
        System.out.println((j+1)+"\n"+(i+1));
        
    }
    static String next () throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static long readLong () throws IOException {
        return Long.parseLong(next());
    }
    static int readInt () throws IOException {
        return Integer.parseInt(next());
    }
    static double readDouble () throws IOException {
        return Double.parseDouble(next());
    }
    static char readCharacter () throws IOException {
        return next().charAt(0);
    }
    static String readLine () throws IOException {
        return br.readLine().trim();
    }
}
