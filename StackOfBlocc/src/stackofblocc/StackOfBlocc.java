/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackofblocc;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class StackOfBlocc {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException{
        int N = readInt(), T = readInt();
        String [] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = next();
        }
        List<List<String>> combos = new LinkedList();
        for (int i = 1; i <= arr.length; i++) {
            combos.addAll(combination(Arrays.asList(arr), i));
        }
        int sum = Integer.MAX_VALUE;
        for (int i = 0; i < combos.size(); i++) {
            List<String> temp = combos.get(i);
            int t = 0;
            for (int j = 0; j < temp.size(); j++) {
                t += Integer.parseInt(temp.get(j));
            }
            if (Math.abs(t - T) < sum) {
                sum = Math.abs(t - T);
                System.out.println(t+" "+T);
            }
        }
        if(sum!=Integer.MAX_VALUE)System.out.println(sum);
        else System.out.println(-1);
    }
    public static <String> List<List<String>> combination(List<String> values, int size) {
        if (0 == size) {
            return Collections.singletonList(Collections.<String>emptyList());
        }
        if (values.isEmpty()) {
            return Collections.emptyList();
        }
        List<List<String>> combination = new LinkedList<List<String>>();
        String actual = values.iterator().next();
        List<String> subSet = new LinkedList<String>(values);
        subSet.remove(actual);
        List<List<String>> subSetCombination = combination(subSet, size - 1);
        for (List<String> set : subSetCombination) {
            List<String> newSet = new LinkedList<String>(set);
            newSet.add(0, actual);
            combination.add(newSet);
        }
        combination.addAll(combination(subSet, size));
        return combination;
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
