package DemoCodeSet;

public class Account {
private int accountId;
private double balance;
private int customerId;

    public Account(int accountId, double balance, int customerId) {
        this.accountId = accountId;
        this.balance = balance;
        this.customerId = customerId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
