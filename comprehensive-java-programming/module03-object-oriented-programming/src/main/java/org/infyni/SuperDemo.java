package org.infyni;

class A {
    public void m1() {
        System.out.println("A  m1()");
        System.out.println("1");
        if (9 > 10) {
            System.out.println("2");
        }
        System.out.println("3");
    }
}

class B extends A {
    public void m2() {
        System.out.println("sdfdsf");
        super.m1();
        System.out.println("B m2()");
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        B obj = new B();
//        obj.m1();
        obj.m2();

    }
}
