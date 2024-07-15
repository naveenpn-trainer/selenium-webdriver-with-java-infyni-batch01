package org.infyni.package01;

public class Client {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println("Default: "+obj.w);
        System.out.println("Protected: "+obj.y);
        System.out.println("Public: "+obj.z);
    }
}
