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
public class Circle extends Point{
    int intR;//the radius of the circle
    //circle class constructor
    
    public Circle (int x, int y, int r){
        //calling the parent class constructor
        super(x,y);
        intR = r;
        
    }
   //if there is no construtor specified in the child class, it will
    //automatically call the constructor without parameters in the parent
    //class
    public String toString(){
        //we can call the method toStirng from the parent class here
        return super.toString()+" r: "+intR;
    }
}
