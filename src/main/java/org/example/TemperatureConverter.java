package org.example;

public class TemperatureConverter {
    static void main(){
        double celsius = 12;
        double fahrenheit;
        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius+" in Celsius equals "+fahrenheit+" in fahrenheit.");
    }
}
