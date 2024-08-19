/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;

/**
 *
 * @author steph
 */
public class Advance extends Ticket{
    int advanced;
    public Advance(int day){
        //super(); is not necessary here, it is only necessary if
        //your parent constructor takes the same parameters
        
        advanced = day;
    }
    public double getPrice(){
        if(advanced>=10)return 30.0;
        else return 40.0;
    }   
} // end class Advance