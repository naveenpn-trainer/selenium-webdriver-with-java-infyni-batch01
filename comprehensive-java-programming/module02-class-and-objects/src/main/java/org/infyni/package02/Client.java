package org.infyni.package02;

import org.infyni.package01.A;
import org.infyni.package01.B;

public class Client {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println("Public: "+obj.z);

        D obj2 = new D();
        System.out.println("Public: "+obj2.z);
    }
}
