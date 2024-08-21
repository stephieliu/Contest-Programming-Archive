/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package willson.fooooood;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class WillsonFooooood {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int F = readInt(); Map<String, Integer> map = new HashMap();
        for(int i = 0; i<F; i++){
            String food = next();
            int val = readInt();
            map.put(food, val);
        }
        int N = readInt();
        List<item> a = new ArrayList();
        for(int i = 0; i<N; i++){
            String food = next();
            int pos = readInt();
            int val = map.get(food);
            a.add(new item(pos, val));
        }
        Collections.sort(a);
//        for(item e: a){
//            System.out.println("pos = "+e.pos+"val = "+e.val);
//        }
        int count = 0; int energy = 0; int location = 0;
        for(item cur: a){
            if(cur.pos - location > energy && cur.pos - location > 0){
                break;
            }
            //(pos = 0, val = -100)(pos = 0, val = 10)(pos = 0, val = 20)
            else{
                energy = energy - (cur.pos-location)+cur.val;
                count++; location = cur.pos;
            }
        }
        System.out.println(count);
    }
    static class item implements Comparable<item>{
        int pos, val;
        item(int p, int v){
            pos = p; val = v;
        }
        public int compareTo(item x){
            return Integer.compare(pos, x.pos);
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
