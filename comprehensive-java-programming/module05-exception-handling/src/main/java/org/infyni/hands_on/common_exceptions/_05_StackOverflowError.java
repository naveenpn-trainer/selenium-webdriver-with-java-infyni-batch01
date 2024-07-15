package org.infyni.hands_on.common_exceptions;

class B {
    B() {
        B obj = new B();
    }
}

public class _05_StackOverflowError {
    public static void main(String[] args) {
        B obj = new B();
    }
}
