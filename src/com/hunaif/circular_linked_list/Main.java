package com.hunaif.circular_linked_list;


public class Main {

    public static void main(String[] args) {
	// write your code here
        CircularLinkedList myCircularLinkedList = new CircularLinkedList();
        myCircularLinkedList.insert(1);
        myCircularLinkedList.insert(2);
        myCircularLinkedList.insert(3);


        System.out.println("\n\n");
        myCircularLinkedList.print(myCircularLinkedList.getRoot());

        myCircularLinkedList.remove(3);

        System.out.println("\n\n");
        myCircularLinkedList.print(myCircularLinkedList.getRoot());


    }
}
