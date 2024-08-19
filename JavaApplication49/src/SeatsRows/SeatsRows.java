/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeatsRows;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
public class SeatsRows {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Row;
        int seat;
        Scanner input = new Scanner(System.in);
        boolean found = false;
        System.out.print("Please enter the row (from A to N): ");
        Row = input.nextLine();
        System.out.print("Please enter the seat number(from 1 to 17):");
        seat = input.nextInt();
        
        if("A".equals(Row) || "B".equals(Row) || "C".equals(Row) 
                || "F".equals(Row) || "G".equals(Row) || "H".equals(Row) 
                || "I".equals (Row)|| "K".equals(Row)|| "L".equals(Row)){
            System.out.println("Available");
            found = true;
        }
        else if("D".equals(Row)){
            if(seat == 11 || seat == 10 || seat == 4 
                || seat == 3){
                System.out.println("Wheelchair accessible");
            }
            else if(seat == 12 || seat == 9 || seat == 5 
                || seat == 2){
                System.out.println("Companion");
            }
            found = true;
        }
        else{ 
            if("E".equals(Row) && seat == 13 || seat == 12 
                || seat == 11 || seat == 10 || seat == 3 
                || seat == 2 || seat == 1){
                System.out.println("Unavailable");
            }
            else if("J".equals(Row) && seat == 12 || seat == 11 
                    || seat == 10 || seat == 9 || seat == 8){
                System.out.println("Unavailable");
            }
            else if("M".equals(Row) && seat == 10 || seat == 9){
                System.out.println("Unavailable");
            }
            else if("N".equals(Row) && seat == 15 || seat == 14 
                    || seat == 13 || seat == 12 || seat == 11
                    || seat == 10 || seat == 9 || seat == 8 || seat == 7){
                System.out.println("Unavailable");
            }
            else{
                System.out.println("Available");
            }
            found = true;
        }
        if(!found){
            System.out.println("Not a valid seat");
        }
    }
}