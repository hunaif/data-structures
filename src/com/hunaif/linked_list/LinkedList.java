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

    public void add(int data){
        root = new Node(data,root);
        size++;
    }
    public void addToSorted(int data){
        if(root == null) this.add(data);
        else if (root.getData() > data) this.add(data);
        else{
            Node node = new Node(data,null);
            Node curr = root;
            Node prev = null;
            while(curr.getNextNode() != null && curr.getData() < data) {
                prev = curr;
                curr = curr.getNextNode();
            }
            if(curr.getNextNode() == null) {
                curr.setNextNode(node);
            }
            else {
                prev.setNextNode(node);
                node.setNextNode(curr);
            }
        }
    }

    public Node mergeSortedLists(Node head1, Node head2){
        Node result = null;
        if(head1 == null) return head2;
        else if(head2 == null) return head1;
        else if(head1.getData() > head2.getData()) {
            result = head2;
            result.setNextNode(mergeSortedLists(head1, head2.getNextNode()));
        }
        else {
            result = head1;
            result.setNextNode(mergeSortedLists(head1.getNextNode(), head2));
        }
        return result;
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