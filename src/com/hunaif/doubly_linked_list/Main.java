package com.hunaif.doubly_linked_list;


public class Main {

    public static void main(String[] args) {
	// write your code here
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList();
        myDoublyLinkedList.add(1);
        myDoublyLinkedList.add(2);
        myDoublyLinkedList.add(3);

//        myLinkedList.print(myLinkedList.getRoot());
//
//        System.out.println("\n\n");
//        myLinkedList.remove(2);
//        myLinkedList.print(myLinkedList.getRoot());
//
//        System.out.println("\n\n");
//        myLinkedList.remove(1);
//        myLinkedList.print(myLinkedList.getRoot());
//
//        System.out.println("\n\n");
//        myLinkedList.remove(3);
//        myLinkedList.print(myLinkedList.getRoot());
//
//        System.out.println("\n\n");
//        myLinkedList.addAtEnd(myLinkedList.getRoot(),9);
//        myLinkedList.print(myLinkedList.getRoot());
//
//        System.out.println("\n\n");
//        myLinkedList.addAtEnd(myLinkedList.getRoot(),8);
//        myLinkedList.print(myLinkedList.getRoot());
//
//        System.out.println("\n\n");
//        myLinkedList.addAtEnd(myLinkedList.getRoot(),7);
//        myLinkedList.print(myLinkedList.getRoot());
//
//
//        myDoublyLinkedList.print(myDoublyLinkedList.getRoot());
//        System.out.println("\n\n");


        System.out.println("\n\n");
        myDoublyLinkedList.addAtEnd(myDoublyLinkedList.getRoot(),99);
        myDoublyLinkedList.print(myDoublyLinkedList.getRoot());
    }
}
