package org.infyni.polymorphisms.overriding;

class SimpleEncryption{
    public String encrypt(String str){
        return "";
    }

    public void compress(String str){
        System.out.println("Compress");
    }
}
class AdvanceEncryption extends SimpleEncryption{
    @Override
    public String encrypt(String str) {
        return "";
    }
}
public class _01_RuntimePolymorphism {
}
