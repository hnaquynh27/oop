package com.oop.collections.phonebook;

import java.util.HashMap;

public class PhoneBookMap implements PhoneBook {
    HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        phoneBook = new HashMap<>();
    }

    public void addPerson(Student p) {
        if (!phoneBook.containsKey(p.phone)) {
            phoneBook.put(p.phone, p);
        }
    }

    public Student searchByName(String name) {
        for (Student student : phoneBook.values()) {
            if (student.name.equals(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByLastname(String lastname) {
        for (Student student : phoneBook.values()) {
            if (student.lastname.equals(lastname)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        for (Student student : phoneBook.values()) {
            if (student.name.equals(phone)) {
                return student;
            }
        }
        return null;
    }

    public void deleteByNumber(String phone) {
        Student student = searchByNumber(phone);
        if (student != null) {
            phoneBook.remove(student);
        }

    }
}
