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
public class Point {
    
    /**
     * @param args the command line arguments
     */
    //The instance variables
    private int intX, intY;//the x and y coordinates of the Point Object
    //the constructor of the point object
    public Point(int X, int Y){
        intX = X;
        intY = Y;
    }
    
    public Point(){
        intX = 0;
        intY = 0;
    }
    
    //the get and set ethods
    //the get methods are known as accesor methods and the set methods are
    //known as mutator methods
    public void setX(int x){
        intX = x;        
    }
    public void setY(int y){
        intY = y;
    }
    
    //the get methods
    public int getX(){
        return intX;
    }
    public int getY(){
        return intY;
    }
    /**
     * @Override --> tells that this method exists somewhere but it is 
     * being overwritten (do this method instead of the preexisting one)
     * @return 
     */
    public String toString(){
        return "x: "+ intX+" y: "+intY;
    }
    //finding the distance between two points
    public double distance(Point p){
        double xdiff = p.intX - this.intX;
        //this - will access the point object within the class
        double ydiff = p.intY-this.intY;
        //formula for distance between two points
        return Math.sqrt(xdiff*xdiff+ydiff*ydiff);
    }
    public void translate(int dx, int dy){
        intX+=dx;
        intY+=dy;
    }
}
