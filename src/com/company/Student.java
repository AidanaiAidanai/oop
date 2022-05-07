package com.company;

public class Student {
    private String name;
    private String email;
    private int age;

    void setName(String surname){
        name = surname;
    }
    void setEmail(String account){
        email = account;
    }
    void setAge(int year){
        if(year<0){
            System.out.println("not be negative number");
        }
        else{
        age = year;
        }
    }
    String getName(){
        return name;
    }
    String getEmail(){
        return email;
    }
    int getAge(){
        return age;
    }
}
