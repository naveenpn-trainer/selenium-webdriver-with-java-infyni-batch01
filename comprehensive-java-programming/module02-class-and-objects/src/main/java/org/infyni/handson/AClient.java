package org.infyni.handson;
class A{

    String name;
    static int num;

    void m1(){

    }

    static void m2(){

    }
}
public class AClient {

    public static void main(String[] args) {
        System.out.println(A.num);
        A obj1 = new A();
        obj1.name = "Infyni";
        System.out.println(obj1.name);

        A obj2 = new A();
        obj2.name = "Infyni";
        System.out.println(obj2.name);

        obj1.m1();
        A.m2();
    }
}
