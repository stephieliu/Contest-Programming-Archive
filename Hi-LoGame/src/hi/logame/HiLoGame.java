/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hi.logame;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class HiLoGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = 1;
        int max = 100;
        int tries=0;
        do{
          int random = (int) (Math.floor(Math.random()*(max-min+1))+min);
          int compare = input.nextInt();
          if(compare<random){
              System.out.println("LO");
          }
          else if(compare==random){
              System.out.println("Do you want to play again?");
              String answer = input.nextLine();
              if(answer.equals ("No"))
                  break;
              if(answer.equals("Yes")){
                  compare = input.nextInt();
              }
            }
            else{
                System.out.println("HI");
            }
            tries = tries+1;

          } 
        while(tries<=6);

        
        
    }
    
}
