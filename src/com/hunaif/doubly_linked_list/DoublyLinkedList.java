package com.hunaif.doubly_linked_list;

public class DoublyLinkedList {

    private Node root;
    private int size;

    public DoublyLinkedList(){
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
        Node newNode = new Node(data,null,root);
        if(root != null) root.setPrevNode(newNode);
        root = newNode;
        size ++;
    }


    public void print(Node root){
        if(root == null){}
        else{
            System.out.println(root.getData());
            print(root.getNextNode());
        }
    }
    public void printReverse(Node root){
        if(root == null){}
        else{
            printReverse(root.getNextNode());
            System.out.println(root.getData());
        }
    }

    public Node find(int data, Node root){
        if(root != null){
            if(root.getData() == data) return root;
            else return find(data, root.getNextNode());
        }
       return null;
    }


    public void remove(int data) {
        Node current = root;
        if (current == null) {
        } else if (current.getData() == data) {
            //Deleting from head
            root = current.getNextNode();
            if (root == null) {
            } else root.setPrevNode(null);
            size--;
        } else {
            while (current != null) {
                if (current.getData() == data) {
                    if(current.getPrevNode() != null)  //check for the last node
                        current.getPrevNode().setNextNode(current.getNextNode());
                    if(current.getNextNode() != null)   //check for the last node
                        current.getNextNode().setPrevNode(current.getPrevNode());
                    current.setPrevNode(null);
                    current.setNextNode(null);
                    size--;
                    break;
                }
                current = current.getNextNode();
            }
        }
    }
    public void addAtEnd(Node root, int data){
        if(root == null) {
            Node newNode = new Node(data,null,null);
            this.root = newNode;
            size++;
        }
        else if(root.getNextNode() == null){
            Node newNode = new Node(data,root,null);
            root.setNextNode(newNode);
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
}