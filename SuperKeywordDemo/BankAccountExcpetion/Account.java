package BankAccountExcpetion;

public class Account {
    private int accountId;
    private double balance;
    private int customerId;

    public Account(int accountId, double balance, int customerId) {
        super();
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


    public double deposite( double addBalance){
        balance=balance+addBalance;
        return balance;
    }

    public double Withdeowl(double subBalence) throws  BalanceException{
        if(balance-subBalence<=500){
            throw new BalanceException("Sorry you don't have enough balance ");
        }
        else{
            balance=balance-subBalence;
        }
        return balance;
    }
}
