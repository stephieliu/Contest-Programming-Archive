/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofprimes;

/**
 *
 * @author Stephie
 */
import java.util.*;
import java.io.*;
public class SumOfPrimes {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        //if even, n = p+q --> make p aslarge as possible (n/2) and keep
        //subtracting one, checking if p is prime.
        //if odd, n = p+q+r --> made p as large as possible (n/a) and keep
        //subtracting one, checking if p is prime.
        //if p is prime for odd case, take the q and r to the even case and
        //use that to check for the largest value of q.
        int MV = (int)1e7;
        boolean f[] = new boolean[MV+1];
        for(int i = 2; i<=MV; i++){
            if(!f[i]){
                for(int j = 2*i; j<=MV; j+=i){
                    f[j] = true;
                }
            }
        }
        f[0] = f[1] = f[2] = true;
        for(int t = 1; t<=5; t++){
            int n = readInt();
            if(!f[n]){
                System.out.println(n+" = "+n);
            }
            else if(n%2==0){//n is even
                for(int p = n/2; p>=3; p--){
                   if(!f[p] && !f[n-p]){
                       System.out.println(n+" = "+p+" + "+(n-p));
                       break;
                   }
                }
            }
            else{//n is odd
                boolean found = false;
                for(int p = n/3; p>=3 && !found; p--){
                    if(f[p]){
                        continue;//this allows the program to skip over the next
                        //few lines of code
                    }
                    int x = n-p;
                    for(int q = x/2; q>=p; q--){
                        if(!f[q] && !f[x-q]){
                            System.out.println(n+" = "+p+" + "+q+" + "+(x-q));
                            found = true;
                            break;
                        }
                    }
                }
            }
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
