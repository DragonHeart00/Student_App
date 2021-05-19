package com.example.student_app.Model;

public class Student {
    private String firstName, lastName, email, startAt, endAt;
    private int idNumber, phoneNumber, age;

    public Student(String firstName, int idNumber) {
        this.firstName = firstName;
        this.idNumber = idNumber;
    }


    public Student(String firstName, String lastName, String email, String startAt, String endAt, int idNumber, int phoneNumber, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.startAt = startAt;
        this.endAt = endAt;
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStartAt() {
        return startAt;
    }

    public void setStartAt(String startAt) {
        this.startAt = startAt;
    }

    public String getEndAt() {
        return endAt;
    }

    public void setEndAt(String endAt) {
        this.endAt = endAt;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
