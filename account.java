import java.util.Scanner;

public class account {
    String firstName;
    String lastName;
    int id;
    int balance;

    // Constructors
    account() {

    }
    account(String firstName, String lastName, int id, int balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }
    public void withdraw(int amount) {
        balance -= amount;
    }
    public int checkBalance() {
        return balance;
    }
    public void adjustBalance(){
        Scanner scAccount = new Scanner(System.in);
        String answer = "";

        while (!answer.equals("E")) {
            System.out.println("Would you like to withdraw, deposit, or exit? (W/D/E)");
            answer = scAccount.next();

            switch (answer) {
                case "W":
                    //Withdraw
                    break;
                case "D":
                    //Deposit
                    break;
                case "E":
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }

    }
}
