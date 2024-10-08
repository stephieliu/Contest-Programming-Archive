/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccc2021p3;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;

public class Ccc2021p3 {

    static int n, p[], w[], d[];

    public static void main(String[] args) throws IOException {
        n = readInt();
        p = new int[n];
        w = new int[n];
        d = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = readInt();
            w[i] = readInt();
            d[i] = readInt();
        }
        int left = 0, right = (int) 1e9 + 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (cost(mid) < cost(mid + 1)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(cost(left));
    }

    static long cost(int x) {
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if (x < p[i] - d[i]) {
                ans += ((long) (p[i] - d[i]) - x) * w[i];
            }
            if (x > p[i] + d[i]) {
                ans += (long) (x - (p[i] + d[i])) * w[i];
            }
        }
        return ans;
    }
    private static final int BUFFER_SIZE = 1 << 16;
    private static final InputStream in = System.in;
    private static final byte[] buffer = new byte[BUFFER_SIZE];
    private static int bufferPointer = 0, bytesRead = 0;
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static String read() throws IOException {
        byte[] ret = new byte[1024];
        int idx = 0;
        byte c = Read();
        while (c <= ' ') {
            c = Read();
        }
        do {
            ret[idx++] = c;
            c = Read();
        } while (c != -1 && c != ' ' && c != '\n' && c != '\r');
        return new String(ret, 0, idx);
    }

    public static String readLine() throws IOException {
        final StringBuilder sb = new StringBuilder(1024);
        byte c = Read();
        while (c == '\n' || c == '\r') {
            c = Read();
        }
        do {
            sb.append((char) c);
            c = Read();
        } while (c != -1 && c != '\n' && c != '\r');
        return sb.toString();
    }

    public static char readChar() throws IOException {
        byte c = Read();
        while (Character.isWhitespace(c)) {
            c = Read();
        }
        return (char) c;
    }

    private static char[] readCharArray(final int chars) throws IOException {
        final char[] arr = new char[chars];
        for (int i = 0; i < chars; i++) {
            arr[i] = readChar();
        }
        return arr;
    }

    public static java.math.BigInteger readBigInteger() throws IOException {
        return new java.math.BigInteger(read());
    }

    public static java.math.BigDecimal readBigDecimal() throws IOException {
        return new java.math.BigDecimal(read());
    }

    public static byte readByte() throws IOException {
        byte ret = 0;
        byte c = Read();
        while (c <= ' ') {
            c = Read();
        }
        boolean neg = (c == '-');
        if (neg) {
            c = Read();
        }
        do {
            ret = (byte) (ret * 10 + c - '0');
        } while ((c = Read()) >= '0' && c <= '9');
        if (neg) {
            return (byte) -ret;
        }
        return ret;
    }

    public static byte[] readByteArray(final int numbers) throws IOException {
        final byte[] arr = new byte[numbers];
        for (int i = 0; i < numbers; i++) {
            arr[i] = readByte();
        }
        return arr;
    }

    public static short readShort() throws IOException {
        short ret = 0;
        byte c = Read();
        while (c <= ' ') {
            c = Read();
        }
        boolean neg = (c == '-');
        if (neg) {
            c = Read();
        }
        do {
            ret = (short) (ret * 10 + c - '0');
        } while ((c = Read()) >= '0' && c <= '9');
        if (neg) {
            return (short) -ret;
        }
        return ret;
    }

    public static short[] readShortArray(final int numbers) throws IOException {
        final short[] arr = new short[numbers];
        for (int i = 0; i < numbers; i++) {
            arr[i] = readShort();
        }
        return arr;
    }

    public static int readInt() throws IOException {
        int ret = 0;
        byte c = Read();
        while (c <= ' ') {
            c = Read();
        }
        boolean neg = (c == '-');
        if (neg) {
            c = Read();
        }
        do {
            ret = ret * 10 + c - '0';
        } while ((c = Read()) >= '0' && c <= '9');
        if (neg) {
            return -ret;
        }
        return ret;
    }

    public static int[] readIntArray(final int numbers) throws IOException {
        final int[] arr = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            arr[i] = readInt();
        }
        return arr;
    }

    public static long readLong() throws IOException {
        long ret = 0;
        byte c = Read();
        while (c <= ' ') {
            c = Read();
        }
        boolean neg = (c == '-');
        if (neg) {
            c = Read();
        }
        do {
            ret = ret * 10 + c - '0';
        } while ((c = Read()) >= '0' && c <= '9');
        if (neg) {
            return -ret;
        }
        return ret;
    }

    public static long[] readLongArray(final int numbers) throws IOException {
        final long[] arr = new long[numbers];
        for (int i = 0; i < numbers; i++) {
            arr[i] = readLong();
        }
        return arr;
    }

    public static double readDouble() throws IOException {
        double ret = 0, div = 1;
        byte c = Read();
        while (c <= ' ') {
            c = Read();
        }
        boolean neg = (c == '-');
        if (neg) {
            c = Read();
        }
        do {
            ret = ret * 10 + c - '0';
        } while ((c = Read()) >= '0' && c <= '9');
        if (c == '.') {
            while ((c = Read()) >= '0' && c <= '9') {
                ret += (c - '0') / (div *= 10);
            }
        }
        if (neg) {
            return -ret;
        }
        return ret;
    }

    public static double[] readDoubleArray(final int numbers) throws IOException {
        final double[] arr = new double[numbers];
        for (int i = 0; i < numbers; i++) {
            arr[i] = readDouble();
        }
        return arr;
    }

    private static void fillBuffer() throws IOException {
        bytesRead = in.read(buffer, bufferPointer = 0, BUFFER_SIZE);
        if (bytesRead == -1) {
            buffer[0] = -1;
        }
    }

    private static byte Read() throws IOException {
        if (bufferPointer == bytesRead) {
            fillBuffer();
        }
        return buffer[bufferPointer++];
    }

    static void print(Object o) {
        pr.print(o);
    }

    static void println(Object o) {
        pr.println(o);
    }

    static void flush() {
        pr.flush();
    }

    static void println() {
        pr.println();
    }

    static void exit() throws IOException {
        in.close();
        pr.close();
        System.exit(0);
    }
}
