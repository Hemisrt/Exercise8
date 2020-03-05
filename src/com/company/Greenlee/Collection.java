package com.company.Greenlee;

import java.util.List;
import java.util.ArrayList;

public class Collection {
    public static List<Contact> contactList = new ArrayList<>();

    // Adding objects from Contact class and subclasses of Contact class to contactList ArrayList.
    public static void addContact(Contact a) {
        contactList.add(a);
    }

    // Iterating and calling Display() methods
    public static void displayList() {
        System.out.println("List of Contacts: ");
        for (Contact item: contactList) {
            item.display();
        }
    }
}
