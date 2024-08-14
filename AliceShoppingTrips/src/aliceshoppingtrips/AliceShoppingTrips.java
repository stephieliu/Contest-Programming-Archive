/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aliceshoppingtrips;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class AliceShoppingTrips {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int T = readInt(), N = readInt(), count = 0;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int i = 0; i<N; i++){
            int j = readInt();
            if(j<0){
                neg.add(j);
            }
            else pos.add(j);
        }
        Collections.sort(pos);
        Collections.sort(neg);
//        System.out.println(pos);
//        System.out.println(neg);
        
        int sum = 0;
        int currPos = 0;
        
        for(int i = 0, j = neg.size()-1, x = 0; x<N;x++){
            int temp = 0, Pdiff = 0;
            if(i==pos.size()) Pdiff = Integer.MAX_VALUE;
            else Pdiff = Math.abs(currPos-pos.get(i));

            if(j==-1) temp = Integer.MAX_VALUE;
            else temp = Math.abs(neg.get(j)-currPos);
            
//            int Ndiff = Math.abs(neg.get(j)-sum);
            if(Pdiff<temp && sum<=T){
                sum+=Pdiff;
                currPos = pos.get(i);
                count++;
                i++;
            }
            else if(Pdiff>=temp && sum<=T){
                sum+=temp;
                currPos = neg.get(j);
                count++;
                j--;
            }
        }
        System.out.println(count-1);
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
