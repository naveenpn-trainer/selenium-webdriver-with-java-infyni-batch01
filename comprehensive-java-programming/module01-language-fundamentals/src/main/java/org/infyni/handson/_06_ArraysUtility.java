package org.infyni.handson;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _06_ArraysUtility {
    public static void main(String[] args) {
        int []numbers1 = {1,2,3,4,8};
        int []numbers2 = {1,2,3,4,8};
        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.equals(numbers1,numbers2));


        int []result = Arrays.copyOf(numbers1,numbers1.length*2);
        System.out.println(Arrays.toString(result));

        Arrays.fill(numbers1,10);
        System.out.println(Arrays.toString(numbers1));

        int elementToSearch = 80;
        int index = Arrays.binarySearch(numbers2,elementToSearch);
        System.out.println("Index of: "+elementToSearch+" to search is in index: "+index);

        int [] numbers = {3,1,5,4,7,3,5,7};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        List<Integer> list = Arrays.asList(Arrays.stream(numbers).boxed().toArray(Integer[]::new));
        Collections.reverse(list);
        Integer []arraySortedInDescending = new Integer[numbers.length] ;
        list.toArray(arraySortedInDescending);
        System.out.println("*"+Arrays.toString(arraySortedInDescending));
    }
}
