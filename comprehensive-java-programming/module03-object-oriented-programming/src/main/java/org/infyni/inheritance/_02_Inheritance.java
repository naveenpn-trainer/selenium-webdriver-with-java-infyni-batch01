package org.infyni.inheritance;

class C {
    C(){
        System.out.println("Constructor of class (C) Invoked");
    }
}
class D extends C{
    D(){
        super();
        System.out.println("Constructor of class (D) Invoked");
    }
}
public class _02_Inheritance {
    public static void main(String[] args) {
        D obj = new D();
    }
}
