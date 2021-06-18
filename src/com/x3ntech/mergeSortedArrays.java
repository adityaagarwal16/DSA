package com.x3ntech;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeSortedArrays {

    public static void main(String[] args) {
        mergeSortedArraysFunc(new int[]{0, 3, 4, 31}, new int[]{4, 6, 30});
    }

    static void mergeSortedArraysFunc(int[] arr1, int[] arr2) {
        ArrayList<Integer> arr = new ArrayList<>();

        int arr1Item = arr1[0], arr2Item = arr2[0];
        int i1 = 0, i2 = 0;

        while(arr1Item > 0 || arr2Item > 0) {
            System.out.println(arr1Item + ",  " + arr2Item);
            System.out.println(i1 + ",  " + i2);

            if(arr1Item<arr2Item) {
                arr.add(arr1Item);
                i1++;
                try { arr1Item=arr1[i1]; } catch (Exception e) { arr1Item = -1; }
            }
            else if(arr2Item<arr1Item){
                arr.add(arr2Item);
                i2++;
                try { arr2Item=arr2[i2]; } catch (Exception e) { arr2Item = -1; }
            }
        }

        System.out.println(arr);
    }
}
