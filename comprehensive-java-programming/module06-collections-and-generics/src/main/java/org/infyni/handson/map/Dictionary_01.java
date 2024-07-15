package org.infyni.handson.map;

import java.util.HashMap;
import java.util.Map;

public class Dictionary_01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("+91","India");
        map.put("+01","USA");
        map.put("+01","USAA");
        System.out.println(map);
        System.out.println(map.get("+01"));
        System.out.println(map.getOrDefault("002","Key Not Found"));
    }
}
