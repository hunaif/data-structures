package com.hunaif.linked_list;

public class LinkedList {

    private Node root;
    private int size;

    public LinkedList(){
        root = null;
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public Node getRoot(){
        return this.root;
    }
    public void setRoot(Node root){
        this.root = root;
    }

    public void add(int data){
        root = new Node(data,root);
        size++;
    }

    public  Node find(int data){
        Node current = root;
        while(current != null){
            if(current.getData() == data)
                return current;
            current = current.getNextNode();
        }
       return null;
    }

    public void remove(int data){
        Node current = root;
        Node previous = null;

        while(current != null) {
            if (current.getData() == data) {
                if (previous == null) {
                    if(current == root) root = root.getNextNode();
                    else root = null;
                }
                else {
                    previous.setNextNode(current.getNextNode());
                    current.setNextNode(null);
                }
                size--;
                break;
            }
            previous = current;
            current = current.getNextNode();
        }
    }

    public void print(Node head){
        if(head == null){}
        else{
            System.out.println(head.getData());
            print(head.getNextNode());
        }
    }

    public void addAtEnd(Node root, int data){
        if(root == null || root.getNextNode() == null){
            Node newNode = new Node(data,null);
            if(root == null) this.root = newNode;
            else root.setNextNode(newNode);
            size ++;
        }
        else addAtEnd(root.getNextNode(),data);
    }

    public Node reverse(Node curr, Node prev, Node head){
        if(curr == null) return null;
        else if(curr.getNextNode() == null){
            curr.setNextNode(prev);
            head = curr;
            return head;
        }
        head = reverse(curr.getNextNode(),curr,head);
        curr.setNextNode(prev);
        return head;
    }
    public void printReverse(Node head){
        if(head == null){}
        else{
            printReverse(head.getNextNode());
            System.out.println(head.getData());
        }
    }
}