package org.infyni.gc;
class A{
    int num;

    A(int num){
        this.num = num;
        System.out.println("Object with value: "+this.num);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Deleting Object with value: "+this.num);
    }
}
public class GCClient {
    public static void main(String[] args) {
        A obj = null;
        for(int i = 1;i<100;i++){
            obj = new A(i);
            obj = null;
            System.gc();
        }
    }
}
