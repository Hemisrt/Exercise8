package com.company.Greenlee;

public class Main {
    // Trenton Greenlee
    // 2/23/2020
    // Exercise 8
    // CSCI 1660 - Android Programming Fundamentals (Java)
    public static void main(String[] args) {
        // Creating two different objects from two different classes.
        Contact trenton = new Contact("Trenton", "trenton@gmail.com");
        BetterContact trenton2 = new BetterContact("Trenton Greenlee", "trenton@outlook.com", "(012) 345-6789");
        Collection.addContact(trenton);
        Collection.addContact(trenton2);
        Collection.displayList();
        System.out.println("");
    }
}