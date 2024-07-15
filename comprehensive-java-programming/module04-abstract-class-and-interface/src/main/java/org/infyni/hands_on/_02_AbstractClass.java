package org.infyni.hands_on;
abstract class Employee {
    abstract int getHourlySalary();
    public int calculateMonthlySalary() {
        return getHourlySalary() * 240;
    }
}

class PermanentEmployee extends Employee {

    @Override
    int getHourlySalary() {
        return 100;
    }
}

class ContractEmployee extends Employee {

    @Override
    int getHourlySalary() {
        return 200;
    }
}
public class _02_AbstractClass {
    public static void main(String[] args) {
        Employee employee = new PermanentEmployee();
        System.out.println(employee.calculateMonthlySalary());
    }
}
