/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paradox;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class Paradox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int C = input.nextInt();
        Set<String> bool = new TreeSet<>();
        for(int i = 0; i<C; i++){
            int command = input.nextInt();
            if(command==1){
                String element = input.next();
                if(!bool.contains(element)){
                    System.out.println("true");
                    bool.add(element);
                }
                else{
                    System.out.println("false");
                    bool.add(element);
                }
            }
            else if(command==2){
                String element = input.next();
                if(bool.contains(element)){
                    System.out.println("true");
                        bool.remove(element);
                }
                else{
                    System.out.println("false");
                }
            }
            else if(command==3){
                String element = input.next();
                if(bool.contains(element)){
                    for(int j = 0; j<bool.size(); j++){
                        if(bool.toArray()[j]==element){
                            System.out.println(j);
                        }                      
                    }
                }
                else{
                    System.out.println("-1");
                }
            }
            else{
                for(int j = 0; j<bool.size(); j++){
                    System.out.print(bool.toArray()[j]+" ");
                }
            }
        }
    }
    
}
