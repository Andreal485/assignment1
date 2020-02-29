package com.meritamerica.assignment1;


//main class in program, replacement for "Main" 
public class MeritAmericaBankApp {
	//main method, used for implementation of AccountHolder, CheckingAccount, SavingsAccount
    public static void main(String[] args) {
        AccountHolder holder = new AccountHolder("John", "James", "Doe",
                "123-45-6789", 100, 1000);
        System.out.println(holder);
        holder.checkingAccount.deposit(500);
        holder.savingsAccount.withdraw(800);
        System.out.println(holder.checkingAccount.toString());
        System.out.println(holder.savingsAccount.toString());

        AccountHolder holder2 = new AccountHolder("James", "John", "Doe", "123-45-6789",
                200, 500);
        holder2.checkingAccount.deposit(-500);
        holder2.savingsAccount.withdraw(600);
        System.out.println(holder2);


    }
}