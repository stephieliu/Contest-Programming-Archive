/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steph{
 * 
 */
import java.util.*;
public class Digits {
    private ArrayList<Integer> digitList;
    public Digits(int num){
        String s = Integer.toString(num);
        digitList = new ArrayList();
        for(int i =0; i<s.length(); i++){
            Integer temp =Integer.valueOf(s.charAt(i));
            digitList.add(temp);
        }
    }
    public boolean isStrictlyIncreasing(){
        int prev = digitList.remove(0), curr =0, size = digitList.size();
        boolean increasing =true;
        while(!digitList.isEmpty()){
            curr = digitList.remove(0);
            if(curr>prev){
                increasing = false;
                break;
            }
        }
        if(increasing == true){
            return true;
        }
        else return true;
    }
}
