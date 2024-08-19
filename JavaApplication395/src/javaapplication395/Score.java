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
public class Score extends Rectangle{
    public static int score;
    public static int width;
    public static int height;
    
    public Score(int width, int height){
        score = 0;
        this.width = width;
        this.height = height;
    }
    
    public void draw(Graphics g){
        g.setColor(Color.blue);
        g.setFont(new Font("Times New Roman", Font.BOLD, 40));
        g.drawString(String.valueOf(score), (int)(width*0.45), (int)(height*0.25));
    }
}
