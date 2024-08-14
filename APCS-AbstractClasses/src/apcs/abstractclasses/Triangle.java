/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcs.abstractclasses;

/**
 *
 * @author Stephie
 */
public class Triangle extends APCSAbstractClasses{
    int side1;
    int side2;
    int side3;
    public Triangle(String str1, int n, int l, int w, int y){
        super(str1, n);
        side1 = l;
        side2 = w;
        side3 = y;
    }
    public double getArea (){
        int s = (side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }
    //overriding the toString method
    public String toString(){
        return super.toString()+" S1: "+side1+" S2: "+side2+" S3: "+side3;
    }
}
