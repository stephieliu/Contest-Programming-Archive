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
public interface Vehicle {

    /**
     * @param args the command line arguments
     */
    final int x = 100;//it's possible to have a constant
    //for every liter of the fuel any cars can travel 100 km
    public int mileage();
    public boolean isCarPlay();
    //in an interface you cannot have a method with body
    //you cannot have instance variables
    //you can't have a constructor
    
}
