/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class PointTester {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        // recall declaring an integer array
        int [] intArr1 = new int [5];
        //Declaring a point object
        Point p1 = new Point(10, 20);
        // we can access the attributes and the mthod of an object using a 
        //dot operator
        p1.setX(12);
        p1.setY(20);
        //let's print the details of p1
        System.out.println("x: "+p1.getX()+" y: "+p1.getY());
        //the toString method
        System.out.println("Point: "+p1.toString());
        //this will print the location of the stored variables, like an
        //array
        Point p2 = new Point(23, 45);
        System.out.println(p2);//it will print 23 45 because it is like an
        //arraylist so it will call the toString() method by default
        Point p3 = new Point(0,0);
        Point p4 = new Point(3,4);
        System.out.println(p3.distance(p4));
        //Point object array
        Point [] pArray = new Point[5];
        //point object arraylist
        ArrayList<Point> pList = new ArrayList<Point>();
        for(int i = 0; i<5; i++){
            int x = input.nextInt();
            int y = input.nextInt();
            Point p = new Point (x,y);
            pArray[i] = p;//storing the reference to the object
            pList.add(p);
        }
        //print all the points in the array and the arraylist
        for(int j = 0; j<5; j++){
            System.out.println(pArray[j]);
            System.out.println(pList.get(j));
        }
        
        //read four vertices of a polygon and store that in an arraylist
        //determine whether the vertices create a square
        /**
         * 0 0
         * 4 0
         * 4 4
         * 0 4
         */
        ArrayList<Point> List = new ArrayList<Point>();
        double [] distance = new double [4];
        for(int i = 0; i<4; i++){
            int x = input.nextInt();
            int y = input.nextInt();
            Point P = new Point (x,y);
            List.add(P);
        }
        int index = 0;
        for(int i = 0; i<4; i++){
            for(int j = i+1; j<4; j++){
                distance[index] = List.get(i).distance(List.get(j));
            }
            index++;
        }
        boolean square = true;
        for(int k = 0; k<4; k++){
            System.out.println(distance[k]);
        }
        if(square == true){
            System.out.println("is a square");
        }
        else System.out.println("not a square");
    }
}
