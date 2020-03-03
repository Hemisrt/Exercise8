package com.company.Greenlee;

import java.util.List;
import java.util.ArrayList;

public class Collection {
    public static List<Contact> contactList = new ArrayList<>();

    public static void addContact(Contact a) {
        contactList.add(a);
    }

    public static void displayList() {
        System.out.println(contactList);
    }
}
