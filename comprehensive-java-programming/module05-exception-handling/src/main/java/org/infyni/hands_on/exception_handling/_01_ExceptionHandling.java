package org.infyni.hands_on.exception_handling;

public class _01_ExceptionHandling {
    public static void main(String[] args) {
       try{
           String []date = {"10 June 2026"};
           System.out.println(date[1]);
       }
       catch(ArrayIndexOutOfBoundsException ex){
           System.out.println("Check the size of array");
       }
    }
}
