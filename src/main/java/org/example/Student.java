package org.example;

public class Student {
    // Student object variables
    private final int id; // We never update studentID
    private final String name; // Never update student name
    private int grade;
    private int feesPaid;
    private int feesTotal;

    // Student constructor
    public Student(int id, String name,int grade){
        this.feesPaid=0;
        this.feesTotal=30000; // Initial debt ;-;
        this.id=id;
        this.name=name;
        this.grade=grade;

    }

    // Update students grade
    public void setGrade(int grade){
        this.grade=grade;
    }

    // Update paid fees and add to school funds
    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    // StudentID
    public int getId() {
        return id;
    }

    // Student Name
    public String getName() {
        return name;
    }

    // Return grade (self-explanatory)
    public int getGrade() {
        return grade;
    }

    // Return fees paid (self-explanatory)
    public int getFeesPaid() {
        return feesPaid;
    }

    // Return total fees
    public int getFeesTotal() {
        return feesTotal;
    }

    // Return remaining fees after paid fees
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name :"+name+
                " Total fees paid so far $"+ feesPaid;
    }
}