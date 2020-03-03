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

    // Using @Override since there are two display() methods for both classes.
    // Each object from both different classes will have their information printed out.
    // If an object from the Contact class calls the display() method, it will call for the method in the Contact class.
    // If an object from the BetterContact class calls the display() method, it will call for the method in the BetterContact class.
    // Using super.display() to call the display method from the Contact class.
    @Override
    public void display() {
        super.display();
        System.out.println("Phone: " + phone);
    }
}