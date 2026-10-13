package org.example;

public class TemperatureConverter {

        double celsius ;
        double fahrenheit;

    public double getFahrenheit() {
        return fahrenheit = (celsius * 9 / 5) + 32;
    }

    public void display(){
        System.out.println(celsius+" in Celsius equals "+getFahrenheit()+" in fahrenheit.");
    }


}
