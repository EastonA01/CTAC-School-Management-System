package org.example;

public class Teacher {
    // Variables for teacher object
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    // Teacher constructor
    public Teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    // Get teacherID
    public int getId(){
        return id;
    }

    // Get teacherName
    public String getName(){
        return name;
    }

    // Get salary
    public int getSalary(){
        return  salary;
    }

    // Set salary of teacher
    public void setSalary(int salary){
        this.salary=salary;
    }

    // Adds to salary, removes from school earnedMoney
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }


    @Override
    public String toString() {
        return "Name of the Teacher: " + name
                +" Total salary earned so far $"
                + salaryEarned;
    }
}