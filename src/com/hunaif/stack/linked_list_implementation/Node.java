package com.hunaif.stack.linked_list_implementation;

class Node{
    private int data;
    private Node next;

    public Node(int data, Node next){
        this.data= data;
        this.next = next;
    }
    public int getData(){ return this.data; }
    public Node getNextNode(){ return  this.next; }
    public void setNextNode(Node next){ this.next = next; }
}