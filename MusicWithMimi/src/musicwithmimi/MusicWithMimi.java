/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicwithmimi;

/**
 *
 * @author steph
 */
import java.util.*; import java.io.*;
public class MusicWithMimi {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static String s = "C C# D D# E F F# G G# A A# B C";
    public static void main(String[] args) throws IOException {
        String notes = "C C# D D# E F F# G G# A A# B C";
        String [] cyclenotes = notes.split(" ");
        int T = readInt();
        for(int i = 0; i<T; i++){
            String chord = readLine();
            String[] chordnotes = chord.split(" ");
            if(root(chordnotes)){
                System.out.println("root");
            }
            else{
                boolean found = false;
                for(int j = 0; j<=3; j++){
                    if(root(chordnotes)){
                        if(j == 1) System.out.println("first");
                        else if(j== 2) System.out.println("second");
                        else if(j == 3) System.out.println("third");
                        found = true;
                        break;
                    }
                    else{
                        
                    }
                }
                if(found == false) System.out.println("invalid");
            }
        }
    }
    static boolean root(String[] arr){
        int[] a = new int[arr.length];
        for(int i = 1; i<arr.length; i++){
            a[i-1] = s.indexOf(arr[i]) - s.indexOf(arr[i-1]);
        }
        a[arr.length-1] = s.indexOf(arr[arr.length - 1]) - s.indexOf(arr[0]);
        if(a[0]==4 && a[1]==3 && a[2] == 3 && a[3] == 3) return true;
        return false;
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
