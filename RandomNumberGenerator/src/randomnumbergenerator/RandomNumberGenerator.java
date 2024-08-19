/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumbergenerator;

/**
 *
 * @author Stephie
 */
import java.util.Scanner;
import java.util.Random;
public class RandomNumberGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Press ENTER to start your dice roll: ");
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String x = input.nextLine();
        int min = 1;
        int max = 6;
        int i=1;
        int random = (int) (Math.floor(Math.random()*(max-min+1))+min);
        for(;;){
          if(random!=6){
              System.out.print("You got a "+random+", press Enter to roll again!");
          }
          else {
              System.out.print("You got a 6 in"+i+"tries.");
              break;
          }
          i++;
        }
    }
    
}
