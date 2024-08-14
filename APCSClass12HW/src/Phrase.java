/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steph
 */
public class Phrase {
    private String currentPhrase;
    
    public Phrase(String p){
        currentPhrase = p;
    }
    public int findNthOccurrence (String str, int n){
        //implementation not shown
        return n;
    }
    public void replaceNthOccurrence(String str, int n, String repl){
        int find = findNthOccurrence(str, n);
        if(find!=-1){
            currentPhrase = currentPhrase.substring(0, find)+repl+currentPhrase.substring(find, str.length());
        }
    }
    public int findLastOccurrence(String str){
        int n = 1;
        while(findNthOccurrence(str, n+1)!=-1){
            n++;
        }
        return findNthOccurrence(str, n);
    }
    public String toString(){
        return currentPhrase;
    }
}
