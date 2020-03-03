package com.company.Greenlee;

public class Contact {
    // Attributes
    public String name;
    public String email;

    // Default Constructor
    Contact(String name, String email){
        this.name = name;
        this.email = email;
    }

    // Display() method
    public void display() {
        System.out.print("Name: " + name + ", Email: " + email + ", ");
    }
}