package org.infyni.inheritance;
class Base{
    Base(String s){
        System.out.println("Base class constructor invoked");
    }
}
class Derived extends Base{
    Derived(String s){
        super("d");
        System.out.println("Dervied class constructor invoked");
    }
}
public class _03_Inheritance {
    public static void main(String[] args) {
        Derived derived = new Derived("ABC");
    }
}

