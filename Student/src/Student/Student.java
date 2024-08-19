/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author Stephie
 */
public class Student{
    String name;
    int age;
    Student(String name, int age){
        //constructor
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args){
        Student student_x = new Student("Bob", 12);
        
        
        System.out.println("Student "+student_x.name+" is "
               +student_x.age+" years old.");
    }
}
