package com.company.Greenlee;

public class Main {
    // Trenton Greenlee
    // 2/23/2020
    // Exercise 7
    // CSCI 1660 - Android Programming Fundamentals (Java)
    public static void main(String[] args) {
        // Creating two different objects from two different classes.
        Contact trenton = new Contact("Trenton", "trenton@gmail.com");
        BetterContact trenton2 = new BetterContact("Trenton", "trenton@gmail.com", "(012) 345-6789");
        // Calling display() method with the trenton object. But which display() method? There are two different display() methods.
        // The Contact class display() method.
        System.out.println("Contact before BetterContact(Normal Contact): ");
        trenton.display();

        System.out.println("\n-----------------------------------------------------------------");

        // Calling display() method with the trenton2 object. But which display() method? There are two different display() methods.
        // The BetterContact class display() method.
        System.out.println("Contact after BetterContact(Business Contact): ");
        trenton2.display();
        System.out.println("\n");

        Contact con = (Contact) trenton;
        Collection.addContact(con);
        Contact con2 = (Contact) trenton2;
        Collection.addContact(con2);
        Collection.displayList();
    }
}