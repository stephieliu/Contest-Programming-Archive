/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumup;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class SumUp {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    public static <Integer> List<List<Integer>> combination(List<Integer> values, int size) {
        //System.out.println("yes");
        if (0 == size) {
            return Collections.singletonList(Collections.<Integer>emptyList());
        }

        if (values.isEmpty()) {
            return Collections.emptyList();
        }

        List<List<Integer>> combo = new LinkedList<List<Integer>>();

        Integer actual = values.iterator().next();

        List<Integer> subSet = new LinkedList<Integer>(values);
        subSet.remove(actual);

        List<List<Integer>> subSetCombination = combination(subSet, size - 1);

        for (List<Integer> set : subSetCombination) {
            List<Integer> newSet = new LinkedList<Integer>(set);
            newSet.add(0, actual);
            combo.add(newSet);
        }

        combo.addAll(combination(subSet, size));

        return combo;
    }
    public static void main(String[] args) throws IOException {
        int N = readInt();
        int K = readInt();
        int count = Integer.MAX_VALUE;
        List<Integer> A = new ArrayList<>();
        for(int i = 0; i<N; i++){
            A.add(readInt());
        }
        List<List<Integer>> temp=combination(A, N);
        System.out.println(temp);
        for(int i = 0; i<temp.size(); i++){
            List<Integer> x = new ArrayList<>();
            x = temp.get(i);
            int sum = 0;
            while(!x.isEmpty()){
                sum+=x.remove(0);
            }
            if(sum>=K && count<temp.get(i).size()){
                count = temp.get(i).size();
            }
        }
        if(count==Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(count);
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
