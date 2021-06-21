package com.x3ntech;

import java.util.LinkedList;

public class LinkedListReverse {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(3343);
        list.add(73);
        list.add(4);
        list.add(33);
        list.add(64);

        list.removeFirst();
        LinkedList<Integer> newList = new LinkedList<>();
        for(int i =list.size()-1 ; i>-1; i--) {
            newList.add(list.get(i));
        }
        System.out.println(list);
        System.out.println(newList);


    }
}
