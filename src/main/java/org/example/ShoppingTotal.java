package org.example;

public class ShoppingTotal {
    static void main(){
        String name = "Apples";
        double price = 3.0;
        int quantity = 20;
        double totalCost;
        double finalAmount;
        double discount = 0.2;

        totalCost = price * quantity;
        finalAmount = totalCost*(1-discount);

        System.out.println("The final amount paid for "+name+" is R"+finalAmount);



    }
}
