package org.infyni.hands_on.common_exceptions;

public class _07_ArrayStoreException {
    public static void main(String[] args) {
        Object [] s = new Integer[2];
        s[0] = 4.5;
    }
}
