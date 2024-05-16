
public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance =this.balance+ amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance =this.balance- amount;
            return true;
        } else {
            return false;
        }
    }

    public double checkBalance() {
        return this.balance;
    }
}



