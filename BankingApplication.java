// Paul Kang

import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = 0;

        //GUI testGui = new GUI();

        //Obtain information from user
        System.out.println("Please enter your first name: ");
        String firstName = sc.nextLine();
        System.out.println("Please enter your last name: ");
        String lastName = sc.nextLine();

        account user = new account(firstName, lastName, id, 0);

        System.out.println("Would you like to adjust your balance? (Y/N)");
        String userInput = sc.next().toUpperCase();

        while (userInput.equals("Y")) {
            user.adjustBalance();
            System.out.println("Would you like to adjust your balance? (Y/N)");
            userInput = sc.next().toUpperCase();
        }

        System.out.println(firstName + " " + lastName + "'s account balance: " + user.checkBalance());

        sc.close();
    }
}

/* Add in withdrawing, depositing, and checking balance options. Will add in GUI. */