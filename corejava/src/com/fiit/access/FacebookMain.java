package com.fiit.access;

public class FacebookMain {
    public static void main(String[] args) {
        Facebook facebook = new Facebook();
        facebook.setAge(21);
        facebook.setContactNumber(123456789L);
        facebook.setMaritalStatus("Single");

        System.out.println("Contact Number:" +facebook.getContactNumber());
        System.out.println("Marital Status:" +facebook.getMaritalStatus());
        System.out.println("Age:" +facebook.getAge());
    }
}
