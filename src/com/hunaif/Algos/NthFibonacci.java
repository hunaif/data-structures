package com.hunaif.Algos;

public class NthFibonacci {
    public static void main(String[] args){

        int n = 50;
        double[] memo = new double[n+1];

        long start1 = System.currentTimeMillis();
        System.out.println(nthfib(n,memo));
        long end1 = System.currentTimeMillis();
        System.out.println("Time taken by DP: " + (end1-start1) + " ms");


        long start2 = System.currentTimeMillis();
        System.out.println(nthfib(n));
        long end2 = System.currentTimeMillis();
        System.out.println("Time taken without DP: " + (end2-start2) + " ms");



    }

    public static double nthfib(int n, double[] memo) {
        if(memo[n] != 0) return memo[n];
        if (n == 1 || n == 2) return 1;
        else {
            double result = nthfib(n - 1, memo) + nthfib(n - 2,memo);
            memo[n] = result;
            return result;
        }
    }

    public static double nthfib(int n){
        if (n == 1 || n == 2) return 1;
        else return nthfib(n - 1) + nthfib(n - 2);
    }
}
