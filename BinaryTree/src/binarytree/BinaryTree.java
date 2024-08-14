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
public class BinaryTree {

    /**
     * @param args the command line arguments
     */
    Node root;//if binary tree is not empty, it should at least have 
    //1 node
    //node is the node object, data is the data to be inserted in the node
    //return the node after the data being inserted
    public Node insert(Node node, int data){
        //check whether node is null
        if(node==null){
            return new Node(data);
        }
        else if(node.data<data){
            node.right = insert(node.right, data);
        }
        else{
            node.left = insert(node.left, data);
        }
        return node;
    }
    public boolean lookup(Node node, int data){
        //node is a root node
        //data is a value to be searched in the tree
        //return true if the data is found else return false
        //check whether the node is null
        if(node==null){
            return false;
        }
        else if(node.data==data){
            return true;
        }
        else if(data>node.data){
            return lookup(node.right, data);
        }
        else{
            return lookup(node.left, data);
        }
    }
    public int maxDepth(Node node){
        if(node==null)return 1;
        return Math.max(maxDepth(node.left)+1, maxDepth(node.right)+1);
    }
    public int size(Node node){
        if(node==null)return 0;
        return 1+size(node.left)+size(node.right);
    }
    //
    public int maxValue(Node node){
        if(node==null) return -1;
        int maxValue = -1;
        while(node!=null){
            node = node.right;
            maxValue = node.data;
        }
        return maxValue;
    }
    public static void main(String[] args) {
        
    }
    
}
