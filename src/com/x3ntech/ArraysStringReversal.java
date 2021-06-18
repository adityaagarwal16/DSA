package com.x3ntech;

public class ArraysStringReversal {

    public static void main(String[] args) {

        String og = "hello what's up?";
        String[] array = og.split("");
        int length = og.length() - 1;

        StringBuilder sb = new StringBuilder();
        for(int i = length; i>=0; i--) {
            sb.append(array[i]);
        }
        System.out.println(sb);
    }
}
