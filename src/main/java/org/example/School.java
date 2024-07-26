package org.example;

import java.util.List;

public class School {
    // School object variables
    private List<Teacher> teachers;
    private List<Student> students;
    private static int  totalMoneyEarned;
    private static int totalMoneySpent;

    // School constructor
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    // Return list of teachers
    public List<Teacher> getTeachers() {
        return teachers;
    }

    // Add teacher to school
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    // Return list of students
    public List<Student> getStudents() {
        return students;
    }

    // Add student to school
    public void addStudent(Student student) {
        students.add(student);
    }

    // Return total earned
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    // Adds money earned
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    // Return total money spent
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    // Update money spent by school
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned-=moneySpent;
    }
}