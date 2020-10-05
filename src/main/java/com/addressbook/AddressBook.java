package com.addressbook;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
        static final int ADDRESS = 1;
        static final int CITY = 2;
        static final int STATE = 3;
        static final int ZIP = 4;
        static final int PHONENUMBER = 5;
        public static List<ContactPerson> persons = new ArrayList<>();
        static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int choice = 0;
        AddressBook contact = new AddressBook();
        System.out.println("Welcome to AddressBook");
        while (choice < 4) {
            System.out.println("1.Add Person ");
            System.out.println("2.Print persons details");
            System.out.println("3.Edit the person details");
            System.out.println("4.Exit");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    contact.addPerson();
                    break;
                case 2:
                    contact.printPersonDetails();
                    break;
                case 3:
                    contact.editPersonDetails();
                    break;
            }
        }
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
    public void printPersonDetails()
    {
        if (persons.isEmpty())
        {
            System.out.println("There are no contact to print ");
        }
        else
        {
            for (ContactPerson contact : persons)
            {
                System.out.println(contact);
            }
        }
    }
    public void editPersonDetails()
    {
        if (persons.isEmpty())
        {
            System.out.println("There are no contacts to edit ");
        }
        else
        {
            String address, city, state;
            long phone, zip;
            int id;
            for (ContactPerson contact : persons)
            {
                System.out.println("ID: #" + persons.indexOf(contact) + " : " + contact);
            }
            System.out.println(" Enter ID of contact to Edit : ");
            id = scan.nextInt();
            System.out.println(persons.get(id));
            System.out.println("please select the option to edit...\n \n 1. Address \n 2.city \n 3.state \n 4.zip \n 5.phone number ");
            int choice = scan.nextInt();
            switch (choice)
            {
                case ADDRESS:
                    System.out.println("Enter Address: ");
                    address = scan.next();
                    persons.get(id).setAddress(address);
                    break;
                case CITY:
                    System.out.println("Enter City");
                    city = scan.next();
                    persons.get(id).setCity(city);
                    break;
                case STATE:
                    System.out.println("Enter State");
                    state = scan.next();
                    persons.get(id).setState(state);
                case ZIP:
                    System.out.println("Enter Zip");
                    zip = scan.nextLong();
                    persons.get(id).setZip(zip);
                    break;
                case PHONENUMBER:
                    System.out.println("Enter Mobile number");
                    phone = scan.nextLong();
                    persons.get(id).setPhoneNumber(phone);
                    break;
                default:
                    System.out.println("Please Enter Valid Option");
                    editPersonDetails();
            }
        }
    }


}

