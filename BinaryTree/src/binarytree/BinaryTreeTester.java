/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class BinaryTreeTester {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        BinaryTree t1 = new BinaryTree();
        Node n1 = new Node(10);
        t1.root = n1;
        t1.insert(n1, 20);
        t1.insert(n1, 6);
        t1.insert(n1, -10);
        if(t1.lookup(n1, 6)){
            System.out.println("Your insert and lookup test 1 pass");
        }
        if(t1.lookup(n1, -10)){
            System.out.println("Your insert and lookup test 2 pass");
        }
        if(!t1.lookup(n1, -100)){
            System.out.println("Your insert and lookup test 3 pass");
        }
        if(t1.maxDepth(n1)==1){
            System.out.println("Max Depth test 1 pass");
        }
        
    }
}
