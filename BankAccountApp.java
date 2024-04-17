package javabankapp;

public class BankAccountApp {
    public static void main(String[] args) {
        Checkings chk1 = new Checkings("Tom Wilson", "15874569823", 5000);
        chk1.setDebitCard();
        chk1.showInfo();

        Savings sav1 = new Savings("Paul Macarthney", "8795621456", 3500);
        sav1.setDepositBox();
        sav1.showInfo();

        sav1.deposit(5000);
        sav1.withdraw(100);
        sav1.transfer(1700, "Ghissa");
        sav1.compound();

    }
}


