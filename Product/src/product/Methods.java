/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

/**
 *
 * @author Stephie
 */
public class Methods implements Product{
    double currentPrice;//the current price of the car
    double addprice;//the price to be added
    public Methods(double x, double y){
        currentPrice = x;
        addprice = y;
    }
    public double getPrice(){
        return currentPrice;
    }
    public void changePrice(){
        currentPrice+=addprice;
    }
}
