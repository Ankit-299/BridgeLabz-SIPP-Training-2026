// Build an Address Book Management System that stores contact details such as name, phone number, and email address.
//  Design the application using multiple Java Collections to achieve efficient storage, searching, and duplicate prevention.
//  Your program should support the following functionalities:
//  I Store all contacts in an ArrayList to maintain an ordered list. Use a HashMap<String, Contact> for quick lookup of contacts by name. 
//  Use a HashSet<String> to ensure that duplicate phone numbers cannot be added. Implement functionality to add, search, delete, and display contacts.
//   Display all contacts sorted alphabetically by name using Collections.sort(). 
// Ensure that whenever a contact is added or deleted, all three collections remain synchronized and contain consistent data.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AddressBookManagement {
    public static void main(String[] args) {
      List<Contact> contactList = new ArrayList<>();
      Map<String, Contact> contactMap = new HashMap<>();
            Set<String> phoneNumberSet = new HashSet<>();      
            addContact("jamali", "12345", "jamali@example.com", contactList, contactMap, phoneNumberSet);
            addContact("bbbb", "67890", "bbbb@example.com", contactList, contactMap, phoneNumberSet);
            addContact("Eve", "12345", "eve@example.com", contactList, contactMap, phoneNumberSet);

            contactList.sort(null);
            for (Contact c : contactList) {
                    System.out.println(c);
            }

    }

    private static void addContact(String name, String phone, String email,
        List<Contact> list, Map<String, Contact> map, Set<String> phones) {
            if (phones.contains(phone)) {
                System.out.println("Phone number already exists: " + phone);
                return;
                }
                Contact c = new Contact(name, phone, email);
                list.add(c);
                map.put(name, c);
                phones.add(phone);
        }

    static class Contact implements Comparable<Contact> {
        String name;
        String phoneNumber;
        String email;

        Contact(String name, String phoneNumber, String email) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        @Override
        public int compareTo(Contact other) {
            return this.name.compareToIgnoreCase(other.name);
        }

        @Override
        public String toString() {
            return name + ", " + phoneNumber + ", " + email;
        }
    }
    public static void deleteContact(String name, List<Contact> list, Map<String, Contact> map, Set<String> phones) {
        Contact c = map.get(name);
        if (c != null) {
            list.remove(c);
            map.remove(name);
            phones.remove(c.phoneNumber);
            System.out.println("Deleted contact: " + name);
        } else {
            System.out.println("Contact not found: " + name);
        }
    }
    public static void searchContact(String name, Map<String, Contact> map) {
        Contact c = map.get(name);
        if (c != null) {
            System.out.println("Found contact: " + c);
        } else {
            System.out.println("Contact not found: " + name);
        }
    }
    public static void displayContacts(List<Contact> list) {
        list.sort(null);
        for (Contact c : list) {
            System.out.println(c);
        }
    }
    public static void displayContacts(Map<String, Contact> map) {
        List<Contact> list = new ArrayList<>(map.values());
        list.sort(null);
        for (Contact c : list) {
            System.out.println(c);
        }
    }
    public static void displayContacts(Set<String> phones, Map<String, Contact> map) {
        for (String phone : phones) {
            for (Contact c : map.values()) {
                if (c.phoneNumber.equals(phone)) {
                    System.out.println(c);
                    break;
                }
            }
        }
    }
    public static void displayContacts(List<Contact> list, Map<String, Contact> map, Set<String> phones) {
        displayContacts(list);
        displayContacts(map);
        displayContacts(phones, map);
    }
    public static void displayContacts(List<Contact> list, Map<String, Contact> map) {
        displayContacts(list);
        displayContacts(map);
    }
    public static void displayContacts(List<Contact> list, Set<String> phones) {
        displayContacts(list);
        displayContacts(phones, new HashMap<>());
    }
    public static void displayContacts(Map<String, Contact> map, Set<String> phones) {
        displayContacts(map);
        displayContacts(phones, map);
    }
    public static void displayContacts(List<Contact> list, Map<String, Contact> map, Set<String> phones, boolean sort) {
        if (sort) {
            displayContacts(list);
            displayContacts(map);
            displayContacts(phones, map);
        } else {
            for (Contact c : list) {
                System.out.println(c);
            }
            for (Contact c : map.values()) {
                System.out.println(c);
            }
            for (String phone : phones) {
                for (Contact c : map.values()) {
                    if (c.phoneNumber.equals(phone)) {
                        System.out.println(c);
                        break;
                    }
                }
            }
        }
    }
   
}