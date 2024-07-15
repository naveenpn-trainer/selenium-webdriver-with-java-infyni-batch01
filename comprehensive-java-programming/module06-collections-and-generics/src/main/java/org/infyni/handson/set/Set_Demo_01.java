package org.infyni.handson.set;


/*
    Any implementation of set duplicates are not allows
    Implementation of Set : HashSet, LinkedHashSet and TreeSet
 */

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Demo_01 {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("A");
        set.add("B");
        set.add("J");
        set.add("B");
        set.add("D");
        set.add("a");
        System.out.println(set);

        set = new LinkedHashSet();
        set.add("A");
        set.add("B");
        set.add("J");
        set.add("B");
        set.add("D");
        set.add("a");
        System.out.println(set);

        set = new TreeSet();
        set.add("A");
        set.add("B");
        set.add("J");
        set.add("B");
        set.add("D");
        set.add("a");
        System.out.println(set);

    }
}
