/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;
import java.util.*;
/**
 *
 * @author Stephie
 */
public class VehicleTester {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
//        Vehicle v1 = new Vehicle();
        //we cannot create an instance of an interface
        SUV s1 = new SUV("Toyota",2019, 100);
        System.out.println(s1.mileage());
        System.out.println(s1.isCarPlay());
        Vehicle V2 = new SUV("Nissan", 2020, 50);
        System.out.println(V2.mileage());
        System.out.println(V2.isCarPlay());
    }
}
