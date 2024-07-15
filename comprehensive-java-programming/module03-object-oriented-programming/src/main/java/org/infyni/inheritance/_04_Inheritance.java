package org.infyni.inheritance;

class Person {
    private String firstName;
    private  String lastName;
    private  int age;

    Person(String firstName, String lastName, int age) {
        System.out.println("Person constructor invoked");
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


}

class Employee extends Person {

    String company;
    private double salary;

    Employee(String firstName, String lastName, int age, String company, double salary) {
        super(firstName, lastName, age);
        System.out.println("Employee constructor invoked");
        this.company = company;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    private String teamName;

    public Manager(String firstName, String lastName, int age, String company, double salary, String teamName) {
        super(firstName, lastName, age, company, salary);
        System.out.println("Manager constructor invoked");
        this.teamName = teamName;
    }
}

class SalaryHikeUtility {
    public static void modifySalaryForEmployee(Employee employee) {
        if(employee instanceof Manager){
            Manager manager = (Manager) employee;
            manager.setSalary(manager.getSalary()/2);
        }else{
            employee.setSalary(employee.getSalary()*2);
        }
    }

}

public class _04_Inheritance {
    public static void main(String[] args) {
        Employee employee = new Employee("Vimala", "V", 27, "Vimala Tech Pvt Lrd", 100.0);
        Manager manager = new Manager("Naveen", "P.n", 37, "Cisco", 100.0, "Sleeping Champs");
        SalaryHikeUtility.modifySalaryForEmployee(employee);
        SalaryHikeUtility.modifySalaryForEmployee(manager);
        System.out.println(employee.getSalary());
        System.out.println(manager.getSalary());

        System.out.println(1);
        System.out.println("abc");
        System.out.println(1.2f);
        System.out.println(1.3);
    }
}
