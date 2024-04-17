package javabankapp;

import utilities.Csv;

import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        List<String[]> data =  Csv.read("C:\\Documents\\java\\projects\\bankaccountapp\\bankaccoutapp\\src\\javabankapp\\NewBankAccounts.csv");
        for (String[] row: data ) {
            String name = row[0];
            String ssn = row[1];
            String type = row[2];
            String amount = row[3];
            if (type.equals("Savings")) {
                System.out.println("OPEN A SAVINGS ACCOUNT");
            }
            else {
                System.out.println("OPEN A CHECKING ACCOUNT");
            }
            System.out.println(name + " " + ssn + " " + type + " " + amount + "$");
        }

        /*        Checkings chk1 = new Checkings("Tom Wilson", "15874569823", 5000);
        chk1.setDebitCard();
        chk1.showInfo();

        Savings sav1 = new Savings("Paul Macarthney", "8795621456", 3500);
        sav1.setDepositBox();
        sav1.showInfo();

        sav1.deposit(5000);
        sav1.withdraw(100);
        sav1.transfer(1700, "Ghissa");
        sav1.compound();*/

    }
}



