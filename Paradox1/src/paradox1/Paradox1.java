/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paradox1;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class Paradox1 {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int C = readInt();
        List <String> set = new ArrayList<>();
        for(int i = 0; i<C; i++){
            int cmd = readInt();
            if(cmd == 1){
                String s = next();
                if(!set.contains(s)){
                    System.out.println("true");
                    set.add(s);
                }
                else{
                    System.out.println("false");
                }
            }
            else if(cmd == 2){
                String s = next();
                if(set.contains(s)){
                    System.out.println("true");
                    set.remove(s);
                }
                else System.out.println("false");
            }
            else if(cmd == 3){
                String s = next();
                if(set.contains(s)){
                    System.out.println(set.indexOf(s));
                }
                else System.out.println(-1);
            }
            else if(cmd == 4){
                List<String> temp = set;
                Collections.sort(temp);
                for(int j = 0; j<temp.size(); j++){
                    System.out.print(temp.toArray()[j]+" ");
                }
                System.out.println();
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
