package CollectionExample;

public class Account {
    private  int customerId;
    private double balance;
    private int accountId;

    public Account(int customerId, double balance, int accountId) {
        this.customerId = customerId;
        this.balance = balance;
        this.accountId = accountId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    public double Diposite(double amount){
        this.balance=this.balance+amount;
        return balance;
    }
    public double Withdraw(double amount){
        this.balance=this.balance-amount;
        return balance;
    }
}
