/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customizedcomparatornotes;

/**
 *
 * @author steph
 * 
 */
import java.util.*;
import java.io.*;
public class CustomizedComparatorNotes {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        //primitive type: int, long, float, double
        //reference type: objects (methods are built-in, can
        //create new methods)
        Student A = new Student("Alice", 10, 15, 92.5);
//        A.name = "Alice";
//        A.grade = 10;
//        A.age = 15;
//        A.score = 92.5;
        Student B = new Student("Bob", 11, 16, 89.5);
//        B.name = "Bob";
//        B.grade = 11;
//        B.age = 16;
//        B.score = 89.5;
    }
    static class cmp implements Comparator<Student>{
        public int compare(Student a, Student b){
            if(a.grade!=b.grade) return -Integer.compare(a.grade, b.grade);
            else return Integer.compare(a.age, b.age);
        }
    }
    static class Student{
        String name;
        int grade, age;
        double score;
        Student(){}
        Student(String name, int grade, int age, double score){
            this.name = name; //"this.name = name" means that 
            //the global variable.name = local variable.name
            this.grade = grade;
            this.age = age;
            this.score = score;
        }//this is function overload; more than one function has 
        //the same name "Student"
        public String toString(){
            return name+" "+grade+" "+age+" "+score;
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
