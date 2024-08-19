/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication395;

/**
 *
 * @author steph
 */
import java.awt.*;
import java.awt.event.*;
public class secondObject extends Rectangle{
    
    public int yVelocity;//falling speed
    public static int BALL_DIAMETER = 20; //size of ball
    
    //constructor creates ball at given location with given dimensions
    public secondObject(int x) {
        super(x, -1*BALL_DIAMETER, BALL_DIAMETER, BALL_DIAMETER);
        yVelocity = 1;
    }
    public void move() {
        y = y + yVelocity;
    }
    public void draw(Graphics g){
        g.setColor(Color.green);
        g.fillOval(x, y, BALL_DIAMETER, BALL_DIAMETER);
    }
}
