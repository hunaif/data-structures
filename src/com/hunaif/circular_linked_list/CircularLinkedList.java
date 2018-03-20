package com.hunaif.circular_linked_list;

public class CircularLinkedList {

    private Node root;
    private Node last;
    private int size;

    public CircularLinkedList(){
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

    public boolean isEmpty() { return (root == null); }

    public void insert(int data) {
        Node newNode = new Node(data,null);
        if(isEmpty())
            last = newNode;
        newNode.setNextNode(root);
        root = newNode;
        last.setNextNode(root);
        size++;
    } // end insert

    public void remove(int data){
        //remove from head
        Node current = root;
        Node prev = null;
        if(current == null) return;
        if(current.getData() == data){
          if(last == root) last = null;
          root = current.getNextNode();
          size --;
          return;
        }
        while (current.getNextNode() != null && current.getNextNode() != root){
            prev = current;
            current = current.getNextNode();
            if(current.getData() == data){
                if(prev != null) prev.setNextNode(current.getNextNode());
                current.setNextNode(null);
                if(current == last) last = prev;
                size--;
                return;
            }
        }
        //remove from tail
        //remove elsewhere
    }


    public  Node find(int data){
        Node current = root;
        if(current == null) {}
        else while(current != last){
            if(current.getData() == data)
                return current;
            current = current.getNextNode();
        }
       return null;
    }

    public void print(Node head){
        if(head == null){}
        else{
            System.out.println(head.getData());
            if(head != last) print(head.getNextNode());
        }
    }
}