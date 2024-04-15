package bankaccountapp;

public class Checkings extends Account {
//    List properties specific to a checking account.
    int debitCardNumber;
    int debitCardPin;
//    constructor to initialize the checking account
//    List methods specific to the checking account.
    public Checkings(String name, String ssn, double initialDeposit) {
        super(name, ssn, initialDeposit);
        this.account_number = "1" + this.account_number;
        System.out.println("ACCOUNT NUMBER: " + this.account_number);
        System.out.println("NEW CHECKING ACCOUNT ");
    }
}
