package com.hunaif.linked_list;


public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList myLinkedList1 = new LinkedList();
        myLinkedList1.addToSorted(2);
        myLinkedList1.addToSorted(1);
        myLinkedList1.addToSorted(-1);

        LinkedList myLinkedList2 = new LinkedList();
        myLinkedList2.addToSorted(-3);
        myLinkedList2.addToSorted(0);
        myLinkedList2.addToSorted(100);

        Node newHead = myLinkedList1.mergeSortedLists(myLinkedList1.getRoot(),myLinkedList2.getRoot());
//        myLinkedList.addToSorted(30);
//        myLinkedList.addToSorted(-1);




        System.out.println("\n\n");

        myLinkedList1.print(newHead);

    }
}
