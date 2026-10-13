package org.example;

public class GradeCalculator {
    int mark;
    public void display(){
        if((mark<0)||(mark>100)){
            System.out.println("Invalid mark");
        } else if (mark>80) {
            System.out.println("Distinction");
        } else if (mark>70) {
            System.out.println("Merit");
        } else if (mark>50) {
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
    }
}
