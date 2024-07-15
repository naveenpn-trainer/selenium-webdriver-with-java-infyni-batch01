package org.infyni.hands_on.exception_handling;

public class _03_ExceptionHandling {
    public static void main(String[] args) {
        try{
            System.out.println(1/1);
        }
        catch (ArithmeticException ex){
            System.out.println("Arithmetic Exception");
        }
        finally {
            System.out.println("finally executed");
        }
    }
}
