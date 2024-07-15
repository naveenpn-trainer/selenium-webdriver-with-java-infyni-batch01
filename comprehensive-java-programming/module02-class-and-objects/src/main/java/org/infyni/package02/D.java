package org.infyni.package02;

import org.infyni.package01.A;

public class D extends A {

    void display(){
        System.out.println("Protected: "+y);
        System.out.println("Public: "+z);
    }
}
