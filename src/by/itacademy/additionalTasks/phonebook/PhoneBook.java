package by.itacademy.additionalTasks.phonebook;

import by.itacademy.additionalTasks.phonebook.contacts.Contact;
import by.itacademy.additionalTasks.phonebook.contacts.FavoriteContact;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private final Map<String, Contact> contacts;
    private final Map<Integer, FavoriteContact> favoriteContacts = new HashMap<>();

    public PhoneBook(Map<String, Contact> contacts) {
        this.contacts = contacts;
    }

    public Contact addContact(Contact contact) {
        contacts.put(contact.getName(), contact);
        return contact;
    }

    public void removeContact(String name) {
        contacts.remove(name);
    }

    public void changeContact(String name, Contact contact) {

    }

    public boolean moveToFavorite(String name, String number, int fastCall) {
        FavoriteContact favoriteContact = (FavoriteContact) contacts.get(name);
        if (!(favoriteContacts.containsKey(fastCall))) {
            favoriteContacts.put(fastCall, favoriteContact);
            return true;
        }
        return false;
    }

    public Contact moveToContacts(String name) {
        return null;
    }
}
