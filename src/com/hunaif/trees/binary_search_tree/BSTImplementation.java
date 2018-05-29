package com.hunaif.trees.binary_search_tree;
import java.math.*;

public class BSTImplementation {
    public static Node root;
    public BSTImplementation(){ root = null;}

    public Node add(int data, Node root){
        if(root == null) return new Node(data);
        else if(data < root.getData()) root.setLeft(add(data,root.getLeft()));
        else root.setRight(add(data,root.getRight()));
        return root;
    }

    public void printInorder(Node root){
        if(root == null) return;
        else {
            printInorder(root.getLeft());
            System.out.println(root.getData());
            printInorder(root.getRight());
        }
    }

    public int height(Node root){
        if(root == null) return 0;
        else return(1 + Math.max(height(root.getRight()),height(root.getLeft())));
    }

    public int getMin(int min,Node root){
        if(root == null) return min;
        else return getMin(root.getData(),root.getLeft());
    }

    public  int getMax(int max,Node root){
        if(root == null) return max;
        else return getMax(root.getData(),root.getRight());
    }
}
