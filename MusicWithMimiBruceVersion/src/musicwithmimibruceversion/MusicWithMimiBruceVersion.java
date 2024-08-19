/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicwithmimibruceversion;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class MusicWithMimiBruceVersion {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int T = readInt();
        String notes[] = {"C","C#","D","D#","E","F","F#","G","G#","A","A#","B","C"};
        Map<String, Integer> notemap = new HashMap<>();
        for(int c = 0; c<notes.length; c++){
            notemap.put(notes[c], c);
        }
        for(int x = 1; x<=T; x++){
            int arr[] = new int[8];
            for(int i = 0; i<4; i++){//handles the cycle --> simply copy it twice
                arr[i] = arr[i+4] = notemap.get(next());
            }
            boolean valid = true;
            int start;
            for(start = 0; start<4; start++){
                if((arr[start+1] - arr[start]+12)%12==4){
                    valid = true;
                    break;
                }
            }
            for(int i = start+1; i<start+3; i++){
                if((arr[i+1] - arr[i]+12)%12 != 3) valid = false;
            }
            if(valid){
                switch (start) {
                    case 0:
                        System.out.println("root");
                        break;
                    case 3:
                        System.out.println("first");
                        break;
                    case 2:
                        System.out.println("second");
                        break;
                    case 1:
                        System.out.println("third");
                        break;
                    default:
                        break;
                }
            }
            else{
                System.out.println("invalid");
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
