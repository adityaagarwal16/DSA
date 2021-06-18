package com.x3ntech;

import java.net.Inet4Address;
import java.util.Collections;
import java.util.HashMap;

public class HashTableRecurring {

    public static void main(String[] args) {
        int[] array = new int[] {1,2,2,1,3,7,5,2,3};

        //this solution has a space complexity of O(n) but also a time complexity of O(n)
        //while a nested loop solution will have a space comp. of O(1) and time comp. of O(n^2)

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : array) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
                //return true, if first repeat
            } else
                map.put(j, 1);
        }
        System.out.println(map);
        for(int num : map.values()) {
            if(num >= 2) {
                System.out.println("first recurring character is "+num);
                break;
            }
        }
    }
}
