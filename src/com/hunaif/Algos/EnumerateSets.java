package com.hunaif.Algos;


public class EnumerateSets {

    public static void main(String[] args){
        int data[]= {1,2,3,4, 5};
        enumerate(data);
    }

    public static void enumerate(int[] data){
        int[] subset = new int[data.length];
        helper(data,subset,0);
    }

    public static void helper(int[] data,
                       int[] subset,
                       int i){
        if(i == data.length) print_set(subset);
        else{
            subset[i] = data[i];
            helper(data,subset,i+1);
            subset[i] = 0;
            helper(data, subset, i+1);
        }
    }

    public static void print_set(int[] data){
        for (int x : data){
            if(x != 0)
             System.out.print(x + " ");
        }
        System.out.println();
    }
}
