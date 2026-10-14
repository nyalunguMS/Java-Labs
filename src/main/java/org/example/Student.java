package org.example;

public class Student {
    String name;
    String studentNumber;
    double mark;

    Student(String name,String studentNumber,double mark){
        this.name = name;
        this.studentNumber = studentNumber;
        this.mark = mark;
    }
    boolean hasPassed(){
        if(this.mark >= 50){
            return true;
        }else {
            return false;
        }

    }
    void displayDetails(){
        System.out.println("Student: "+this.name+" pass status: "+hasPassed());
    }
}
