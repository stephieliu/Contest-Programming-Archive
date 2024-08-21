/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uncertaintycalculator;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class UncertaintyCalculator {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static double uMultiplyDivide(double a, double au, double b, double bu){
        double z = a/b;
        double inside = Math.pow(au/a, 2) + Math.pow(bu/b, 2);
        return z * Math.sqrt(inside);
    }
    
    public static double uAddSubtract(double au, double bu){
        double inside = Math.pow(bu, 2)+Math.pow(au, 2);
        return Math.sqrt(inside);
    }
    
    public static double uPower(double base, double ub, double n) {
        return Math.abs(n)*(Math.pow(base, n-1))*ub;
    }
    
    public static void velocity(double t, double d, double ut){
        double v = d/t;
        System.out.println(v);
        System.out.println(uMultiplyDivide(t, ut, d, 0.07));
    }
    
    public static double velo(double t, double d, double ut){
        double v = d/t;
        //System.out.println(v);//velocity
        //System.out.println(uMultiplyDivide(t, ut, d, 0.07));//uncertainty
        return v;
    }
    
    public static double uncVelo(double t, double d, double ut){
        double unc = uMultiplyDivide(t, ut, d, 0.07);
        return unc;
    }
    
    public static void main(String[] args) throws IOException {
//        double a1 = 100*(344.732 - 328.902);
//        double n1 = uAddSubtract(0.303, 4.3919)*100;
//        System.out.println(uMultiplyDivide(a1, n1, 344.732, 0.303));
//        System.out.println(a1/344.732);
        
//        double exp = 5.674;
//        double expu = 1.183007418;
//        double thr = 5.580688088;
//        double thru = 0.002042007755;
//        double n1 = 100*Math.abs(exp - thr);// exp - true
//        double n1u = 100* uAddSubtract(expu, thru);
//        System.out.println(uMultiplyDivide(n1, n1u, thr, thru));
//        System.out.println(n1/thr);
        
//        double m = 0.2505 + 0.3663;
//        double mu = 0.1414213562;
//        double a = 3.980058366;
//        double au = 0.00183226392;
//        System.out.println(uMultiplyDivide(m, mu, a, au));
        
        double frequ = 0.284372224;
        double r = 0.05;
        System.out.println(r*60*Math.pow(Math.PI, 2)*frequ);
        
//        double a1 = 9.8*150.8;
//        double a1u = 9.8*0.1;
//        double a2 = 265.3+150.8;
//        double a2u = uAddSubtract(0.1, 0.1);
//        
//        System.out.println(uMultiplyDivide(a1, a1u, a2, a2u));
//        for(int i = 0; i<131; i++){
//            System.out.print(0+", ");
//        }
//        System.out.print(0);
//        System.out.println(0.606*0.5);
//        System.out.println(uMultiplyDivide(4, 0, 16.5885, 0.2269));
//        System.out.println(4*16.5885);
//        System.out.println(uAddSubtract(0.0004065411, 0.0005645787));
//        System.out.println((3.01/2.99)-1);
//        System.out.println(uMultiplyDivide((3.01/2.99)-1, 0.004745656376639916, 108.2329317, 4.717215969));
//        //calculate time uncertainties
//        double[] time = new double[15];
//        double[] time1;
//        double t1 = 0;
//        for(int i = 0; i<14; i++){
//            time[i] = uAddSubtract((t1+0.100)*0.03, t1*0.03);
//            t1+=0.100;
//        }
//        double [] hfT = new double[12];
//        double counter = 0.05;
//        for(int i = 0; i<12; i++){
//            hfT[i] = counter;
//            counter += 0.1;
//        }
////        //uncertainties for halftime
//        double [] halftime = new double[12];
//        double count1 = 0.05;
//        for(int i = 0; i<12; i++){
//            halftime[i] = count1 * 0.03;
//            count1 +=0.1;
//        }
//        //System.out.println(Arrays.toString(halftime));
//        //System.out.println(Arrays.toString(time));
////        //constant acceleration
//        double[] displacement1 = {0.58, 0.69, 0.88, 0.99, 1.19, 1.37, 1.38, 1.51, 1.71, 1.85, 1.87, 2.08};
//        double [] displacement = {5.75, 6.07, 6.03, 5.97, 5.93, 5.88, 5.74, 5.64,
//            5.57, 5.52, 5.65, 5.45, 5.22, 5.13};//constant velocity
////        System.out.println("Time: ");
////        double t = readDouble();
////        System.out.println("Index for Time Uncertainty: ");
////        int index = readInt();
////        System.out.println("Displacement: ");
////        double d = readDouble();
////        velocity(t, d, time[index-1]);
//        
////        for(int i = 0; i<14; i++){
////            double t = 0.100;//time
////            double d = displacement[i];
////            velocity(t, d, time[i]);
////        }
//        double[] vc = new double[12];//velocities of acceleration
//        for(int i = 0; i<12; i++){
//            double t = 0.100;//time
//            double d = displacement1[i];
//            vc[i] = velo(t,d,time[i]);
//            //System.out.println(vc[i]);
//        }
//        double h = 0.1;
////        //find area of trapezoids:
//        double sum = 0.0;
//        double[] area = new double[11];
//        for(int i = 0; i<11; i++){
//            area[i] = ((vc[i] + vc[i+1])/2.0)*h;
//            sum+=area[i];
//            //System.out.println(area[i]);
//        }
//        //System.out.println(sum);
//
//        double [] uncertainty = new double[12];//uncertainties of acceleration
//        for(int i = 0; i<12; i++){
//            uncertainty[i] = uncVelo(0.100, displacement1[i],time[i]);
//        }
////        //find uncertainty of area:
//        double uncF = 0.0;//final uncertainty
//        double [] uncArr = new double[11];
//        for(int i = 0; i<11; i++){
//            double unc1 = uAddSubtract(uncertainty[i], uncertainty[i+1]);//a+b uncertainty
//            double unc2 = uMultiplyDivide(area[i], unc1, 0.100, uAddSubtract(halftime[i+1], halftime[i]));//(a+b)*h
//            uncArr [i] = unc2/2.0;//(a+b)*h/2
//        }
//        for(double d: uncArr){
//            uncF += d;
//        }
//        System.out.println(uncF);
//        
//        System.out.println(uMultiplyDivide(31.114, 0.3660, 1.324, 0.0891));
//        System.out.println((2*0.9051)/9.81);
//        System.out.println(2*uMultiplyDivide(0.905075, 0.0006982, 9.81, 0.05));
//        System.out.println(uPower((2*0.905075)/9.81, 2*uMultiplyDivide(0.905075, 0.0006982, 9.81, 0.05), 0.5));
//
//        System.out.println(0.31114/0.4296);
//        System.out.println(uMultiplyDivide(0.31114, 0.003660, 0.4296, 0.001107));
//        System.out.println(uPower((Math.pow(20.01114468, 2)+Math.pow(82.3350, 2)), uAddSubtract(uPower(20.01114468, 2.818788196, 2), uPower(82.3350, 2.3683, 2)), 0.5));
//        System.out.println(Math.sqrt(Math.pow(20.01114468, 2)+Math.pow(82.3350, 2)));
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