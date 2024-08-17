/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package degreesofseparation;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class DegreesOfSeparation {
    /**
     * @param args the command line arguments
     */
    static int V = 18;//number of original vertices
    static int E = 22;//number of edges
    static boolean [][] adjMatrix;//checking if there is a connection 
    //between 2 vertices
    public DegreesOfSeparation(int v){
        Scanner input = new Scanner(System.in);
        for(int i =0; i<V; i++){
            for(int j = 0; j<E; j++){
                adjMatrix[i][j] = input.nextBoolean();
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i<6; i++){
            String command = input.next();
            int x = input.nextInt();
            int y = input.nextInt();
            if(command.equals("i")){
                addEdge(x,y);
            }
            else if(command.equals("d")){
                removeEdge(x,y);
            }
            else if(command.equals("n")){
                friendCount(x);
            }
            else if(command.equals("f")){
                friendsOfFriends(x);
            }
            else if(command.equals("s")){
                degreeOfSeparation(x,y);
            }
        }
    } 
    public static void addEdge(int v1, int v2){
        if(v1<=V&&v2<=V){
            adjMatrix[v1][v2] = true;
            E++;
        }
    }
    public static void removeEdge(int v1, int v2){
        if(v1<=V&&v2<=V){
            adjMatrix[v1][v2] = false;
            E--;
        }
    }
    public static void friendCount(int v1){
        int friends = 0;
        if(v1<=V){
            for(int i = 0; i<E; i++){
                if(adjMatrix[v1][i]!=false){
                    friends++;
                }
            }
        }
        System.out.println(friends);
    }
    public static void friendsOfFriends(int v1){
        int fof = 0;
        for(int i = 0; i<V; i++){
            for(int j = 0; j<E; j++){
                if(adjMatrix[i][j]!=false){
                    fof++;
                }
            }
        }
        System.out.println(fof);
    }
    public static void degreeOfSeparation(int v1, int v2){
        int degree = 0;
        if(adjMatrix[v1][v2]!=false){
            degree++;
        }
        else{
            System.out.println("Not connected");
        }
        System.out.println(degree);
    }
}