package com.company;

import java.util.ArrayList;

public class MobilePhone {
    //CONTACTS
    //store
    //modify
    //remove
    //query
    private String phoneModel;
    private ArrayList<Contacts> contactsList;

    public MobilePhone(String phoneModel) {
        this.phoneModel = phoneModel;
        this.contactsList = new ArrayList<>();
    }

    public void printContactsList() {
        System.out.println("You have " + contactsList.size() + " contact(s) in your list.");
        for (int i = 0;i < contactsList.size();i++) {
            System.out.println(i + " - " + contactsList.get(i).getName() + " - " + contactsList.get(i).getPhoneNumber());
        }
    }

    public void addContact(Contacts newContact) {
        int found = findContact(newContact);
        if (found>=0) {
            System.out.println("Contact is already in the list.");
        } else {
            contactsList.add(newContact);
            System.out.println(newContact.getName() + " was added to your contact list.");
        }
    }

    public void modifyContact (String oldName, String newName, String newNumber) {
        Contacts oldContact = new Contacts(oldName,"");
        int index = findContact(new Contacts(newName,newNumber));
        if (index>=0) {
            System.out.println("Not possible to update because name is already in the list.");
            return;
        }
        index = findContact(oldContact);
        if (index >= 0) {
            contactsList.set(index,new Contacts(newName,newNumber));
            System.out.println("Contact named " + oldName +
                    " changed to " + contactsList.get(index).getName() +
                    " with number " + contactsList.get(index).getPhoneNumber() +
                    ".");
        } else {
            System.out.println("Contact to change was not found.");
        }
    }

    public void removeContact (String name) {
        Contacts contactToRemove = new Contacts(name,"");
        int index = findContact(contactToRemove);
        if (index>=0) {
            contactsList.remove(index);
            System.out.println("Contact named " + name + " removed from your contacts list.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public int findContact (Contacts contact) {
        for(int i = 0;i < contactsList.size();i++) {
            String name = contactsList.get(i).getName();
            String nameNew = contact.getName();
            if (contactsList.get(i).getName().equals(contact.getName())) {
                return i;
            }
        }
        return -1;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public ArrayList<Contacts> getContactsList() {
        return contactsList;
    }
}
