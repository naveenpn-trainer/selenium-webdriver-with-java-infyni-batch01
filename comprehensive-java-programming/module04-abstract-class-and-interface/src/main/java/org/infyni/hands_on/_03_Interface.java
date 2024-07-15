package org.infyni.hands_on;

interface WebDriver {
    void m1();

    void m2();
}

class FireFoxDriver implements WebDriver {

    @Override
    public void m1() {
        System.out.println("M1");
    }

    @Override
    public void m2() {
        System.out.println("M2");
    }
}

public class _03_Interface {
    public static void main(String[] args) {
        WebDriver driver = new FireFoxDriver();
        driver.m1();
    }
}
