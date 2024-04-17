package javabankapp;

import utilities.Csv;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        List<String[]> data =  Csv.read("C:\\Documents\\java\\projects\\bankaccountapp\\bankaccoutapp\\src\\javabankapp\\NewBankAccounts.csv");
        List<Account> accounts = new LinkedList<Account>();
        for (String[] row: data ) {
            String name = row[0];
            String ssn = row[1];
            String type = row[2];
            String amount = row[3];
            if (type.equals("Savings")) {
                System.out.println("OPEN A SAVINGS ACCOUNT");
                accounts.add(new Savings(name, ssn, Double.parseDouble(amount)));
            }
            else {
                System.out.println("OPEN A CHECKING ACCOUNT");
                accounts.add(new Checkings(name, ssn, Double.parseDouble(amount)));
            }
        }
        for (Account account: accounts) {
            account.showInfo();
        }
    }
}



