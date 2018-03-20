package com.hunaif.doubly_linked_list;

class Node{
    private int data;
    private Node next;
    private Node prev;

    public Node(int data, Node prev, Node next){
        this.data= data;
        this.next = next;
        this.prev = prev;
    }

    public int getData(){ return this.data; }
    public Node getNextNode(){ return  this.next; }
    public Node getPrevNode(){ return  this.prev; }
    public void setNextNode(Node next){ this.next = next; }
    public void setPrevNode(Node prev){ this.prev = prev; }
}