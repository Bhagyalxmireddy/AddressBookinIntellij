package com.addressbook;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    public static List<ContactPerson> persons = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        AddressBook contact = new AddressBook();
        System.out.println("Welcome to AddressBook");
        contact.addPerson();

    }
    public void addPerson()
    {
        System.out.println("Enter person details:"); System.out.println("\n Enter FirstName : ");
        String firstName = scan.next();
        System.out.println("\n Enter lastName : ");
        String lastName = scan.next();
        System.out.println("\n Enter Address : ");
        String address = scan.next();
        System.out.println("\n Enter city : ");
        String city = scan.next();
        System.out.println("\n Enter state : ");
        String state = scan.next();
        System.out.println("\n Enter zip : ");
        long zip = scan.nextLong();
        System.out.println("\n Enter phone number : ");
        long phoneNumber = scan.nextLong();
        ContactPerson person1 = new ContactPerson(firstName, lastName, address, city, state, zip, phoneNumber);
        persons.add(person1);
        System.out.println("person details added successfully \n");
    }
}
