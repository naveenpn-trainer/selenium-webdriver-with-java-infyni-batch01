package org.infyni.package01;

public class A {

    int w;
    private int x;
    protected int y;
    public int z;

    void display(){
        System.out.println("Default: "+w);
        System.out.println("Private: "+x);
        System.out.println("Protected: "+y);
        System.out.println("Public: "+z);
    }
}
