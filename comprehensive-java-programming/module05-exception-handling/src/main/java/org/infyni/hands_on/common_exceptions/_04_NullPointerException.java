package org.infyni.hands_on.common_exceptions;
class A {
    public void m1() {
        System.out.println("m1");
    }
}
public class _04_NullPointerException {
    public static void main(String[] args) {
        A obj = null;
        obj.m1();
    }
}
