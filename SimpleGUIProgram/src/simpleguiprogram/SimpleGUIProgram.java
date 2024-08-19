/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleguiprogram;

/**
 *
 * @author steph
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class SimpleGUIProgram extends JFrame implements ActionListener{
    JButton b;
    boolean flag;
    
    public SimpleGUIProgram(){
        this.setTitle("First Frame");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(200, 200);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.yellow);
        
        b = new JButton("Click me!");
        b.addActionListener(this);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(b);
        c.setLayout(new BorderLayout());
        c.add(b, BorderLayout.WEST);
        c.setLayout(new GridLayout(2, 3, 5, 10));
        b.setSize(85, 50);
        b.setLocation(175, 75);
        c.add(b);
    }
    public static void main(String[] args){
        new SimpleGUIProgram();
    }
    public void paint(Graphics g){
        super.paint(g);
        g.drawString("JFrame creates Frames!", 200, 200);
    }
    public void actionPerformed(ActionEvent evt){
        if(flag){
            getContentPane().setBackground(Color.blue);
            flag = false;
        }
        else{
            getContentPane().setBackground(Color.yellow);
            flag = true;
        }
        repaint();
    }
}
//public class SimpleGUIProgram {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        
//    }
//    
//}
