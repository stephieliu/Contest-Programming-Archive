/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/**
 *
 * @author Stephie
 */
public class Circle {

    private double radius;
    private double circumference;
    private double area;
    
    Circle(){
        this.radius = 0;
        this.area = 0;
        this.circumference = 0;
    }
    Circle(double radius, double diameter){
        this.radius = radius;
        this.area = Math.PI*Math.pow(radius, 2);
        this.circumference = Math.PI*2*radius;
    }
    void print_info(){
        System.out.println("Circle");
        System.out.println("Radius: "+ this.radius);
        System.out.println("Area"+ this.area);
        System.out.println("Circumference"+ this.circumference);
    }
}
