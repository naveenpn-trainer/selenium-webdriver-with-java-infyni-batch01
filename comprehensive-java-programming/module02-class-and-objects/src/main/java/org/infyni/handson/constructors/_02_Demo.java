package org.infyni.handson.constructors;
/*
    Used to initilize variables
 */
class Person{
    String name;
    int age;
    String ssn;

    public Person(String name, int age, String ssn) {
        this.name = name;
        this.age = age;
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
public class _02_Demo {
    public static void main(String[] args) {

        Person person1 = new Person("Naveen Pn",37,"ABC");
        System.out.println(person1.toString());
    }
}
