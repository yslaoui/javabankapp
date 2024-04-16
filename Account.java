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
        showInfo();
    }
//    Common methods
    private void setAccountNumber() {
        id += 1;
        String lastSsn = this.ssn.substring(this.ssn.length()-2, this.ssn.length());
        int randomNumber = (int)  (Math.random()*1000);
        this.account_number = lastSsn + id + randomNumber;
    }

    public void showInfo() {
        System.out.println("NAME: " + this.name);
        System.out.println("ACCOUNT NUMBER " + this.account_number);
        System.out.println("BALANCE: " + this.balance);
    }
}

