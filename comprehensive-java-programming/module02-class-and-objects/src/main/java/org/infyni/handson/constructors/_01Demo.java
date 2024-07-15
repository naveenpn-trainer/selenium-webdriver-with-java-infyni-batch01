package org.infyni.handson.constructors;

/*
    Demonstrating why constructors are special member functions
 */

class A{
    A(){
        System.out.println("Constructor Invoked");
    }
}
public class _01Demo {
    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new A();
    }
}
