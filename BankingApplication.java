// Paul Kang

import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int id = 0;

        //GUI testGui = new GUI();

        //Obtain information from user
        System.out.println("Please enter your first name: ");
        String firstName = sc.nextLine();
        System.out.println("Please enter your last name: ");
        String lastName = sc.nextLine();

        account user = new account(firstName, lastName, id, 0);

        System.out.println("Would you like to adjust your balance? (Y/N)");
        String answer = sc.next();
        while (!answer.equals("N")) {
            if (answer.equals("Y")) {
                System.out.println("Would you like to withdraw or deposit? (W/D/exit)");
                String answer2 = sc2.next();
                if (answer2.equals("W")){
                    System.out.println("Please enter how much you would like to withdraw: ");
                    int withdraw = sc2.nextInt();
                    user.withdraw(withdraw);
                    continue;
                } else if (answer2.equals("D")) {
                    System.out.println("Please enter how much you would like to deposit: ");
                    int deposit = sc2.nextInt();
                    user.deposit(deposit);
                    continue;
                } else if (answer2.equals("exit")) {
                    break;
                } else {
                    System.out.println("Invalid input, please try again...");
                    continue;
                }            
            } else if (answer.equals("N")) {
                System.out.println("Goodbye");
                break;
            } else {
                System.out.println("Invalid input, please try again...");
            }
        }

        System.out.println(firstName + " " + lastName + "'s account balance: " + user.checkBalance());

        sc.close();
        sc2.close();
    }
}

/* Add in withdrawing, depositing, and checking balance options. Will add in GUI. */