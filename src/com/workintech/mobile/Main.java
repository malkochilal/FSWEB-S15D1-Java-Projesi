package com.workintech.mobile;

public class Main {
    public static void main(String[] args) {
        MobilePhone phone=new MobilePhone("12345677");
     Contact ahmet=new Contact("Ahmet","75214455");
     phone.addNewContact(ahmet);
        phone.addNewContact(new Contact("Hilal","7777777"));
     phone.addNewContact(new Contact("Mehmet","1111777"));
        phone.addNewContact(new Contact("Ali","1111777"));
        phone.addNewContact(new Contact("Mustafa","1111777"));
phone.printContact();
        System.out.println("Index:"+phone.findContact(ahmet));
        System.out.println("Index with string :" +phone.findContact(ahmet.getName()));
        System.out.println("Query Contact:" +phone.queryContact("Ayse"));
phone.removeContact(ahmet);
phone.printContact();
    }
}
