/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author Stephie
 */
public class SUV implements Vehicle {
    String strMake;//the Make of the Car
    int intYear;//the year of the make
    int intTank;//the fuel tank capacity
    
    public SUV(String s1, int y, int t){
        strMake = s1;
        intYear = y;
        intTank = t;
    }
    public int mileage(){
        return x*(intTank);
    }
    public boolean isCarPlay(){
        return true;
    }
}
