package org.example;

public class Student2 {
    private String studentNumber;
    private String name;
    int[] marks;

    public Student2(String studentNumber,String name,int[] marks){
        this.studentNumber = studentNumber;
        this.name = name;
        this.marks = marks;

    }

    public double avg(){
        int total = 0;
        for(int mark : marks){
            total+=mark;
        }
        return total/3;

    }
    public boolean hasPassed(){
        if(avg() >= 50){
            return true;
        }
        return false;
    }
    public void displayDetails(){
        System.out.println("Student number: "+studentNumber);
        System.out.println("Student name: "+name);
        System.out.println("Student marks: "+marks);
        System.out.println("Pass status "+ hasPassed());
    }
}
