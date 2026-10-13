package org.example;

public class ShoppingTotal {

    String name;
    double price;
    int quantity;
    double totalCost;
    double finalAmount;
    double discount;

    public double getFinalAmount() {
        totalCost = price*quantity;
        finalAmount = totalCost*(1-discount);
        return finalAmount;
    }
    public void display(){

        System.out.println("Item Name: " + name);
        System.out.println("Price: R" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: R" + totalCost);
        System.out.println("Discount: " + (discount * 100) + "%");
        System.out.println("Final Amount: R" + finalAmount);

    }
}
