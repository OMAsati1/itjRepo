package com.om;

public class Student {
    private int id;
    private int rollNo;
    private int marks;
    private String name;

    public Student(int id, int rollNo, int marks, String name) {
        setDetails(id, rollNo, marks, name);
    }

    public void setDetails(int newId, int newRollNo, int newMarks, String newName) {
        id = newId;
        rollNo = newRollNo;
        marks = newMarks;
        name = newName;
    }

    public String getDetails() {
        return "Name: " + name + ", ID: " + id + ", Roll No: " + rollNo + ", Marks: " + marks;
    }

    public void displayStudentDetails() {
        System.out.println(getDetails());
    }

    public static void main(String[] args) {
        Student student = new Student(1, 73, 90, "Om Asati");

        student.displayStudentDetails();

        student.setDetails(2, 80, 93, "Bruce lee");

        student.displayStudentDetails();
    }
}

