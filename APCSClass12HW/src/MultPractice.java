/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author steph
 */
import java.util.*;
public class MultPractice implements StudyPractice{
    private int first;
    private int second;
    public MultPractice(int one, int two){
        first = one;
        second = two;
    }
    public String getProblem(){
        return first+" TIMES "+second;
    }
    public void nextProblem(){
        second++;
    }
}
