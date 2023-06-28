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
    public void adjustBalance(String userInput){
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like ot adjust your balance? (Y/N)");

        sc.close();
    }
}
