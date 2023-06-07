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

    public int deposit(int amount){
        return 0;
    }
    public int withdraw(int amount){
        return 0;
    }
    public int checkBalance(){
        return balance;
    }
}
