/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package natrij;

/**
 *
 * @author steph
 */
import java.util.*; import java.io.*;
import java.text.SimpleDateFormat;
public class Natrij {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        String  []start = next().split(":");
        int H = Integer.parseInt(start[0]), M = Integer.parseInt(start[1]), S = Integer.parseInt(start[2]);
        String [] end = next().split(":");
        int H1 = Integer.parseInt(end[0]), M1 = Integer.parseInt(end[1]), S1 = Integer.parseInt(end[2]);
        int stime = H*60*60+M*60+S;
        int etime = H1*60*60+M1*60+S1;
        if(etime<stime){
            etime += 86400;
        }
        int diff = etime - stime;
        //System.out.println(diff+"\n"+etime+"\n"+stime);
//        int hours = diff/3600;
//        double hour = (double)diff/(double)3600;
//        int mins = (int)(hour*60);
//        double min = hour*60-mins;
//        int secs = (int)(min*60);
        Date d = new Date(diff * 1000L);
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss"); // HH for 0-23
        df.setTimeZone(TimeZone.getTimeZone("GMT"));
        String time = df.format(d);
        if(time.equals("00:00:00")){
            System.out.println("24:00:00");
        }
        else System.out.println(time);
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
