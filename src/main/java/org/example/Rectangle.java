package org.example;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    public double area(){
        return length*width;
    }

    public double perimeter(){
        return 2*(length+width);
    }

    public void displayDetails(){
        System.out.println("Area: "+area());
        System.out.println("Perimeter: "+perimeter());

    }


}
