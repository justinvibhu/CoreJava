package com;

public class Account {
    protected int accountId;
    protected int customerId;
    protected double balence;


    public Account(int accountId, int customerId, double balence) {
        this.accountId = accountId;
        this.customerId = customerId;
        this.balence = balence;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getBalence() {
        return balence;
    }

    public void setBalence(double balence) {
        this.balence = balence;
    }
}
