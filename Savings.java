package bankaccountapp;

public class Savings extends Account {

//    List properties specific to the savings account.
    private int safetyDepositBoxId;
    private int safetyDepositBoxKey;
    private int safetyDepositBoxIdDigits = 3;
    private int safetyDepositBoxKeyDigits = 4;
//    constructor to initialize the savings properties
//    List methods specific to the savings account.

    public Savings(String name, String ssn, double initialDeposit) {
      super(name, ssn, initialDeposit);
      this.account_number = "2" + this.account_number;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("ACCOUNT TYPE: Saving"  );
        System.out.println("RATE: " + this.rate + "%");
        System.out.println(
                "Your saving account features: " +
                        "\n Safety Deposit Box Id: " + this.safetyDepositBoxId +
                        "\n Safety Deposit Box Key: " + this.safetyDepositBoxKey);
    }

    public void setDepositBox() {
        this.safetyDepositBoxId =  (int) (Math.pow(10,safetyDepositBoxIdDigits-1) +  Math.random()*(Math.pow(10,safetyDepositBoxIdDigits)-Math.pow(10,safetyDepositBoxIdDigits-1)));
        this.safetyDepositBoxKey = (int) (Math.pow(10,safetyDepositBoxKeyDigits-1) + Math.random()*(Math.pow(10,safetyDepositBoxKeyDigits)-Math.pow(10,safetyDepositBoxKeyDigits-1)));
    }
    public void setRate() {
        this.rate = IBaseRate.getBaseRate() - 0.25;
    }




}




