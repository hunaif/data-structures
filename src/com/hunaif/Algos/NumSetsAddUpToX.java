package com.hunaif.Algos;

import java.util.HashMap;
import java.util.Map;

public class NumSetsAddUpToX {

    public static void main(String[] args){
        int data[]= {1,2,3,4,5,6,7,8};
        Map<String,Integer> mem = new HashMap<>();
        System.out.println(getNumSets(data,10,mem));
    }

    public static int getNumSets(int[] data, int x, Map<String,Integer> mem){
        return recur(data,x,data.length - 1,mem);
    }

    public static int recur(int[] data, int total, int i, Map<String,Integer> mem){
        int to_return = 0;
        String key = total + ":" +i;

        if(mem.containsKey(key))
            return mem.get(key);

        if (total == 0) return 1;

        else if(total < 0) return 0;

        else if(i < 0) return 0;

        else if (data[i] > total) to_return = recur(data,total,i-1,mem);

        else to_return = recur(data,total,i-1,mem) +
                    recur(data,total - data[i], i-1,mem);

        mem.put(key,to_return);
        return to_return;
    }
}
