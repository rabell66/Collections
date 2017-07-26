package com.theironyard.installparty;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String firstNames[] = {"Adam", "Alex", "Bobby", "Brian", "Charles", "Clarke", "Danny", "Doug", "Edward", "Elliot",
                "Francisco", "Fred", "George", "Glenn", "Howard"};
        String lastNames[] = {"Adams", "Anderson", "Black", "Bivins", "Clark", "Christionson", "Danvers", "Durham", "Ender",
                "Evans", "Ferdinand", "Flintstone", "Ganders", "Garrison", "theDuck"};

        List<Student> students = new ArrayList();
        List<Student> teachers = new ArrayList();

        for (int i = 0; i < firstNames.length; i++) {

            Student student = new Student();
            student.setFirstName(firstNames[i]);
            student.setLastName(lastNames[i]);
            student.setGrade("1");
            student.setId(i);
            students.add(student);



            if (i % 5 == 0) {
            Student teacher = new Student();
            teacher.setFirstName(firstNames[i-1]);
            teacher.setLastName((lastNames[i-2]));
            teacher.setGrade("1");
            teacher.setId(i);
            teachers.add(teacher);}

        }

    }
}
