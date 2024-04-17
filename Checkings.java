package javabankapp;

public class Checkings extends Account {
//    List properties specific to a checking account.
    private long debitCardNumber;
    private long debitCardPin;
    private int debitCardNumberDigits = 12;
    private int debitCardPinDigits = 4;
//    constructor to initialize the checking account
//    List methods specific to the checking account.
    public Checkings(String name, String ssn, double initialDeposit) {
        super(name, ssn, initialDeposit);
        this.account_number = "1" + this.account_number;
//        System.out.println("ACCOUNT NUMBER: " + this.account_number);
//        System.out.println("NEW CHECKING ACCOUNT ");
    }

    @Override
    public void showInfo() {
            super.showInfo();
            System.out.println("RATE: " + this.rate + "%");
            System.out.println("ACCOUNT TYPE: Checking" );
            System.out.println(
                    "Your checking account features: " +
                            "\n Debit Card Number: " + this.debitCardNumber +
                            "\n Debit card PIN: " + this.debitCardPin);
    }

    public void setDebitCard() {
        this.debitCardNumber =  (long) (Math.pow(10,debitCardNumberDigits-1) +  Math.random()*(Math.pow(10,debitCardNumberDigits)-Math.pow(10,debitCardNumberDigits-1)));
        this.debitCardPin = (long) (Math.pow(10,debitCardPinDigits-1) + Math.random()*(Math.pow(10,debitCardPinDigits)-Math.pow(10,debitCardPinDigits-1)));
    }

    public void setRate() {
        this.rate = 0.15 * IBaseRate.getBaseRate();
    }
    }


