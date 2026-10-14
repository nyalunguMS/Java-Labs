package org.example;

public class BankAccount {
    private String accHolder;
    private String accNumber;
    private double balance;

    public BankAccount(String accHolder,String accNumber,double balance){
        this.accHolder = accHolder;
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount;
        }else{
            System.out.println("Invalid amount");

        }

    }

    public void withdraw(double amount){
        if(amount < this.balance) {
            this.balance -= amount;
        }else{
            System.out.println("Invalid Transaction");
        }
    }
    public void getBalance(){
        System.out.println("Your Balance is R"+this.balance);
    }

}
