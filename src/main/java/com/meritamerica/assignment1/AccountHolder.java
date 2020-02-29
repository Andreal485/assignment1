package com.meritamerica.assignment1;

//this class allows instantiation of an account holder object in conjunction with the CheckingAccount &
//SavingsAccount objects.
public class AccountHolder {

    private String firstName = ""; //account holders first name
    private String middleName = ""; // holds account holder's middle name
    private String lastName = "";  // holds account holder's last name
    private String ssn = ""; // holds account holders
    //private double checkingAccountOpeningBalance= 0 ; // the opening balance of a checking account
    //private double savingsAccountOpeningBalance = 0 ; // the opening balance of a savings account
    CheckingAccount checkingAccount = null; //instantiation of the checking account class 
    SavingsAccount savingsAccount = null; // instantiation of the savings account class
    
    //The account holder constructor that allows for all needed fields to be generated when 
    //instantiation of account holder class occurs
    
    public AccountHolder(String firstName, String middleName, String lastName, String ssn,
                         double checkingAccountOpeningBalance,
                         double savingsAccountOpeningBalance) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.checkingAccount = new CheckingAccount(checkingAccountOpeningBalance);
        this.savingsAccount = new SavingsAccount(savingsAccountOpeningBalance);;
    }
    
    //The default constructor for account holder, allows for fields to be set at a later time
   
    
    public AccountHolder() {
    }
    
    // Allows social security number to remain private, but still be retrieved by our account holder object
    public String getSsn() {
        return ssn;
    }
    //Allows for social security number to be set without having to interact with variable directly 
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    
    //this will return savingsAccount object when referenced 
    public SavingsAccount getsavingAccount(){
        return savingsAccount;
    }
    
    //this will return checkingAccount object when referenced 
    public CheckingAccount getCheckingAccount(){
        return checkingAccount;

    }
    //allows for "lastname" field to be retrieved without touching the field
    public String getLastName() {
        return lastName;
    }
    
    //allows for lastname field to be retrieved without referencing the field
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    //allows for "middlename" field to be retrieved without touching the field
    public String getMiddleName() {
        return middleName;
    }
    
    //allows for middlename field to be retrieved without referencing the field
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }


  //allows for "firstname" field to be retrieved without touching the field
    public String getFirstName() {
        return firstName;
    }
    //allows for firstname field to be retrieved without referencing the field
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    //this method allows for the data we have incorporated in the AccountHolder class/object to be displayed in a String
    //as opposed to displaying the value of the object as a hashcode
    @Override
    public String toString(){
        return "Name: " + firstName + " " + middleName + " " + lastName + ".\nSSN: "
                + ssn + ".\nChecking Account Balance: $" + Math.round(100*checkingAccount.getCheckingAccountBalance())/100.0
                + "\nChecking Account " +
                "interest rate: " + (10*checkingAccount.getCheckingAccountInterestRate()) + "%\nChecking Account Balance in 3 years: $" +
                Math.round(100*checkingAccount.futureValue(3))/100.0+ ".\n" + "Savings Account Balance: " +
                Math.round(100*savingsAccount.getSavingAccountBalance())/100.0 + ".\nSavings Account Interest Rate: " +
                (savingsAccount.getSavingAccountInterest()*10) + "%.\nSavings Account Balance in 3 years: " + Math.round(100*savingsAccount.futureValue(3))/100.0;
    }



}