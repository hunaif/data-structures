package com.hunaif.stack.linked_list_implementation;


public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);

        System.out.println("\n\n");
        myLinkedList.remove(1);
        myLinkedList.print(myLinkedList.getRoot());
    }
}
