/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuitem;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Trial implements MenuItem{
    Sandwich s;
    Salad sa;
    Drink d;
    public Trial (Sandwich s, Salad sa, Drink d){
        this.s = s;
        this.sa = sa;
        this.d = d;
    }
    public String getName(){
        return s.getName()+"/"+sa.getName()+"/"+d.getName();
    }
    public double getPrice(){
        double [] dblPrice = {s.getPrice(), sa.getPrice(), d.getPrice()};
        Arrays.sort(dblPrice);
        return dblPrice[1]+dblPrice[2];
    }
    
}
