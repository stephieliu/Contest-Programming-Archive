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
public abstract class APCSAbstractClasses {
    //we can have instance variables for an abstract class
    String strName; //the name of the shape
    int intNSides; //number of sides

    //an abstract class can have a constructor
    public APCSAbstractClasses(String str1, int n){
        strName = str1;
        intNSides = n;
    }
    //abstract methods
    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString(){
        return "Name: "+strName+" sides "+intNSides;
    }
}
