package org.infyni.class_relations;

import java.util.List;

class Customer {

    private String fullName;
    private List<CreditCard> creditCardlist;

    public Customer(String fullName,  List<CreditCard> creditCardlist){
        this.fullName = fullName;
        this.creditCardlist = creditCardlist;
    }

    public void displayAllDetails() {
        System.out.println(this.fullName);
       // Add the logic to print all the credit card numbers
    }
}

class CreditCard {
    String creditCardNo;
    CreditCard(String creditCardNo){
        this.creditCardNo = creditCardNo;
    }
    public String getCreditCardNo() {
        return creditCardNo;
    }
}
public class Client {
    public static void main(String []args) {
        //Customer customer = new Customer("Naveen", new CreditCard("123-456-789"));
        //customer.displayAllDetails();
    }
}