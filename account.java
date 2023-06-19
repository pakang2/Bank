public class account {
    String userName;
    String password;
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
}
