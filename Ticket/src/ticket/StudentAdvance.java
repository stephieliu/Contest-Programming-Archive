/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

/**
 *
 * @author stephie
 */
public class StudentAdvance extends Advance{
    public StudentAdvance(int day){
        super(day);
    }
    public String toString(){
        return super.toString()
                +"A student ID is required for this ticket.";
    }
    public double getPrice(){
        return super.getPrice()/2;
    }
} // end class StudentAdvance
