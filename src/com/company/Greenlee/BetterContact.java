package com.company.Greenlee;

public class BetterContact extends Contact {
    // Attributes
    // Only creating the attribute phone because of BetterContact being an extension of the class Contact.
    private String phone;

    // Using the super method to indicate the two Contact attributes are from the contact Class.
    BetterContact(String name, String email, String phone) {
        super(name, email);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void display() {
        super.display();
        System.out.println("Phone: " + getPhone());
    }
}