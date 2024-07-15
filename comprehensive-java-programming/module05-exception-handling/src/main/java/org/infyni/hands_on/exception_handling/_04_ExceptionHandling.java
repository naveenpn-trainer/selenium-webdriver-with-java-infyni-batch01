package org.infyni.hands_on.exception_handling;

class XYZ {
    public void encrypt(String str) throws ArithmeticException {
        String encryptedMessage = str.toUpperCase();
        System.out.println("Encrypt the data");

    }
}

public class _04_ExceptionHandling {
    public static void main(String[] args) {
        new XYZ().encrypt(null);
    }
}
