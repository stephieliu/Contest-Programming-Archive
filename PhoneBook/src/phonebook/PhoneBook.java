/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class PhoneBook {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static Map<Integer, Integer> sortByValue(Map<Integer, Integer> hm) 
    { 
        List<Map.Entry<Integer, Integer> > list = 
               new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() { 
            public int compare(Map.Entry<Integer, Integer> o1,  
                               Map.Entry<Integer, Integer> o2) 
            { 
                return -(o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>(); 
        for (Map.Entry<Integer, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp;
    }
    public static <T, E> T getKeyByValue(Map<T, E> map, E value) {
        for (Map.Entry<T, E> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
    public static void main(String[] args) throws IOException {
        int N = readInt();
        Map<String, Integer> book = new HashMap<>();
        for(int i = 0; i<N; i++){
            book.put(next(), readInt());
        }
        int D = readInt();
        Map<Integer, Integer> dial = new TreeMap<>();
        for(int i =0; i<D; i++){
            int numb = readInt();
            if(!dial.containsKey(numb)) dial.put(numb, 1);
            else dial.put(numb,dial.get(numb)+1);
        }
        Map<Integer, Integer> dial1 = sortByValue(dial);
//        System.out.println(dial1);
        int number = dial1.keySet().stream().findFirst().get();;
//        System.out.println(number);
        System.out.println(getKeyByValue(book, number));
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
