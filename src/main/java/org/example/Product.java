package org.example;

public class Product {
    private int ID;
    private String name;
    private double price;
    private int quantity;

    public Product(int ID,String name,double price,int quantity){

        this.ID = ID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayDetails() {
        System.out.println("Product ID: " + ID);
        System.out.println("Product Name: " + name);
        System.out.println("Price: R" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Stock Value: R"+calculateStockValue());
    }


    public void addStock(int amount) {
        if (amount > 0) {
            quantity += amount;
            System.out.println(amount + " items added to stock.");
        } else {
            System.out.println("Amount must be greater than zero.");
        }
    }

    public void sellProduct(int amount) {
        if (amount <= 0) {
            System.out.println("Sale amount must be greater than zero.");
        } else if (amount > quantity) {
            System.out.println("Not enough stock available!");
        } else {
            quantity -= amount;
            System.out.println(amount + " items sold.");
        }
    }
    public double calculateStockValue() {
        return price * quantity;
    }




}
