package com.hunaif.stack.array_implementation;

public class StackImplementation {

    private static final int SIZE_FACTOR=2;

    private int data[];

    private int index;

    private int size;

    public StackImplementation(){
        this.data=new int[SIZE_FACTOR];
        this.size=SIZE_FACTOR;
    }

    public void push(int value){
        if(this.index==this.size) increaseSizeAndReallocate();
        System.out.println("Inserting at " + this.index);
        data[this.index]=value;
        this.index++;
    }

    private void increaseSizeAndReallocate() {
        this.size=this.size * SIZE_FACTOR;
        int newData[]= new int[this.size];
        for(int i=0; i < data.length;i++)
            newData[i] = data[i];
        this.data=newData;
    }

    public int top(){return this.data[size-1];}


    public int pop() throws  Exception{
        this.index--;
        System.out.println("returning from " + this.index);
        if(index < 0) throw new ArrayIndexOutOfBoundsException();
        return data[index];
    }

    public static void main(String[] args) throws Exception {
        StackImplementation mal = new StackImplementation();
        mal.push(0);
        System.out.println(mal.pop());
        System.out.println(mal.pop());
    }
}