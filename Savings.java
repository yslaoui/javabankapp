package bankaccountapp;

public class Savings extends Account {

//    List properties specific to the savings account.
    int safetyDepositBoxId;
    int safetyDepositBoxKey;
//    constructor to initialize the savings properties
//    List methods specific to the savings account.
      public Savings(String name, String ssn, double initialDeposit) {
          super(name, ssn, initialDeposit);
          this.account_number = "2" + this.account_number;
          System.out.println("ACCOUNT NUMBER: " + this.account_number);
          System.out.println("NEW SAVINGS ACCOUNT ");
      }
}


