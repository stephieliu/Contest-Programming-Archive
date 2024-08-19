/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackofblocks;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class StackOfBlocks {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = readInt(), T = readInt();
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i<N; i++){
            arr.add(readInt());
        }
        List<List<Integer>> combo = combination(arr, N);
        //List<Integer> sums = new ArrayList<>();
        System.out.println(combo);
        int sum = Integer.MAX_VALUE;
        for(int i = 0; i<combo.size(); i++){
            List<Integer> temp = combo.get(i);
            int t = 0;
            for(int j = 0; j<temp.size(); j++){
                t+=temp.get(j);
            }
            if(Math.abs(t-T)<sum){
                sum = Math.abs(t-T);
            }
        }
        System.out.println(sum);
    }
    public static <Integer> List<List<Integer>> combination(List<Integer> values, int size){
        if (0 == size){
            return Collections.singletonList(Collections.<Integer>emptyList());
        }
        if (values.isEmpty()) {
            return Collections.emptyList();
        }
        List<List<Integer>> combination = new LinkedList<List<Integer>>();
        Integer actual = values.iterator().next();
        List<Integer> subSet = new LinkedList<Integer>(values);
        subSet.remove(actual);
        List<List<Integer>> subSetCombination = combination(subSet, size - 1);
        for (List<Integer> set : subSetCombination){
            List<Integer> newSet = new LinkedList<Integer>(set);
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
