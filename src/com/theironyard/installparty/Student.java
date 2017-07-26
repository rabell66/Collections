package com.theironyard.installparty;

public class Student {

    private String firstName;
    private String lastName;
    private int id;
    private String grade;


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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String toString() {
        String output = String.format("'Name: %s %s, Grade: %s ID: %s", this.firstName,this.lastName, this.grade, this.id);
        return output;

    }

}



