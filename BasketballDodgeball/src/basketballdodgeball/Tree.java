/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basketballdodgeball;

/**
 *
 * @author steph
 */
import java.util.*;
import java.io.*;
public class Tree<T> {
    private T value;
    private List<Tree<T>> children;
    private Tree(T value){
        this.value = value;
        this.children = new ArrayList<>();
    }
    public static <T> Tree<T> of(T value){
        return new Tree<>(value);
    }
    public Tree<T> addChild(T value){
        Tree<T> newChild = new Tree<>(value);
        children.add(newChild);
        return newChild;
    }
    public static <T> Optional<Tree<T>> search(T value, Tree<T> root){
        Queue<Tree<T>> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Tree<T> currentNode = queue.remove();
            if(currentNode.value.equals(value)){
                return Optional.of(currentNode);
            }
            else queue.addAll(currentNode.children);
        }
        return Optional.empty();
    }
}
