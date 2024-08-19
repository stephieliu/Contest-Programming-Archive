/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching.algorithm;
//BINARY SEARCH EXAMPLE
/** 
*
 * @author Stephie
 */
public class SearchingAlgorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] Number = {3,7,11,28,31,37,45,68,83,84};
        int lower = 0;
        int upper = Number.length-1;
        int middle;
        boolean found = false;
        int location = -1;
        int searchTerm = 11;
        
        for(int i = 0; i<10; i++){
            System.out.print(Number[i]+" ");
        }
        while(!found && upper>=lower){
            middle = (lower+upper)/2;
            if(Number[middle]==searchTerm){
                location = middle;
                found=true;
            }
            else if(Number[middle]<searchTerm){
                lower=middle+1;
            }
            else{
                upper = middle-1;
            }
        }
        if(location>=0){
            System.out.println(searchTerm+" found in "+location);
        }
        else{
            System.out.println(searchTerm+" not found");
        }
    }   
}
