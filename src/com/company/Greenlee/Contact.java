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

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Display() Method
    public void display() {
        System.out.print("\nName: " + getName() + ", Email: " + getEmail() + ", ");
    }
}