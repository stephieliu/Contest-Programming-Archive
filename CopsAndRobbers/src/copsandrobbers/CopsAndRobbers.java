/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copsandrobbers;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class CopsAndRobbers {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int n = readInt();
        boolean guard[] = new boolean[n+1], first[] = new boolean[n+1];
        Deque<Integer> police = new LinkedList<>(), 
                unprotect = new LinkedList<>();
        for(int i = 1; i <= n; i++){
            int x = readInt();
            if(!guard[x]){
                police.addLast(x);
                guard[x] = true;
                first[i] = true;
            }
        }
        if(police.size() == 1){
            System.out.println(-1);
            return;
        }
        for(int i = 1; i <= n; i++){
            if(!guard[i])
                unprotect.addLast(i);
        }
        int front = police.pollFirst();
        police.addLast(front);
        for(int i = 1; i <= n; i++){
            if(first[i]) System.out.print(police.pollFirst()+" ");
            else System.out.print(unprotect.pollFirst()+" ");
        }
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
