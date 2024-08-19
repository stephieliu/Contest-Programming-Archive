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
public class TestingMenuItem {
    public static void main (String []args){
        Scanner input = new Scanner(System.in);
        Sandwich s1 = new Sandwich("Cheeseburger", 3.99);
        Salad s2 = new Salad ("Coleslaw Salad", 2.99);
        Drink d1 = new Drink ("Orange Soda", 5.99);
        Trial t1 = new Trial (s1, s2, d1);
        System.out.println(t1.getName());
        System.out.println(t1.getPrice());
    }
}
