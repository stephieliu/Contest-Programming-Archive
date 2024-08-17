/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatcalculator;

/**
 *
 * @author steph
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Main extends JFrame implements ActionListener{

    JTextField inFat = new JTextField(7);
    JTextField inCal = new JTextField(7);
    JTextField outPer = new JTextField(7);
    
    int calories, fatGrams;
    double percent;
    
    public Main() {
        this.setTitle("Calories from Fat");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(280, 250);
        
        JLabel title = new JLabel("Percent of Calories from Fat");
        JLabel fatLabel = new JLabel("Enter grams of fat:");
        JLabel calLabel = new JLabel("Enter total calories:");
        JLabel perLabel = new JLabel("Percent calories from fat:");
        JButton calc = new JButton("Calculate...");
        
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        
        c.add(title);
        c.add(fatLabel);
        c.add(inFat);
        c.add(calLabel);
        c.add(inCal);
        c.add(perLabel);
        c.add(outPer);
        outPer.setEditable(false);//makes an output box uneditable
        c.add(calc);
        
        calc.addActionListener(this);
        this.setVisible(true);
    }
    private void calcPercent(){
        percent = ((fatGrams*9.0)/calories)*100.0;
    }
    public void actionPerformed(ActionEvent evt){
        fatGrams = Integer.parseInt(inFat.getText());
        calories = Integer.parseInt(inCal.getText());
        
        calcPercent();
        
        outPer.setText(percent+" ");
        repaint();
    }
    public static void main(String args[]) {
        new Main();
    }             
}
