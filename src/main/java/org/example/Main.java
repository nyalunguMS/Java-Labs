package org.example;


public class Main {
    static void main(){

        StudentDetails student = new StudentDetails();
        student.name = "Naledi";
        student.age = 20;
        student.average = 76.5;
        student.status = true;
        student.display();
        System.out.println("======================================");

        ShoppingTotal item = new ShoppingTotal();
        item.name = "PC";
        item.price = 500.00;
        item.quantity = 2;
        item.discount = 0.10;

        item.getFinalAmount();
        item.display();
        System.out.println("======================================");

        TemperatureConverter value = new TemperatureConverter();
        value.celsius = 14;
        value.getFahrenheit();
        value.display();
        System.out.println("======================================");

        PassOrFail status = new PassOrFail();
        status.mark = 75;
        status.output();
        status.display();
        System.out.println("======================================");

        GradeCalculator mark = new GradeCalculator();
        mark.mark = 82;
        status.output();
        mark.display();
        System.out.println("======================================");

        NumberAnalysis number = new NumberAnalysis();
        number.number = 3;
        number.analyzeNumber();
        System.out.println("======================================");

        LoginCheck login = new LoginCheck();
        login.username = "MMM";
        login.password = "12345";
        login.checkLogin();
        System.out.println("======================================");

        StudentMarks marks = new StudentMarks();
        marks.displayMarks();
        System.out.println("======================================");

        ArrayStats stats = new ArrayStats();
        stats.calculateStats();
        System.out.println("======================================");

        ArraySearch search = new ArraySearch();
        search.searchArray();
        System.out.println("======================================");

        EvenOddArray numbers = new EvenOddArray();
        numbers.displayValues();
        System.out.println("======================================");

        ReverseArray num = new ReverseArray();
        num.displayValues();
        System.out.println("======================================");


    }


}
