package org.infyni.handson.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_01 {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList();
        System.out.println(list.isEmpty());
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(12);
//        list.add("12");

        System.out.println(list);
        list.add(0,9);
        System.out.println(list);

        List listTwo = new ArrayList();
        listTwo.add(100);
        listTwo.add(101);

        list.addAll(listTwo);
        System.out.println(list);
        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());

    }
}
