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
public class Drink implements MenuItem{
    double dblPrice;
    String strName;
    public Drink(String s, double p){
        strName = s;
        dblPrice = p;
    }
    public String getName(){
        return strName;
    }
    public double getPrice(){
        return dblPrice;
    }
}
