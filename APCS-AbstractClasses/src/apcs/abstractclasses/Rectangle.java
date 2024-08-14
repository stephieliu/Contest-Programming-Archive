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
public class Rectangle extends APCSAbstractClasses{
    int intLength;
    int intWidth;
    
    //the constructor for the Rectangle class
    public Rectangle (String str1, int n, int l, int w){
        super(str1, n);
        intLength = l;
        intWidth = w;
        //every abstract method from the abstract class must be implemented
        //in the child class that derives it
    }
    public double getArea (){
        return intLength*intWidth;
    }
    public double getPerimeter(){
        return 2*(intLength+intWidth);
    }
}
