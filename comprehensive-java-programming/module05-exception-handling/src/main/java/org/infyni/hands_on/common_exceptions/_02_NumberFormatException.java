package org.infyni.hands_on.common_exceptions;

public class _02_NumberFormatException {
    public static void main(String[] args) {
        String number = "123a";
        System.out.println(Integer.parseInt(number)+10);

    }
}
