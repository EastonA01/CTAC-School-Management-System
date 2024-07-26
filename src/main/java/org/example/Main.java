package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher chris = new Teacher(1,"Chris",500);
        Teacher nathan = new Teacher(2,"Nathan",700);
        Teacher hector = new Teacher(3,"Hector",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(chris);
        teacherList.add(nathan);
        teacherList.add(hector);

        Student daylen = new Student(1,"Daylen",4);
        Student dewey = new Student(2,"Dewey",12);
        Student easton = new Student(3,"Easton",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(daylen);
        studentList.add(easton);
        studentList.add(dewey);
        

        School ctac = new School(teacherList,studentList);

        Teacher brandon = new Teacher(6,"Brandon", 900);

        ctac.addTeacher(brandon);
        
        daylen.payFees(5000);
        dewey.payFees(6000);
        System.out.println("CTAC has earned $"+ ctac.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        chris.receiveSalary(chris.getSalary());
        System.out.println("CTAC has spent for salary to " + chris.getName()
                +" and now has $" + ctac.getTotalMoneyEarned());

        hector.receiveSalary(hector.getSalary());
        System.out.println("CTAC has spent for salary to " + hector.getName()
                +" and now has $" + ctac.getTotalMoneyEarned());
        
        System.out.println(dewey);

        nathan.receiveSalary(nathan.getSalary());

        System.out.println(nathan);

        // Additional testing to use video's never used methods
        // Student methods
        System.out.println("Student "+ dewey.getName() +" id is: "+  dewey.getId());
        System.out.println(dewey.getName() + " owes " + dewey.getRemainingFees());
        System.out.println("Student has paid " + dewey.getFeesPaid() + " with a total fee of: " + dewey.getFeesTotal());
        System.out.println("Current grade is: " + dewey.getGrade());
        System.out.println("Updating Grade....");
        dewey.setGrade(96);
        System.out.println("New grade is: " + dewey.getGrade());

        // School methods
        System.out.println("Teachers: " + ctac.getTeachers());
        System.out.println("Students: " + ctac.getStudents());
        Student mike = new Student(3,"mike",5);
        ctac.addStudent(mike);
        System.out.println("New Student Added!");
        System.out.println("Total Money Spent: " + ctac.getTotalMoneySpent());

        // Teacher methods
        System.out.println("Hector's ID is: " + hector.getId());
        System.out.println("Setting new salary...");
        hector.setSalary(100000);
        System.out.println("New salary is: " + hector.getSalary());
        System.out.println("CTAC has spent for salary to " + hector.getName()
                +" and now has $" + ctac.getTotalMoneyEarned());
    }
}