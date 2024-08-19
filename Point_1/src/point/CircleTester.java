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
public class CircleTester {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        //declaring a circle onject
        Circle c1 = new Circle(12,13,10);
        System.out.println(c1.toString());
        //if there is no method defined in the child class
        //then it will look at the method from the parent class
        Point p1 = new Circle(12,13,10);//circle is a point but points
        //are not always circles
        System.out.println(p1.toString());
        
    }
}
