package com.meritamerica.assignment1;

//class that allows for instantiation of a SavingsAccount object
public class SavingsAccount {
    private double savingAccountBalance = 0; //field allowing us to set the initial value of this account when creating object
    private double savingAccountInterestRate = .01;// field for setting interest rate, does not change

    // constructor requiring an opening balance value to be passed to instantiate the object
    public SavingsAccount(double startBalance) {
        savingAccountBalance = startBalance;

    }
  //allows for an amount to be withdrawn or subtracted from the account as long as the amount is less than than or equal the balance of account
    public boolean withdraw(double amount) {
        if (amount > savingAccountBalance) {
            System.out.println("Unable to process transaction.");
            return false;

        } else {
            savingAccountBalance -= amount;
            System.out.println("The transaction was a success! Your new balance is:" + savingAccountBalance);
            return true;
        }
    }
    	//allows for an amount to  be deposited into the account, as long as amount is not negative
        public boolean deposit ( double amount){
            if (amount <= 0) {
                System.out.println("Unable to process transaction.");
                return false;

            } else {
                savingAccountBalance += amount;
                System.out.println("The transaction was a success! Your new balance is:" + savingAccountBalance);
                return true;

            }
        }
        //gets the accounts interest rate so the field itself can remain private
        public double getSavingAccountInterest () {
            return savingAccountInterestRate;
        }
        //gets the accounts current balance, allows the field to remain private
        public double getSavingAccountBalance () {
            return savingAccountBalance;
        }
        //calculates the future value of an an account using number of years as a parameter
        public double futureValue ( int years){
            return savingAccountBalance * (Math.pow((1 + savingAccountInterestRate), years));

        }
        //a method to return the values of the checking account as a string
        @Override
        public String toString(){
            return "Savings Account Balance: " + Math.round(100*savingAccountBalance)/100.0 + ".\nSavings Account Interest Rate: " +
                    (getSavingAccountInterest()*10) + "%.\nSavings Account Balance in 3 years: " + Math.round(100*futureValue(3))/100;
        }
    }
