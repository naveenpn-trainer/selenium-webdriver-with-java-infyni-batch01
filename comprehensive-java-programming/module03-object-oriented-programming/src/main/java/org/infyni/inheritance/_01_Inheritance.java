package org.infyni.inheritance;
class A{
    public void m1(){
        System.out.println("m1() - Invoked");
    }
}
class B extends A{
    public void m2(){
        System.out.println("m2() - Invoked");
    }
}
public class _01_Inheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.m1();
    }
}
