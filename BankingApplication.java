// Paul Kang

import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {

        account paulk = new account("Paul", "Kang", 1, 0);
        System.out.println("Paul's balance: " + paulk.checkBalance());
    }
}

/* Add in withdrawing, depositing, and checking balance options. Will add in GUI. */