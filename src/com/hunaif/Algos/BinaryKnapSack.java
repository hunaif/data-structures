package com.hunaif.Algos;

public class BinaryKnapSack {
    public static void main(String[] args){
        int weights[]= {0,5,4,7};
        int values[]= {0,1,2,4};
        int capacity = 10;
        int[][] mem;
        mem = new int[weights.length + 1][capacity + 1];

        for (int row=0; row < weights.length+1; row++) {
            for (int col=0; col < capacity+1; col++) {
                mem[row][col] = -1;
            }
        }
        System.out.println(ks(weights.length-1,capacity,weights,values,mem));

    }

    public static int ks(int n,int capacity,int[] weights, int[] values,int[][] mem){
        int result=0;
        if(n==0 || capacity == 0) result = 0;
        else if (mem[n][capacity] != -1) result = mem[n][capacity];
        else if(weights[n] > capacity) result = ks(n-1,capacity,weights,values,mem);
        else{
            int temp1 = ks(n-1,capacity,weights,values,mem);
            int temp2 = values[n] + ks(n-1,capacity - weights[n],weights,values,mem);
            result = Math.max(temp1,temp2);
        }
        mem[n][capacity] = result;
        return result;
    }
}
