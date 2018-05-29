package com.hunaif.trees.binary_search_tree;

public class Main {
    public static void main(String[] args) {
        BSTImplementation bst = new BSTImplementation();
        BSTImplementation.root = bst.add(5,BSTImplementation.root);
        BSTImplementation.root = bst.add(3,BSTImplementation.root);
        BSTImplementation.root = bst.add(6,BSTImplementation.root);
        BSTImplementation.root = bst.add(8,BSTImplementation.root);
        BSTImplementation.root = bst.add(9,BSTImplementation.root);
        BSTImplementation.root = bst.add(1,BSTImplementation.root);

//        bst.printInorder(BSTImplementation.root);

//        System.out.println(bst.height(BSTImplementation.root));
        System.out.println(bst.getMin(Integer.MIN_VALUE,BSTImplementation.root));
        System.out.println(bst.getMax(Integer.MAX_VALUE,BSTImplementation.root));

    }

}
