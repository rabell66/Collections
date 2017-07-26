package com.theironyard.installparty;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String firstNames[] = {"Adam", "Alex", "Bobby", "Brian", "Charles", "Clarke", "Danny", "Doug", "Edward", "Elliot",
                "Francisco", "Fred", "George", "Glenn", "Howard"};
        String lastNames[] = {"Adams", "Anderson", "Black", "Bivins", "Clark", "Christionson", "Danvers", "Durham", "Ender",
                "Evans", "Ferdinand", "Flintstone", "Ganders", "Garrison", "theDuck"};

        List<Student> students = new ArrayList();
        List<Student> teachers = new ArrayList();
        Set firstSet = new HashSet();
        Set secondSet = new HashSet();
        Set thirdSet = new HashSet();

        for (int i = 0; i < firstNames.length; i++) {

            Student student = new Student();
            student.setFirstName(firstNames[i]);
            student.setLastName(lastNames[i]);
            student.setGrade("1");
            student.setId(i);
            students.add(student);
            if(i<5){
                 firstSet.add(student);
            }
            if(i>4 && i<10){
                secondSet.add(student);

            }
            if(i>9){
                thirdSet.add(student);}



            if ((i+1) % 5 == 0) {
            Student teacher = new Student();
            teacher.setFirstName(firstNames[i-1]);
            teacher.setLastName((lastNames[i-3]));
            teacher.setGrade("1");
            teacher.setId(i);
            teachers.add(teacher);}


        }
        HashMap<Student, Set> classroom =new HashMap<>();

            classroom.put(teachers.get(0),firstSet);
            classroom.put(teachers.get(1),secondSet);
            classroom.put(teachers.get(2),thirdSet);
            System.out.println(classroom.values());
            System.out.println(classroom.keySet());
            System.out.printf("Classroom \n" + classroom.entrySet());
    }
    }
