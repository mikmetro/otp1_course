package Account;

public class Account {
    private double balance;

    Account() {
        this.balance = 0;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double withdraw(double amount) {
        if (amount > this.balance) {
            return 0.0;
        }
        this.balance -= amount;
        return this.balance;
    }

    public double getBalance() {
        return balance;
    }
}
