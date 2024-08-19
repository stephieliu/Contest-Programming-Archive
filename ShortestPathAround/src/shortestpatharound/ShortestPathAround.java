/*
 * To change this license header, choose License Headers in Project Properties.     
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shortestpatharound;

/**
 * 
 * @author steph
 */

/**
 * 
 */
import java.util.*;
import java.io.*;
public class ShortestPathAround {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    static final int[][] ED = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {1, -1}, {-1, 1}, {1, 1}};
    public static void main(String[] args) throws IOException {
//        for(int ll = 0; ll<5; ll++){
//            char temp[][] = new char[12][12];
//            int dis[][] = new int[temp.length][temp[0].length];
//
//            Queue<int[]> q = new ArrayDeque<>();
//            for(int i = 0; i<12; i++){
//                Arrays.fill(temp[i], '#');
//
//                System.out.println(temp[i]);
//            }
//            System.out.println();
//            int x1 = 0, y1 = 0;
//            for(int i = 0; i<10; i++){
//                for(int j = 0; j<10; j++){
//                    temp[i][j] = readCharacter();
//                    if(temp[i][j] == 'X'){y1 = i; x1 = j; break;}
//                }
//            }
//            //bfs
//            temp[y1][x1] = '#'; dis[y1][x1] = 0; q.add(new int[]{x1, y1});
//            boolean flag = false;
//            while(!q.isEmpty() && !flag){
//                int[] arr = q.remove();
//                for(int[] t : ED){
//                    int x = arr[0]+t[0];
//                    int y = arr[1]+t[1];
//                    int d = dis[arr[1]][arr[0]]+1;
//                    if(temp[y][x] == 'X'){
//                        System.out.println(d);
//                        flag = true; break;
//                    }
//                    else if(temp[y][x]!='#'){
//                        temp[y][x] = '#';
//                        dis[y][x] = d;
//                        q.add(new int[]{x,y});
//                    }
//                }
//            }
//            String s = readLine();//this reads in the ----- after test case
//            System.out.println(s);
//        }
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
