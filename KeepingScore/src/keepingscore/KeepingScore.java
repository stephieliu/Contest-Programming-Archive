/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keepingscore;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class KeepingScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cards = input.next();
        String valueC = "",valueD = "", valueH = "", valueS = "";
        String[] clubs = cards.split("C");
        String[] diamonds = clubs[1].split("D");
            if(diamonds.length!=0){
                valueC = diamonds[0];
            }
        String[] hearts = diamonds[1].split("H");
            if(hearts.length!=0){
                valueD = hearts[0];
            }
        String[] spades = hearts[1].split("S");
            if(spades.length!=0){
                valueH = spades[0];
                valueS = spades[1];
            }
        int pointsC = 0;
        int pointsD = 0;
        int pointsH = 0;
        int pointsS = 0;
        System.out.println("Cards Dealt              Points");
        //clubs
        System.out.print("Clubs ");
        switch (valueC.length()) {
            case 0:
                pointsC+=3;
                break;
            case 1:
                pointsC+=2;
                break;
            case 2:
                pointsC+=1;
                break;
            default:
                break;
        }
        for(int i = 0; i<valueC.length(); i++){
            System.out.print(valueC.charAt(i)+" ");
            switch (valueC.charAt(i)) {
                case 'A':
                    pointsC+=4;
                    break;
                case 'K':
                    pointsC+=3;
                    break;
                case 'Q':
                    pointsC+=2;
                    break;
                case 'J':
                    pointsC+=1;
                    break;
                default:
                    break;
            }
        }
        System.out.print("            "+pointsC+"\n");
        //Diamonds
        System.out.print("Diamonds ");
        switch (valueD.length()) {
            case 0:
                pointsD+=3;
                break;
            case 1:
                pointsD+=2;
                break;
            case 2:
                pointsD+=1;
                break;
            default:
                break;
        }
        for(int i = 0; i<valueD.length(); i++){
            System.out.print(valueD.charAt(i)+" ");
            switch (valueD.charAt(i)) {
                case 'A':
                    pointsD+=4;
                    break;
                case 'K':
                    pointsD+=3;
                    break;
                case 'Q':
                    pointsD+=2;
                    break;
                case 'J':
                    pointsD+=1;
                    break;
                default:
                    break;
            }
        }
        System.out.print("            "+pointsD+"\n");
        //Hearts
        System.out.print("Hearts ");
        switch (valueH.length()) {
            case 0:
                pointsH+=3;
                break;
            case 1:
                pointsH+=2;
                break;
            case 2:
                pointsH+=1;
                break;
            default:
                break;
        }
        for(int i = 0; i<valueH.length(); i++){
            System.out.print(valueH.charAt(i)+" ");
            switch (valueH.charAt(i)) {
                case 'A':
                    pointsH+=4;
                    break;
                case 'K':
                    pointsH+=3;
                    break;
                case 'Q':
                    pointsH+=2;
                    break;
                case 'J':
                    pointsH+=1;
                    break;
                default:
                    break;
            }
        }
        System.out.print("            "+pointsH+"\n");
        //Spades
        System.out.print("Spades ");
        switch (valueS.length()) {
            case 0:
                pointsS+=3;
                break;
            case 1:
                pointsS+=2;
                break;
            case 2:
                pointsS+=1;
                break;
            default:
                break;
        }
        for(int i = 0; i<valueS.length(); i++){
            System.out.print(valueS.charAt(i)+" ");
            switch (valueS.charAt(i)) {
                case 'A':
                    pointsS+=4;
                    break;
                case 'K':
                    pointsS+=3;
                    break;
                case 'Q':
                    pointsS+=2;
                    break;
                case 'J':
                    pointsS+=1;
                    break;
                default:
                    break;
            }
        }
        System.out.print("            "+pointsS+"\n");
        int total = pointsC+pointsD+pointsH+pointsS;
        System.out.print("                       Total "+total);
    }
    
}
