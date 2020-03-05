package com.company.Greenlee;

public class BetterContact extends Contact {
    // Attributes
    private String phone;

    // Default Constructor
    BetterContact(String name, String email, String phone) {
        super(name, email);
        this.phone = phone;
    }

    // Getters and Setters
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Display() Method
    public void display() {
        super.display();
        System.out.println("Phone: " + getPhone());
    }
}