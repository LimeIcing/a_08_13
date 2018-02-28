public class BankAccount13 {
    private String name;
    private double balance;
    private double transactionFee;

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        double toWithdraw = amount + transactionFee;

        if (toWithdraw <= balance) {
            balance = balance - toWithdraw;
        } else {
            System.out.println("Account balance too low to make the desired withdrawal.");
        }
    }

    public void transfer(BankAccount13 recipient, double amount) {
        if (this.balance > 5 + amount) {
            this.balance = this.balance - amount - 5;
            recipient.balance = recipient.balance + amount;
        } else if (this.balance > 5) {
            recipient.balance = recipient.balance + this.balance;
            this.balance = 0;
        }
    }

    @Override
    public String toString() {
        return name + ", $" + balance;
    }
}