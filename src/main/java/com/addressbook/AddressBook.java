package com.addressbook;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    static final int ONE = 1;
    static final int TWO = 2;
    static final int THREE = 3;
    static final int FOUR = 4;
    static final int FIVE = 5;
    public static List<ContactPerson> persons = new ArrayList<>();
    public static ArrayList<String> personName = new ArrayList<>();
    public static ArrayList<String> personCities = new ArrayList<>();
    public static ArrayList<String> personStates = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        AddressBook contact = new AddressBook();
        System.out.println("Welcome to AddressBook");
        while (choice < 9) {
            System.out.println("1.Add Person ");
            System.out.println("2.Print persons details");
            System.out.println("3.Edit the person details");
            System.out.println("4.Delete the person ");
            System.out.println("5.Sort By FirstName ");
            System.out.println("6.sort by Statename");
            System.out.println("7.view person by city and state");
            System.out.println("8.Search person by city and state");
            System.out.println("9.Exit");
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
                case 4:
                    contact.deletePerson();
                    break;
                case 5:
                    contact.sortByName();
                    break;
                case 6:
                    contact.sortByState();
                    break;
                case 7:
                    contact.viewByCityState();
                    break;
                case 8:
                    contact.searchPerson();
                    break;
            }
        }
    }

    public void addPerson() {
        System.out.println("Enter person details:");
        System.out.println("\n Enter FirstName : ");
        String firstName = scan.next();
        if (checkPersonExistence(firstName)) {
            System.out.println("person already exist,enter different name");
        } else {
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

    public void printPersonDetails() {
        if (persons.isEmpty()) {
            System.out.println("There are no contact to print ");
        } else {
            for (ContactPerson contact : persons) {
                System.out.println(contact);
            }
        }
    }

    public void editPersonDetails() {
        if (persons.isEmpty()) {
            System.out.println("There are no contacts to edit ");
        } else {
            String address, city, state;
            long phone, zip;
            int id;
            for (ContactPerson contact : persons) {
                System.out.println("ID: #" + persons.indexOf(contact) + " : " + contact);
            }
            System.out.println(" Enter ID of contact to Edit : ");
            id = scan.nextInt();
            System.out.println(persons.get(id));
            System.out.println("please select the option to edit...\n \n 1. Address \n 2.city \n 3.state \n 4.zip \n 5.phone number ");
            int choice = scan.nextInt();


            switch (choice)
            {
                case ONE:
                    System.out.println("Enter Address: ");
                    address = scan.next();
                    persons.get(id).setAddress(address);
                    break;
                case TWO:
                    System.out.println("Enter City");
                    city = scan.next();
                    persons.get(id).setCity(city);
                    break;
                case THREE:
                    System.out.println("Enter State");
                    state = scan.next();
                    persons.get(id).setState(state);
                case FOUR:
                    System.out.println("Enter Zip");
                    zip = scan.nextLong();
                    persons.get(id).setZip(zip);
                    break;
                case FIVE:
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

    public void deletePerson() {
        if (persons.isEmpty()) {
            System.out.println("There are no persons to delete in the addressbook");
        } else {
            System.out.println("Enter firstname to delete the person");
            String firstName = scan.next();
            for (int count = 0; count < persons.size(); count++) {
                if (persons.get(count).getFirstName().equals(firstName)) {
                    persons.remove(persons.get(count));
                }
            }
        }
    }

    public boolean checkPersonExistence(String name) {
        int flag = 0;
        for (ContactPerson person : persons) {
            if (person.getFirstName().equals(name)) {
                flag = 1;
            }
        }
        return flag == 1;
    }

    public void sortByName() {
        persons.sort(ContactPerson.firstNamesorting);
        persons.forEach(System.out::println);
    }

    public void sortByState() {
        persons.sort(ContactPerson.stateSorting);
        persons.forEach(System.out::println);
    }




    public void viewByCityState()
    {
        String city;
        String state;
        System.out.println("Enter statename :");
        String stateName = scan.next();
        System.out.println("Enter cityname :");
        String cityName = scan.next();
        for( int count =0; count < persons.size(); count++)
        {
            if(persons.get(count).getState().equals(stateName) && persons.get(count).getCity().equals(cityName))
            {
                System.out.println(count + "." + persons.get(count).toString());
            }

        }

    }
    public void searchPerson()
    {
        int choice;
        String city,state;
        System.out.println(""); System.out.println("\n\t 1.Search persons in cities :" +
            "\n\t 2. Search persons in State : ");
        choice = scan.nextInt();
        if (choice == 1)
        {
            System.out.printf("Enter Cities : ");
            city = scan.next();
            for (int count = 0; count < persons.size(); count++)
            {
                if (persons.get(count).getCity().equals(city))
                {
                    System.out.println(count + ". " + persons.get(count).toString());
                }
            }
        }
        else if (choice == 2)
        {
            System.out.printf("Enter State : ");
            state = scan.next();
            for (int count = 0; count < persons.size(); count++)
            {
                if (persons.get(count).getState().equals(state))
                {
                    System.out.println(count + ". " + persons.get(count).toString());
                }
            }
        }


    }
}
