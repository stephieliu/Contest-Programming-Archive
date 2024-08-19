/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingatthesametime;

/**
 *
 * @author Stephie
 */
import java.util.*;
public final class MovingAtTheSameTime{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i<5; i++){
            //create a list
            //num and pos lists
            //if the add the value of num to pos to get the next poition each
            //time
            //move the num to the pos calculated
            //if the pos it empty, simply place num there
            //else add the num there with this num
            String s = input.nextLine();
            System.out.println(s);
            List <Integer> pos = new ArrayList(), num = new ArrayList();
            for(int j = 0; j<s.length(); j++){
                if(s.charAt(j)!='.'){
                    num.add(s.charAt(j)-'0');
                    pos.add(j);
                }
            }
            for(int y = 0; y<4; y++){
                int [] board = new int [s.length()];
                Arrays.fill(board, -1);
                for(int j = 0; j<num.size(); j++){
                    int newpos = num.get(j)+ pos.get(j);
                    if(newpos<board.length){
                        if(board[newpos]== -1){
                            board[newpos]=num.get(j);
                        }
                        else{
                            board[newpos] +=num.get(j);
                        }
                    }
                    pos.set(j, newpos);
                }
                for(int j = 0; j<board.length; j++){
                    if(board[j]==-1){
                        System.out.print(".");
                        
                    }
                    else{
                        System.out.print(board[j]);
                    }
                }
                System.out.println();
            }
        }
    }

}
