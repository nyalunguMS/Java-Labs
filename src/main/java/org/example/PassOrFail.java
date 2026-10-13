package org.example;

public class PassOrFail {
    int mark;
    public void display(){
        if((mark<0)||(mark>100)){
            System.out.println("Invalid mark");
        } else if (mark>50) {
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
    }
}
