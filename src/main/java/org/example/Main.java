package org.example;


public class Main {
    static void main(){

        StudentDetails student = new StudentDetails();
        student.name = "Naledi";
        student.age = 20;
        student.average = 76.5;
        student.status = true;
        student.display();

        ShoppingTotal item = new ShoppingTotal();
        item.name = "PC";
        item.price = 500.00;
        item.quantity = 2;
        item.discount = 0.10;

        item.getFinalAmount();
        item.display();

        TemperatureConverter value = new TemperatureConverter();
        value.celsius = 14;
        value.getFahrenheit();
        value.display();

        PassOrFail status = new PassOrFail();
        status.mark = 75;
        status.output();
        status.display();

        GradeCalculator mark = new GradeCalculator();
        mark.mark = 82;
        status.output();
        mark.display();

        NumberAnalysis number = new NumberAnalysis();
        number.number = 3;
        number.analyzeNumber();

        LoginCheck login = new LoginCheck();
        login.username = "MMM";
        login.password = "12345";
        login.checkLogin();

    }


}
