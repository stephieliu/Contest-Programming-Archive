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
public class Salad implements MenuItem{
    double dblPrice;
    String strName;
    public Salad(String s, double p){
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
