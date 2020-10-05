package com.addressbook;

public class ContactPerson {
       public String firstName;
       public String lastName;
       public String address;
       public String city;
       public  String state;
       public long phoneNumber;
       public long zip;
       public ContactPerson(String firstName, String lastName,String address,String city,String state,long zip,long phoneNumber)
       {
           this.firstName = firstName;
           this.lastName = lastName;
           this.address = address;
           this.city = city;
           this.state = state;
           this.phoneNumber = phoneNumber;
           this.zip = zip;
       }
       public String getFirstName()
       {
           return firstName;
       }
       public void setFirstName(String firstName)
       {
        this.firstName = firstName;
       }
       public String getLastName()
       {
           return lastName;
       }
       public void setLastName(String lastName)
       {
        this.lastName = lastName;
       }
       public String getAddress()
       {
           return address;
       }
       public void setAddress(String address)
       {
        this.address = address;
       }
       public String getCity()
       {
        return city;
       }
       public void setCity(String city)
       {
        this.city = city;
       }
       public String getState()
       {
           return state;
       }
       public void setState(String state)
       {
        this.state = state;
       }
       public long getZip()
       {
        return zip;
       }
       public void setZip(long zip)
       {
        this.zip = zip;
       }
       public long getPhoneNumber()
       {
        return phoneNumber;
       }
       public void setPhoneNumber(long phoneNumber)
       {
        this.phoneNumber = phoneNumber;
       }
       public String toString()
       {
           return "Name:" + firstName + "" + lastName + "\t Address: " + address + "\t cityname: " + city + "\t statename: " + state + "\t pin code: " + zip + "\t phonenumber: " +phoneNumber+"\n";
       }


}

