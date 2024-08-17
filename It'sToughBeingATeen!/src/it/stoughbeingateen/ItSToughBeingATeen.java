/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.stoughbeingateen;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class ItSToughBeingATeen {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static List<Integer> adj[] = new ArrayList[8];
    static int arr[] = new int[8];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < adj.length; i++){
            adj[i] = new ArrayList();
        }
        int a[][] = {{1, 7}, {1, 4}, {2, 1}, {3, 4}, {3, 5}};
        for (int[] a1 : a) {
            addEdge(a1[0], a1[1]);
        }
        while(true){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x == 0) break;
            addEdge(x, y);
        }
        List<Integer> ans = new ArrayList();
        while(true){
            boolean found = false;
            for(int i = 1; i <= 7; i++){
                if(arr[i] == 0){
                    ans.add(i);
                    arr[i]--;
                    found = true;
                    for(int j : adj[i]){
                        arr[j]--;
                    }
                    break;
                }
            }
            if(!found){
                break;
            }
        }
        if(ans.size() != 7){
            System.out.println("Cannot complete these tasks. Going to bed.");
        }
        else{
            ans.forEach((x) -> {
                System.out.print(x + " ");
            });
        }
    }
    static void addEdge(int u, int v) {
        adj[u].add(v);
        arr[v]++;
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
