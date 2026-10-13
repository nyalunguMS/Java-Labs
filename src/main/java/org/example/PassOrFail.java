package org.example;

public class PassOrFail {
    int mark;

    public String output(){
        if((mark<0)||(mark>100)){
            return "Invalid mark";
        } else if (mark>50) {
            return "Pass";
        }else {
            return "Fail";
        }
    }
    public void display(){
        System.out.println(output());
    }
}
