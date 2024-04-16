package bankaccountapp;

public abstract class Account {

 //   List common properties for the checking and savings subclasses
    String name;
    String ssn;
    double balance;
    String account_number;
    double rate;
    static int id = 10000;


//    Constructor to initialize these properties
    public Account(String name, String ssn, double initialDeposit) {
        this.name = name;
        this.ssn = ssn;
        this.balance = initialDeposit;
        setAccountNumber();
        setRate();
    }
//    Common methods
    private void setAccountNumber() {
        id += 1;
        String lastSsn = this.ssn.substring(this.ssn.length()-2, this.ssn.length());
        int randomNumber = (int)  (Math.random()*1000);
        this.account_number = lastSsn + id + randomNumber;
    }

    public void showInfo() {
        System.out.println("********************");
        System.out.println("NAME: " + this.name);
        System.out.println("ACCOUNT NUMBER " + this.account_number);
        System.out.println("BALANCE: " + this.balance);
    }

    public abstract void setRate();

    public void deposit(double amount) {
        System.out.println("Depositing " + amount + "$");
        this.balance += amount;
        this.printBalance();
    }

    public void withdraw(double amount) {
        System.out.println("Withdrawing " + amount + "$");
        this.balance -= amount;
        this.printBalance();
    }

    public void transfer(double amount, String destination) {
        System.out.println("Transfering " + amount + "$");
        this.balance -= amount;
        System.out.println("Transfer of " + amount + "$ to " + destination + "successful");
        this.printBalance();
    }

    public void printBalance() {
        System.out.println("Current Balance  " + this.balance);
    }
    public void compound() {
        double accruedInterest = this.rate * this.balance / 100;
        this.balance += accruedInterest;
        System.out.println("ACCRUED INTEREST: " + accruedInterest);
        this.printBalance();
    }


}

