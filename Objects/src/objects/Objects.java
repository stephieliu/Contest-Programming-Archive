/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Objects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Student a = new Student();
//        Student b = new Student("Bob");
//        Student c = new Student("Calvin", 15, 10, 2.5);
//        System.out.println(c);
        Student arr[] = new Student[4];
        for(int i = 0; i<arr.length; i++){
            arr[i] = new Student(input.next(), input.nextInt(), input.nextInt(), input.nextDouble());
        }
        Arrays.sort(arr, new StudentComparator());
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    static class Student {
        String name, gender;
        int age, grade;
        double score;
        Student(){};
        Student (String s){name = s;};
        Student (String s, int a, int g, double avg){name = s; age = a; grade = g; score = avg;};
        public String toString(){return name +" "+ age+" "+grade+" "+score;}
    }
    //sort by grade in ascending order
    //if the grade is the same, sort score in descending order
    static class StudentComparator implements Comparator<Student>{
        public int compare(Student a, Student b){
            if(a.grade!= b.grade){
                return Integer.compare(a.grade, b.grade);
                //to get opposite (descending) order, put a negative sign in front of the
                //Integer.compare
            }
            else{
                return -Double.compare(a.score, b.score);
            }
        }
    }
}

/*
Alice 15 10 89.3
Bob 15 11 92.2
Calvin 16 10 90.5
Derek 10 12 91.7
*/

