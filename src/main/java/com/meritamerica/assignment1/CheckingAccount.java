package com.meritamerica.assignment1;

//class that allows for instantiation of a CheckingAccount object
public class CheckingAccount {
    private double checkingAccountBalance = 0; // field allowing us to set the initial value of this account when creating object
    private double checkingAccountInterestRate = .0001;// field for setting interest rate, does not change
    private double futureValue; // allows for future value to be returned from future value method as a double
    // constructor requiring an opening balance value to be passed to instantiate the object
    public CheckingAccount(double openingBalance) {
        checkingAccountBalance = openingBalance;
}
    
    //allows for an amount to be withdrawn or subtracted from the account as long as the amount is less than than or equal the balance of account
    public boolean withdraw(double amount) {
        if (amount > checkingAccountBalance) {
            System.out.println("Unable to process transaction.");
            return false;

        } else {
            checkingAccountBalance -= amount;
            System.out.println("The transaction was a success! Your new balance is:" + checkingAccountBalance);
            return true;
        }
}	//allows for an amount to  be deposited into the account, as long as amount is not negative
    public boolean deposit(double amount){
        if (amount <= 0) {
            System.out.println("Unable to process transaction.");
            return false;

        } else {
            checkingAccountBalance += amount;
            System.out.println("The transaction was a success! Your new balance is:" + checkingAccountBalance);
            return true;

        }
    }
    //gets the accounts interest rate so the field itself can remain private
    public double getCheckingAccountInterestRate() {
        return checkingAccountInterestRate;
    }
    
    //gets the accounts current balance, allows the field to remain private
    public double getCheckingAccountBalance() {
        return checkingAccountBalance;
    }
    
    
    //calculates the future value of an an account using number of years as a parameter 
    public double futureValue(int years){
        futureValue = checkingAccountBalance * (Math.pow( (1+checkingAccountInterestRate), years));
        return futureValue;

    }
    //a method to return the values of the checking account as a string
    @Override
    public String toString(){
        return "Checking Account Balance: $" + Math.round(100*getCheckingAccountBalance())/100.0 + "\nChecking Account " +
                "interest rate: " + (10*getCheckingAccountInterestRate()) + "%\nChecking Account Balance in 3 years: $" +
                Math.round(100*futureValue(3))/100.0+ ".";
    }

}