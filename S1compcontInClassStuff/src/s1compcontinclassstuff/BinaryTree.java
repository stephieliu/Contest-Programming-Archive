/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s1compcontinclassstuff;

/**
 *
 * @author Stephie
 */

public class BinaryTree {
    Node root;//the root node of the tree, initially it will be Home
    Node currentNode;//keeps track of the node we are working with
    //node 1 is the current node, node 2 is the node to be inserted
    public void insert(Node node1, Node node2){
        if(node1.left==null){
            node1.left= node2;
        }
        else{
            node1.right = node2;
        }
    }
    //node is the root node, data is the name of the sender
    //if data can be found in the tree, it will be set as currentnode
    public void lookup(Node node, String data){
        if(node==null) return;//this will terminate the function call
        else if(node.name.equals(data)){
            currentNode = node;
            return;
        }
        //recursively lookup for data in the tree
        lookup(node.right, data);
        lookup(node.left, data);
    }
    //node is the root node
    //return the max depth of the tree
    public int maxDepth(Node node){
        if(node==null)return 1;
        return Math.max(maxDepth(node.left)+1, maxDepth(node.right)+1);
    }
    
}
